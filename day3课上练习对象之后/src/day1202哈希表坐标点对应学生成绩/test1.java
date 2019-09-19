package day1202哈希表坐标点对应学生成绩;

import java.util.HashMap;

public class test1 {

	public static void main(String[] args) {
		Student a=new Student("郭金", 666, "男", 100);
		Student b=new Student("学林", 888, "男", 99);
		Student d=b;
		HashMap<Student, String> map = new HashMap<Student,String>();
		map.put(a, "满分\n");
		map.put(b, "及格\n");
		System.out.println(map);
		System.out.println("--------");
		Student c=new Student("老贾", 888, "男", 62);
		map.put(c, "不及格");
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
