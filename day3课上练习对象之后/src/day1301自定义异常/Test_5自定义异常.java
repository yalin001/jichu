package day1301�Զ����쳣;

import java.util.Scanner;

public class Test_5�Զ����쳣 {

	public static void main(String[] args) {
		System.out.println("�������û���");
		String a = new Scanner(System.in).nextLine();
		System.out.println("����������");
		String b = new Scanner(System.in).nextLine();
		try {
			login(a,b);
			System.out.println("��ӭ��½");
		} catch (UsernameNotFoundException e) {
			System.out.println("�û�������");
	} catch (WrongPasswordException e) {
		System.out.println("�������");
	}

}

	private static void login(String a, String b) throws UsernameNotFoundException,WrongPasswordException{
		if (! a.equals("abc")) {
			throw new UsernameNotFoundException();
		}
		if (! b.equals("123")) {
			throw new WrongPasswordException();
		}
	}
}