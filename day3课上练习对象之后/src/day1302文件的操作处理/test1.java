package day1302文件的操作处理;

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
		System.out.println(f.getAbsolutePath());//完整路径
		System.out.println(f.exists());//文件是否存在
		System.out.println(f.isFile());//是否是文件
		System.out.println(f.isDirectory());//是否是文件夹
		System.out.println(f.length());//字节量，对文件夹无效
	}
}
