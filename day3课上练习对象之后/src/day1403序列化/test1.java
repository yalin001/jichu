package day1403���л�;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class test1 {

	public static void main(String[] args) throws Exception {
		student s=new student(9528, "�Ʋ���", "��", 21);
		FileOutputStream fos = new FileOutputStream("d:/abc/f2");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		//���Ա��һ�仰ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/abc/f2"));
		out.writeObject(s);
		out.close();
		
	}

}
