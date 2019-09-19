package day1801_反射;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) throws Exception {

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
		System.out.println("\n---------无参构造----------");
		f1(c);
		System.out.println("\n---------int参数构造----------");
		f2(c);
		

		
		
		
	}

	private static void f1(Class<?> c) {
		try {
			//反射新建实例，并执行无参构造  
			Object o1 = c.newInstance();
			System.out.println(o1);
			
		} catch (Exception e) {
			System.out.println("不能执行无参构造");
		}
		
		
		
	}

	private static void f2(Class<?> c) {
		try {
			//获得int的参数构造方法
			Constructor<?> t = c.getConstructor(int.class);
			Object o1 = t.newInstance(66);
			System.out.println(o1);
		} catch (Exception e) {
			System.out.println("不能执行int参数的构造方法");
		}
		
		
		
		
	}
}
