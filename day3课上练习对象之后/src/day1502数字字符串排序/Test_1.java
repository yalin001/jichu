package day1502数字字符串排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Test_1 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	Collections.addAll(list, "1","31","30","01","10","20");
	System.out.println(list);
	//集合排序
	Collections.sort(list);
	System.out.println(list);
	
	Comparator<String> c=new Comparator<String>() {
		//返回值int，比较o1与o2的大小，o1大正数，o2大则负数，相等为零
		@Override
		public int compare(String o1, String o2) {
			int a=Integer.parseInt(o1);
			int b=Integer.parseInt(o2);
		
				return a-b;
	
	
		}
		
	};
	Collections.sort(list,new Comparator<String>(
			) {
				@Override
				public int compare(String o1, String o2) {
					int a=Integer.parseInt(o1);
					int b=Integer.parseInt(o2);
						return a-b;
				}
	});
	System.out.println(list);
	for ( Iterator<String> it = list.iterator(); it.hasNext(); ) {
		String s = it.next();
		System.out.println(s);
	}
	System.out.println("----------------");
	for (String s: list) {
		System.out.println(s);
	}
   }
}
