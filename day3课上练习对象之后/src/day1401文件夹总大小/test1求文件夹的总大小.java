package day1401�ļ����ܴ�С;

import java.io.File;
import java.util.Scanner;

public class test1���ļ��е��ܴ�С {

	public static void main(String[] args) {

		System.out.println("�����ļ��У�");
		String s = new Scanner(System.in).nextLine();
		 File dir = new File (s);
		 if (! dir.isDirectory()) {
			System.out.println("��������ȷ���ļ���");
			return;
		}
		 long size=dirlength(dir);
		 System.out.println(size);
	}

	private static long dirlength(File dir) {
		File[] files=dir.listFiles();
		if (files==null) {
			return 0;
		}
		
		long sum=0;
		for (int i = 0; i < files.length; i++) {
			File f=files[i];
			if (f.isFile()) {
				sum+=f.length();
				
			}else {
				sum+=dirlength(f);
			}
		}
		
		return sum;
	}

}
