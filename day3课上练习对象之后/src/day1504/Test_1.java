package day1504;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test_1 {
public static void main(String[] args) throws Exception {
	//Unicode
	  System.out.println('\u0061');
	  System.out.println('\u4e2d');
	  System.out.println('\u859B');
	  System.out.println('\u4E9A');
	  System.out.println('\u6797');
	  
	  OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("d:/abc/f3"),"Unicode");
	  OutputStreamWriter out1 = new OutputStreamWriter(new FileOutputStream("d:/abc/f4"),"GBK");
	  OutputStreamWriter out2 = new OutputStreamWriter(new FileOutputStream("d:/abc/f5"),"UTF-8");
	  out.write("a÷–—¶—«¡÷");
	  out.close();
	  out1.close();
	  out2.close();
}
}
