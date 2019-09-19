package day1403序列化;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class test1 {

	public static void main(String[] args) throws Exception {
		student s=new student(9528, "唐伯虎", "男", 21);
		FileOutputStream fos = new FileOutputStream("d:/abc/f2");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		//可以变成一句话ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/abc/f2"));
		out.writeObject(s);
		out.close();
		
	}

}
