package day1302�ļ��Ĳ�������;

import java.io.File;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		System.out.println("����һ���ļ���");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (! dir.isDirectory()) {
			System.out.println("���ԣ���������ȷ���ļ���");
			return;
		}
		String [] names=dir.list();//�ļ�����������
		File[] files=dir.listFiles();//file�ļ�ʵ������
		if (names==null) {
			System.out.println("����ļ��б�ʧ��");
			return;
		}
		for (int i = 0; i < files.length; i++) {
			File f=files[i];
			System.out.println(f.getName()+"-"+f.length());
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
