package day1801_����;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;

import day1403���л�.student;

public class Runner {
	private static ArrayList<String> list=new ArrayList<>();
	static {
		try {
			BufferedReader in= new BufferedReader(//���ʱ�Զ�����
					new InputStreamReader(//����ת����
							new FileInputStream("d:/config.txt")));//������
			String line;
			while ((line = in.readLine()) !=null) {
				line=line.trim();
				if (line.length()==0) {
					continue;
				}
				list.add(line);
			}
			in.close();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println("���������ļ�ʧ��");
			e.printStackTrace();
		}
	}
public static void main(String[] args) throws Exception {
	Runner.launch();
}
private static void launch() throws Exception {
	for (String s : list) {
		//��"day1801.A;a"---->["day1801.A";"a"]
		String [] a=s.split(";");
		//���"�����"
		Class<?> c=Class.forName(a[0]);
		//�����½�ʵ��
		Object o1=c.newInstance();
		//��ȡ������
		Method t=c.getMethod(a[1]);
		//������÷���
		t.invoke(o1);
		
	}
}	
}
