package day1503手写双向列表;

public class test1 {
public static void main(String[] args) {
	Mylist list = new Mylist();
	list.add("aaa");
	list.add("ttt");
	list.add("eee");
	list.add("hhh");
	list.add("222");
	list.add("nnn");
	list.add("ldkg");
	list.add("9999");
	list.add("aaa");
	list.add("ttt");
	list.add("eee");
	list.add("hhh");
	list.add("222");
	list.add("nnn");
	list.add("ldkg");
	list.add("9999");
	System.out.println(list.size());
	System.out.println(list.get(0));
	System.out.println(list.get(list.size()-1));
	System.out.println("-------------------");
	for (int i = 0; i < list.size(); i++) {
		Object s=list.get(i);
		System.out.println(s);
		
	}
}
}
