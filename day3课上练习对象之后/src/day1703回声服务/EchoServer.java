package day1703回声服务;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.InflaterInputStream;

public class EchoServer {
public void launch() {
	new Thread() {
		@Override
		public void run() {
			try {
				ServerSocket ss = new ServerSocket(8000);
				System.out.println("服务器在8000端口上已启动");
				while (true) {
					Socket s = ss.accept();
					TongXinThread t = new TongXinThread(s);
					t.start();
					System.out.println("一个客户端已经连接");
				}
			} catch (Exception e) {
				System.out.println("服务无法在8000端口启动，或服务器异常停止");
			}
		}
	}.start();//匿名类,增加线程
}
class TongXinThread extends Thread{
	//通信流程。数据格式使用UTF-8编码的字符串，每一条数据的末尾有一条换行符
	//网络流：s.getoutputstream和s.getinputstream
	//编码转换流 InputStramReader和OutputStreamWriter
	//读取一行文本：BufferendReader,readLine()
	//输出数据自动添加换行：PrintWriter Println()
	//BR(处理换行)---ISR(字码转换流)--网络输入流
	//PW(PrintWriter处理换行)---OSR(字码转换流)--网络输出流
	Socket s;
	public TongXinThread(Socket s) {
		this.s=s;
	}
	@Override
	public void run() {
		try {
			BufferedReader in;
			PrintWriter out;
			in= new BufferedReader(//输出时自动换行
					new InputStreamReader(//编码转换流
							s.getInputStream(),"UTF-8"));//网络流
			out=new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
			String line;
			while ((line=in.readLine()) !=null) {
				out.println(line);
				out.flush();
			}
			//出现null值表示断开
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("客户端已断开");
	}
}
public static void main(String[] args) {
	EchoServer s = new EchoServer();
	s.launch();
}
}
