package day1301�쳣;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		while (true) {
			try {
				f();
				System.out.println("˳��");
				break;//try�ĵ�һ���catch����
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("���������ʽ����,��������������");
			}catch (ArithmeticException e) {
			System.out.println("��ѧ������󣬲��ܳ�0");
		    }catch(Exception e){
			System.out.println("����������");
		    }finally {
			System.out.println("------------------");
		    }
		}
		
	}
	private static void f() {
		System.out.println("������������,��.����:");
		String n = new Scanner(System.in).nextLine();
		String[] s = n.split("\\.");
		int n1 = Integer.parseInt(s[0]);
		int n2 = Integer.parseInt(s[1]);
		int r=n1/n2;
		System.out.println(r);
	}

}
