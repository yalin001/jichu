package day1402�ļ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class test3�ļ����� {

	public static void main(String[] args) {
		System.out.println("ԭ�ļ�;");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if (! from.isFile()) {
			System.out.println("��������ȷ���ļ�����������׺��");
			return;
		}
		System.out.println("����ļ�λ�ü�����;");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if (to.isDirectory()) {
			System.out.println("��ָ�������ļ�");
			return;
		}
		try {
		copy(from,to);
		System.out.println("���");
		
		}catch (Exception e) {
			System.out.println("ʧ��");	
			e.printStackTrace();
		}
	}

	private static void copy(File from, File to) throws Exception {
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to);
		
//		int b;
//		while ((b= in.read()) !=-1) {
//			out.write(b);
//		}
		byte [] buff=new byte[8192];
		int n;//���ÿһ�����ֽ�����
		while ((n=in.read(buff)) !=-1) {
			out.write(buff,0,n);
			
		}
		in.close();
		out.close();
	}

}
