package day1301�쳣;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class teat2�����쳣 {

	public static void main(String[] args) {
		try {
			f();
		} catch (ParseException e) {
			System.out.println("���ڸ�ʽ��������");
		} catch (IOException e) {
			System.out.println("����·����������");
		}
	}

	private static void f() throws ParseException, IOException {
		System.out.println("���������� ��ʽ(yyyy-MM-dd)��");
		String d = new Scanner(System.in).nextLine();
		//SimpleDateFormat���ַ������ڽ�����date��
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		//ǿ�ƴ����쳣������ʵ�ֿ����쳣��δ���������������(��������Ա����������ϵͳ�Ľ�������������ü���ѡthrows)
		//��parse���ַ���������Date
		System.out.println(s);//���s����ʵ���ĵ�ַ
		Date p = s.parse(d);
		String path="d:\\"+p.getTime()+".txt";
		File file=new File(path);
		file.createNewFile();
		System.out.println("�ļ��Ѵ�����"+path);
		
	}

}
