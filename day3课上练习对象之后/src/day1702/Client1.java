package day1702;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
public static void main(String[] args) throws Exception, Exception {
		System.out.println("向服务器连接");
		Socket s = new Socket("所需连接的服务器IP地址",8000);
		System.out.println("已经建立连接");
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
