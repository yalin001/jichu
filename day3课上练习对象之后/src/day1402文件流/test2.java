package day1402�ļ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test2 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("d:/abc/f1");
//		int c;
//		while (true) {
//			c=in.read();
//			if (c==-1) {
//				break;
//			}
//			System.out.println(c);
//		}
		//Ƕ�׵�С����
		int b;
		while ((b=in.read()) !=-1) {
			System.out.println(b);
		}
		in.close();
	}

}
