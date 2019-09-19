package day1202哈希表的坐标点对应销售额;
import java.util.HashMap;
public class Test_1 {
	public static void main(String[] args) {
		Point a = new Point(1, 3);
		Point b = new Point(2, 5);
		HashMap<Point, String> map = new HashMap<Point, String>();
		map.put(a, "3.1亿\n");
		map.put(b, "4.9亿\n");
		System.out.println(map);
		System.out.println("----------");
		Point c = new Point(1, 3);
		map.put(c, "2.9亿元");
		System.out.println(map);
		System.out.println("----------");
		/*
		 * hashCode()
		 * 在object中默认使用内存地址作为哈希值
		 * 
		 * 哈希值相同才能保证计算出相同的下标
		 */
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		/*
		 * 即使计算出相同的下标位置，还需要用equals()也相同才能覆盖
		 * 
		 */
		System.out.println(a.equals(c));
	}

}
