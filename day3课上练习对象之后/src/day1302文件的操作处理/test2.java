package day1302�ļ��Ĳ�������;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) throws Exception {
		System.out.println("�س�ִ��");
		new Scanner(System.in).nextLine();
		File dir = new File("d:/abc/aa");
		dir.mkdirs();
		System.out.println("�Ѿ���������ļ���");
		new Scanner(System.in).nextLine();
		File file = new File(dir,"f1");
		file.createNewFile();
		System.out.println("�Ѿ������ļ�");
		new Scanner(System.in).nextLine();
	    file.delete();
	    System.out.println("�Ѿ�ɾ���ļ�");
	    new Scanner(System.in).nextLine();
	    dir.delete();
	}

}
