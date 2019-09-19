package day1504;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;;


public class test输出Unicode所有中文 {

	public static void main(String[] args) throws Exception {
		System.out.println("--------");
		f1("d:/abc/f6","GBK");
		
		System.out.println("--------");
		f1("d:/abc/f7","UTF-8");
		
		
	}


	private static void f1(String path, String charset) throws Exception{
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),charset);
		int count=0;
		for (char i = '\u4e00'; i <='\u9fa5'; i++) {
			out.write(i);
			count++;
			if (count==30) {
				out.write('\n');
				count=0;
				
			}
			
		}
		out.close();
	}

}
