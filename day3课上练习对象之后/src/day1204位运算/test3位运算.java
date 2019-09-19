package day1204位运算;

import java.util.Scanner;

public class test3位运算 {

	public static void main(String[] args) {
		System.out.println("请输入整数：");
		int n = new Scanner(System.in).nextInt();
		
		n=f(n);
		System.out.println("左边的24为变为零之后："+n);
	}

	private static int f(int n) {
		String s=Integer.toBinaryString(n);
		System.out.println("十进制转二进制为： "+s);
		//方法一；位移运算
		//int r=n<<24>>>24;
		//return r;
		//方法二
		int r= n & 0xff;//位与运算
		return r;
	}

}
