package day1302文件的操作处理;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) throws Exception {
		System.out.println("回车执行");
		new Scanner(System.in).nextLine();
		File dir = new File("d:/abc/aa");
		dir.mkdirs();
		System.out.println("已经创建多层文件夹");
		new Scanner(System.in).nextLine();
		File file = new File(dir,"f1");
		file.createNewFile();
		System.out.println("已经创建文件");
		new Scanner(System.in).nextLine();
	    file.delete();
	    System.out.println("已经删除文件");
	    new Scanner(System.in).nextLine();
	    dir.delete();
	}

}
