package day1202��ϣ���������Ӧ���۶�;
import java.util.HashMap;
public class Test_1 {
	public static void main(String[] args) {
		Point a = new Point(1, 3);
		Point b = new Point(2, 5);
		HashMap<Point, String> map = new HashMap<Point, String>();
		map.put(a, "3.1��\n");
		map.put(b, "4.9��\n");
		System.out.println(map);
		System.out.println("----------");
		Point c = new Point(1, 3);
		map.put(c, "2.9��Ԫ");
		System.out.println(map);
		System.out.println("----------");
		/*
		 * hashCode()
		 * ��object��Ĭ��ʹ���ڴ��ַ��Ϊ��ϣֵ
		 * 
		 * ��ϣֵ��ͬ���ܱ�֤�������ͬ���±�
		 */
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		/*
		 * ��ʹ�������ͬ���±�λ�ã�����Ҫ��equals()Ҳ��ͬ���ܸ���
		 * 
		 */
		System.out.println(a.equals(c));
	}

}
