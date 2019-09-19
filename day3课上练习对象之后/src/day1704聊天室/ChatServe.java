package day1704聊天室;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class ChatServe {
	private ArrayList<TongXinThread> list = new ArrayList<>();
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
		Socket s; 
		BufferedReader in;
		PrintWriter out;
		private String name;
		public TongXinThread(Socket s) {
			this.s=s;
		}
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}
		public void sendAll(String msg) {
			synchronized (list) {
				for (TongXinThread t:list) {
					t.send(msg);
				}
			}
		}
		@Override
		public void run() {
		try{

			in= new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));//网络流
			out=new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
			this.name=in.readLine();
			send("欢迎进入热情聊天室");
			//把当前通信实例添加到list
			
			s.setSoTimeout(3000);//设置接收数据的等待超时时常
			
			synchronized (list) {
				list.add(this);
			}
			//群发一个上限消息
			sendAll(name+"进入,目前人数："+list.size());
			//聊天
			int count=0;
			String line;
			
			
			while (true) {
				try {
					line=in.readLine();
					count=0;
				} catch (SocketTimeoutException e) {
					send("【系统消息】：请积极聊天");
					count++;
					if (count==4) {
						send("【系统消息】：您已经被踢出聊天室");
						s.close();
						break;
					}
				
					continue;
				}
				
				
				if (line== null) {
					break;
				}
				sendAll(line);
			}
		}catch(Exception e){
			
		}
		synchronized (list) {
			list.remove(this);//客户已断开，删除当前实例	
		}

		sendAll(name+"已离开，目前人数："+list.size());
	}
	}
public static void main(String[] args) {
	ChatServe s = new ChatServe();
	s.launch();
	
	
	
}
}