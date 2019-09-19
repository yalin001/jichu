package day1301异常;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		while (true) {
			try {
				f();
				System.out.println("顺序");
				break;//try的第一句和catch连接
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("整数输入格式错误,请输入两个整数");
			}catch (ArithmeticException e) {
			System.out.println("数学运算错误，不能除0");
		    }catch(Exception e){
			System.out.println("出错请重视");
		    }finally {
			System.out.println("------------------");
		    }
		}
		
	}
	private static void f() {
		System.out.println("输入两个整数,用.隔开:");
		String n = new Scanner(System.in).nextLine();
		String[] s = n.split("\\.");
		int n1 = Integer.parseInt(s[0]);
		int n2 = Integer.parseInt(s[1]);
		int r=n1/n2;
		System.out.println(r);
	}

}
