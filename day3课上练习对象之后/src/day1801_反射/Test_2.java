package day1801_����;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) throws Exception {

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
		System.out.println("\n---------�޲ι���----------");
		f1(c);
		System.out.println("\n---------int��������----------");
		f2(c);
		

		
		
		
	}

	private static void f1(Class<?> c) {
		try {
			//�����½�ʵ������ִ���޲ι���  
			Object o1 = c.newInstance();
			System.out.println(o1);
			
		} catch (Exception e) {
			System.out.println("����ִ���޲ι���");
		}
		
		
		
	}

	private static void f2(Class<?> c) {
		try {
			//���int�Ĳ������췽��
			Constructor<?> t = c.getConstructor(int.class);
			Object o1 = t.newInstance(66);
			System.out.println(o1);
		} catch (Exception e) {
			System.out.println("����ִ��int�����Ĺ��췽��");
		}
		
		
		
		
	}
}
