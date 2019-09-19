package day1704������;

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
					System.out.println("��������8000�˿���������");
					while (true) {
						Socket s = ss.accept();
						TongXinThread t = new TongXinThread(s);
						t.start();
						System.out.println("һ���ͻ����Ѿ�����");
					}
				} catch (Exception e) {
					System.out.println("�����޷���8000�˿���������������쳣ֹͣ");
				}
			}
		}.start();//������,�����߳�
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

			in= new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));//������
			out=new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
			this.name=in.readLine();
			send("��ӭ��������������");
			//�ѵ�ǰͨ��ʵ����ӵ�list
			
			s.setSoTimeout(3000);//���ý������ݵĵȴ���ʱʱ��
			
			synchronized (list) {
				list.add(this);
			}
			//Ⱥ��һ��������Ϣ
			sendAll(name+"����,Ŀǰ������"+list.size());
			//����
			int count=0;
			String line;
			
			
			while (true) {
				try {
					line=in.readLine();
					count=0;
				} catch (SocketTimeoutException e) {
					send("��ϵͳ��Ϣ�������������");
					count++;
					if (count==4) {
						send("��ϵͳ��Ϣ�������Ѿ����߳�������");
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
			list.remove(this);//�ͻ��ѶϿ���ɾ����ǰʵ��	
		}

		sendAll(name+"���뿪��Ŀǰ������"+list.size());
	}
	}
public static void main(String[] args) {
	ChatServe s = new ChatServe();
	s.launch();
	
	
	
}
}