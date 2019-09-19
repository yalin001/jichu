package day1801_反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test_1 {
public static void main(String[] args) throws Exception{
	System.out.println("请输入类名： ");
	String s = new Scanner(System.in).nextLine();
	 Class<?> c=Class.forName(s);
	System.out.println(c.getName());
	System.out.println(c.getPackage().getName());
	System.out.println(c.getSimpleName());
/*
 * java.util.Date
 * java.lang.String
 * java.io.File
 */
	System.out.println("\n---------成员变量----------");
	f1(c);
	System.out.println("\n---------构造方法----------");
	f2(c);
	System.out.println("\n---------方法----------");
	f3(c);
	
	
}

private static void f1(Class<?> c) {
	/*
	 * Field类封装变量的定义信息
	 * private,static int a都被封装
	 */
	Field[] a = c.getDeclaredFields();
	for (Field f : a) {
		String t=f.getType().getSimpleName();
		String n=f.getName();
		System.out.println(t+""+n);
}
}
private static void f2(Class<?> c) {
	/*
	 * Constructor类，封装构造方法的定义信息
	 * public A(int,String) throws X,Y
	 */
	Constructor<?>[] a = c.getDeclaredConstructors();
	for (Constructor<?> t : a) {
		String n = c.getSimpleName();
		Class<?>[] p = t.getParameterTypes();
		System.out.println(n+"("+Arrays.toString(p)+")");
		
	}
		
	
	
}

private static void f3(Class<?> c) {
	/*
	 *Method类，封装方法的定义信息
	 *public int f(int,String) throws X,Y 
	 */
	Method[] a = c.getDeclaredMethods();
	for (Method t : a) {
		String n = t.getName();
		Class<?>[] p = t.getParameterTypes();
		System.out.println(n+"("+Arrays.toString(p)+")");
	}
	
}
}
