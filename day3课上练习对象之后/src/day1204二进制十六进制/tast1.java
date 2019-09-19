package day1204二进制十六进制;

import java.util.Scanner;

public class tast1 {

	public static void main(String[] args) {
	System.out.println("请输入一个整数");
	int n = new Scanner(System.in).nextInt();
	String s=Integer.toBinaryString(n);
	System.out.println("十进制转二进制为： "+s);
	System.out.println("---------");
	
	System.out.println("请输入二进制数");
	s = new Scanner(System.in).nextLine();
	n=Integer.parseInt(s, 2);
	System.out.println("二进制转十进制为： "+n);
	}

}
