package day1204λ����;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		System.out.println("����������");
		int n = new Scanner(System.in).nextInt();
		byte[] a=f1(n);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int r=f2(a);
		System.out.println(r);
	}

	private static int f2(byte[] a) {
		int r=0;
		for (int i = 0; i < a.length; i++) {
			r |= ((a[i]&0x000000ff))<<(8*(3-i));
		}
		return r;
	}

	private static byte[] f1(int n) {
		//32λ�ķֱ��ƶ�24,16,8,0��ǿת
		byte [] a=new byte [4];
		for (int i = 0; i < a.length; i++) {
			a[i]=(byte) (n>>(8*(3-i)));
		}
		return a;
	}

}
