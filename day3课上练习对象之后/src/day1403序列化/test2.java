package day1403���л�;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

import day1202��ϣ��������Ӧѧ���ɼ�.Student;

public class test2 {

	public static void main(String[] args) throws Exception{
		ObjectInputStream in = new  ObjectInputStream(new FileInputStream("d:/abc/f2"));
		student stu = (student) in.readObject();
		System.out.println(stu);
		in.close();	
	}


}
