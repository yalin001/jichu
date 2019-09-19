package day1301自定义异常;

import java.util.Scanner;

public class Test_5自定义异常 {

	public static void main(String[] args) {
		System.out.println("请输入用户名");
		String a = new Scanner(System.in).nextLine();
		System.out.println("请输入密码");
		String b = new Scanner(System.in).nextLine();
		try {
			login(a,b);
			System.out.println("欢迎登陆");
		} catch (UsernameNotFoundException e) {
			System.out.println("用户名错误");
	} catch (WrongPasswordException e) {
		System.out.println("密码错误");
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