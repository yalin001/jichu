package day1801_����;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test_3 {
public static void main(String[] args) throws Exception{
	Class<Student> c=Student.class;
	Student s = new Student();
	System.out.println(s);
	//��ȡgender����
	Field g = c.getDeclaredField("gender");
	g.setAccessible(true);//ʹ˽�б������Է���
	g.set(s,"��");//���丳ֵ
	System.out.println(s);
	
	Object r=g.get(s);//����ȡֵ
	System.out.println(r);
	
	
	//setAge,getAge
	
	//��ȡ����
	Method setage = c.getMethod("setAge", int.class);
	Method getage = c.getMethod("getAge");
	setage.invoke(s, 22);//������÷���
	System.out.println(s);
	
	Object returnValue=getage.invoke(s);
	System.out.println(returnValue);
	
}
}
