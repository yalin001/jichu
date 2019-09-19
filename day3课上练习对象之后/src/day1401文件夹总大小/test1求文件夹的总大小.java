package day1401文件夹总大小;

import java.io.File;
import java.util.Scanner;

public class test1求文件夹的总大小 {

	public static void main(String[] args) {

		System.out.println("输入文件夹：");
		String s = new Scanner(System.in).nextLine();
		 File dir = new File (s);
		 if (! dir.isDirectory()) {
			System.out.println("请输入正确的文件夹");
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
