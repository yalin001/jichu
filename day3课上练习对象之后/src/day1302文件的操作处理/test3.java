package day1302文件的操作处理;

import java.io.File;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		System.out.println("输入一个文件夹");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (! dir.isDirectory()) {
			System.out.println("不对，请输入正确的文件夹");
			return;
		}
		String [] names=dir.list();//文件夹名字数组
		File[] files=dir.listFiles();//file文件实例数组
		if (names==null) {
			System.out.println("获得文件列表失败");
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
