package day1204λ����;

import java.util.Scanner;

public class test3λ���� {

	public static void main(String[] args) {
		System.out.println("������������");
		int n = new Scanner(System.in).nextInt();
		
		n=f(n);
		System.out.println("��ߵ�24Ϊ��Ϊ��֮��"+n);
	}

	private static int f(int n) {
		String s=Integer.toBinaryString(n);
		System.out.println("ʮ����ת������Ϊ�� "+s);
		//����һ��λ������
		//int r=n<<24>>>24;
		//return r;
		//������
		int r= n & 0xff;//λ������
		return r;
	}

}
