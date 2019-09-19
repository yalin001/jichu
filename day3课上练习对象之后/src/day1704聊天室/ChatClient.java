package day1704聊天室;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ChatClient {
	Socket s;
	BufferedReader in;
	PrintWriter out;
	String name;
	LinkedList<String> list= new LinkedList<>();
	boolean flag;//默认false
	public void launch() {
		try {
			s=new Socket("176.46.15.252",8000);
			in= new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));//网络流
			out=new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
			System.out.println("给自己起个名字：");
			name = new Scanner(System.in).nextLine();
			out.println(name);
			out.flush();
			//多次在控制台输入聊天,增加输入线程
			new Thread() {
				@Override
				public void run() {
					
					input();
				}
			}.start();
			//反复从服务器接收聊天数据，接收输出线程
			new Thread() {
				@Override
				public void run() {
				receiver();	
				}
			}.start();
			new Thread() {
				@Override
				public void run() {
					print();
				}
			}.start();
		} catch (Exception e) {
			System.out.println("无法连接聊天室服务器");
			e.printStackTrace();
		}
	}
protected void print() {
	while (true) {
		
		synchronized (list) {
			while (list.isEmpty() || flag) {
				try {
					list.wait();
				} catch (InterruptedException e) {
					
					
				}
			}
			String msg = list.removeFirst();
			System.out.println(msg);
		}
	}
	
	
	}
protected void receiver() {
	try {
		String line;
		while ((line=in.readLine()) !=null) {
			synchronized (list) {
				list.add(line);	
				list.notifyAll();
				
			}
		}
		
	} catch (Exception e) {
		
		
	}
	System.out.println("已经与服务器断开连接");
	
	}

protected void input() {
	System.out.println("按回车发送");
	new Scanner(System.in).nextLine();
	flag=true;//打开输入开关,正在输入
	
	while (true) {
		System.out.println("输入聊天内容：");
		String str = new Scanner(System.in).nextLine();
		out.println(str);
		out.flush();
		flag=false;
		synchronized (list) {
			list.notifyAll();
		}
		
	}
	
	
	}

public static void main(String[] args) {
	ChatClient c=new ChatClient();
	c.launch();
}
}
