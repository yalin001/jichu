package day1302�ļ��Ĳ�������;

import java.io.File;

public class test1 {

	public static void main(String[] args) {
		String path;
		path = "E:\\eclipse2\\eclipse\\day1.txt";
		//path = "E:\\eclipse2\\eclipse\\eclipse.ini";
		//path = "E:/eclipse2/eclipse";
		//path = "X:/x";
		File f = new File(path);
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());//����·��
		System.out.println(f.exists());//�ļ��Ƿ����
		System.out.println(f.isFile());//�Ƿ����ļ�
		System.out.println(f.isDirectory());//�Ƿ����ļ���
		System.out.println(f.length());//�ֽ��������ļ�����Ч
	}
}
