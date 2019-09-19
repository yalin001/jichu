package day1403序列化;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

import day1202哈希表坐标点对应学生成绩.Student;

public class test2 {

	public static void main(String[] args) throws Exception{
		ObjectInputStream in = new  ObjectInputStream(new FileInputStream("d:/abc/f2"));
		student stu = (student) in.readObject();
		System.out.println(stu);
		in.close();	
	}


}
