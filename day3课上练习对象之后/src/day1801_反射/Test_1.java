package day1801_����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test_1 {
public static void main(String[] args) throws Exception{
	System.out.println("������������ ");
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
	System.out.println("\n---------��Ա����----------");
	f1(c);
	System.out.println("\n---------���췽��----------");
	f2(c);
	System.out.println("\n---------����----------");
	f3(c);
	
	
}

private static void f1(Class<?> c) {
	/*
	 * Field���װ�����Ķ�����Ϣ
	 * private,static int a������װ
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
	 * Constructor�࣬��װ���췽���Ķ�����Ϣ
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
	 *Method�࣬��װ�����Ķ�����Ϣ
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
