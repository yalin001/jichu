package day1301�쳣;

import java.util.Scanner;

public class test3�ֶ��׳��쳣 {

	public static void main(String[] args) {
		f();

	}
	private static void f() {
		System.out.println("����������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double c=divie(a,b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("���ܳ����������ǵĴ�������������");
			e.printStackTrace();
		}		
	}
	private static double divie(double a, double b) {
		if (b==0) {
		ArithmeticException e =new 
				ArithmeticException("/by zero");//��������ʾ����()
		throw e;
		}
		return a/b;
	}

}
