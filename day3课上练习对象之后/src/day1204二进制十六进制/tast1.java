package day1204������ʮ������;

import java.util.Scanner;

public class tast1 {

	public static void main(String[] args) {
	System.out.println("������һ������");
	int n = new Scanner(System.in).nextInt();
	String s=Integer.toBinaryString(n);
	System.out.println("ʮ����ת������Ϊ�� "+s);
	System.out.println("---------");
	
	System.out.println("�������������");
	s = new Scanner(System.in).nextLine();
	n=Integer.parseInt(s, 2);
	System.out.println("������תʮ����Ϊ�� "+n);
	}

}
