package day1402文件流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class test5文件加密解密 {
public static void main(String[] args) {
	System.out.println("原文件;");
	String s1 = new Scanner(System.in).nextLine();
	File from = new File(s1);
	if (! from.isFile()) {
		System.out.println("请输入正确的文件名，包含后缀名");
		return;
	}
	System.out.println("输出文件位置及名称;");
	String s2 = new Scanner(System.in).nextLine();
	File to = new File(s2);
	if (to.isDirectory()) {
		System.out.println("请指定具体文件包括文件的名字");
		return;
	}
	if (! to.getParentFile().exists()) {
			System.out.println("父文件夹不存在");
			return;
		}
		System.out.println("KEY");
		int key = new Scanner(System.in).nextInt();
		try {
			encryptCopy(from,to,key);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
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