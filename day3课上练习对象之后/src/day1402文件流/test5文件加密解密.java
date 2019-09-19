package day1402�ļ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class test5�ļ����ܽ��� {
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
		System.out.println("��ָ�������ļ������ļ�������");
		return;
	}
	if (! to.getParentFile().exists()) {
			System.out.println("���ļ��в�����");
			return;
		}
		System.out.println("KEY");
		int key = new Scanner(System.in).nextInt();
		try {
			encryptCopy(from,to,key);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
}
private static void encryptCopy(File from, File to, int key) throws Exception {
	FileInputStream in = new FileInputStream(from);
	FileOutputStream out = new FileOutputStream(to);
	byte [] buff=new byte[8192];
	int n;
	while ((n=in.read(buff)) !=-1) {
		for (int i = 0; i < n; i++) {
			buff [i] ^=key;
		}
		out.write(buff,0,n);
	}
	in.close();
	out.close();
}
}