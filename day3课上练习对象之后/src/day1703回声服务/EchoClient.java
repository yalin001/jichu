package day1703��������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient{
			public static void main(String[] args) throws Exception, IOException {
				Socket s = new Socket("176.46.15.252",8000);
				BufferedReader in;
				PrintWriter out;
				in= new BufferedReader(//���ʱ�Զ�����
						new InputStreamReader(//����ת����
								s.getInputStream(),"UTF-8"));//������
				out=new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
				
				while (true) {
					System.out.println("���룺");
					String str = new Scanner(System.in).nextLine();
					out.println(str);
					out.flush();
					String echo=in.readLine();
					System.out.println("�س�"+echo);
				}				
				}
			}
			
