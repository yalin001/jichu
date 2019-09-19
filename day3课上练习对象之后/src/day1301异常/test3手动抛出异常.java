package day1301异常;

import java.util.Scanner;

public class test3手动抛出异常 {

	public static void main(String[] args) {
		f();

	}
	private static void f() {
		System.out.println("请输入两个浮点数");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double c=divie(a,b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("不能除以零是我们的错，请输入非零除数");
			e.printStackTrace();
		}		
	}
	private static double divie(double a, double b) {
		if (b==0) {
		ArithmeticException e =new 
				ArithmeticException("/by zero");//里面是提示例如()
		throw e;
		}
		return a/b;
	}

}
