package day1702;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("������8000�˿���������");
		System.out.println("�ȴ��ͻ��˷�������");
		Socket s=ss.accept();
		System.out.println("�ͻ����Ѿ�����");
		InputStream in=s.getInputStream();
		OutputStream out=s.getOutputStream();
		/*
		 * ͨѶЭ���������
		 * 1.ͨѶ��ִ������
		 * 2.���ݸ�ʽ
		 * 
		 */
		for (int i = 0; i <5; i++) {
			char c=(char) in.read();
			System.out.print(c);
			
		}
		out.write("world".getBytes());//���ַ�ֵת��һ���ֽ�ֵ������"abc��"��0061 0062 0063ת��byte��61 62 63���ڴ���
		out.flush();//ˢ������ 
		s.close();
		ss.close();
			
}
}
