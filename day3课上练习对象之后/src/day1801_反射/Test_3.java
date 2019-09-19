package day1801_反射;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test_3 {
public static void main(String[] args) throws Exception{
	Class<Student> c=Student.class;
	Student s = new Student();
	System.out.println(s);
	//获取gender变量
	Field g = c.getDeclaredField("gender");
	g.setAccessible(true);//使私有变量可以访问
	g.set(s,"男");//反射赋值
	System.out.println(s);
	
	Object r=g.get(s);//反射取值
	System.out.println(r);
	
	
	//setAge,getAge
	
	//获取方法
	Method setage = c.getMethod("setAge", int.class);
	Method getage = c.getMethod("getAge");
	setage.invoke(s, 22);//反射调用方法
	System.out.println(s);
	
	Object returnValue=getage.invoke(s);
	System.out.println(returnValue);
	
}
}
