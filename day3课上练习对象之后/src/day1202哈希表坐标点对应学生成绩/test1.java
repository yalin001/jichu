package day1202��ϣ��������Ӧѧ���ɼ�;

import java.util.HashMap;

public class test1 {

	public static void main(String[] args) {
		Student a=new Student("����", 666, "��", 100);
		Student b=new Student("ѧ��", 888, "��", 99);
		Student d=b;
		HashMap<Student, String> map = new HashMap<Student,String>();
		map.put(a, "����\n");
		map.put(b, "����\n");
		System.out.println(map);
		System.out.println("--------");
		Student c=new Student("�ϼ�", 888, "��", 62);
		map.put(c, "������");
		System.out.println(map);
		System.out.println("----------");
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(a));
		System.out.println(map.get(b));
		System.out.println(map.remove(c));
		System.out.println(map.remove(d));
		System.out.println(map);
	}

}
