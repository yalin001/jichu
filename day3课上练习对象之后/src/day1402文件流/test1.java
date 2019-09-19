package day1402文件流;

import java.io.FileOutputStream;

public class test1 {

	public static void main(String[] args) throws Exception {
		/*
		 * 新建一个
		 */
		FileOutputStream out = new FileOutputStream("d:/abc/f1");
		
		out.write(97);//00 00 00 61---->61
		out.write(98);//
		out.write(99);//
		out.write(356);//
		byte[] a= {
			101,102,103,104,105,106,107,108,109,110	
		};
		out.write(a,0,10);
		out.write(a,3,4);
		out.close();
		
	}

}
