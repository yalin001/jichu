package day1704������;

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
	boolean flag;//Ĭ��false
	public void launch() {
		try {
			s=new Socket("176.46.15.252",8000);
			in= new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));//������
			out=new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
			System.out.println("���Լ�������֣�");
			name = new Scanner(System.in).nextLine();
			out.println(name);
			out.flush();
			//����ڿ���̨��������,���������߳�
			new Thread() {
				@Override
				public void run() {
					
					input();
				}
			}.start();
			//�����ӷ����������������ݣ���������߳�
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
			System.out.println("�޷����������ҷ�����");
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
	System.out.println("�Ѿ���������Ͽ�����");
	
	}

protected void input() {
	System.out.println("���س�����");
	new Scanner(System.in).nextLine();
	flag=true;//�����뿪��,��������
	
	while (true) {
		System.out.println("�����������ݣ�");
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
