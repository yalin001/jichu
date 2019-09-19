package day1702;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("服务在8000端口上已启动");
		System.out.println("等待客户端发起连接");
		Socket s=ss.accept();
		System.out.println("客户端已经连接");
		InputStream in=s.getInputStream();
		OutputStream out=s.getOutputStream();
		/*
		 * 通讯协议包含内容
		 * 1.通讯的执行流程
		 * 2.数据格式
		 * 
		 */
		for (int i = 0; i <5; i++) {
			char c=(char) in.read();
			System.out.print(c);
			
		}
		out.write("world".getBytes());//把字符值转成一组字节值，例如"abc中"是0061 0062 0063转成byte的61 62 63便于传输
		out.flush();//刷出缓存 
		s.close();
		ss.close();
			
}
}
