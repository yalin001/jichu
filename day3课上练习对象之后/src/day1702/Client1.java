package day1702;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
public static void main(String[] args) throws Exception, Exception {
		System.out.println("�����������");
		Socket s = new Socket("�������ӵķ�����IP��ַ",8000);
		System.out.println("�Ѿ���������");
		InputStream in=s.getInputStream();
		OutputStream out=s.getOutputStream();
		
		out.write("hello".getBytes());
		out.flush();
		for (int i = 0; i < 5; i++) {
			char c=(char) in.read();
			System.out.print(c);
		}
	s.close();
}
}
