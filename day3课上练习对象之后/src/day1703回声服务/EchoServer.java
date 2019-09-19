package day1703��������;

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
	//ͨ�����̡����ݸ�ʽʹ��UTF-8������ַ�����ÿһ�����ݵ�ĩβ��һ�����з�
	//��������s.getoutputstream��s.getinputstream
	//����ת���� InputStramReader��OutputStreamWriter
	//��ȡһ���ı���BufferendReader,readLine()
	//��������Զ���ӻ��У�PrintWriter Println()
	//BR(������)---ISR(����ת����)--����������
	//PW(PrintWriter������)---OSR(����ת����)--���������
	Socket s;
	public TongXinThread(Socket s) {
		this.s=s;
	}
	@Override
	public void run() {
		try {
			BufferedReader in;
			PrintWriter out;
			in= new BufferedReader(//���ʱ�Զ�����
					new InputStreamReader(//����ת����
							s.getInputStream(),"UTF-8"));//������
			out=new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
			String line;
			while ((line=in.readLine()) !=null) {
				out.println(line);
				out.flush();
			}
			//����nullֵ��ʾ�Ͽ�
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("�ͻ����ѶϿ�");
	}
}
public static void main(String[] args) {
	EchoServer s = new EchoServer();
	s.launch();
}
}
