package day1203ʿ����Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		System.out.println("��Ҫ����ʿ����");
		int n = new Scanner(System.in).nextInt();
		ArrayList<Soldier> list=
				new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new Soldier(i+1));
			
		}
		System.out.println("���س�����");
		//�����д���
		while (list.size() !=0) {
			new Scanner(System.in).nextLine();
//			for (int i = 0; i < list.size(); i++) {
//				Soldier s = list.get(i);
//				s.attack();
//				if (s.blood==0) {
//					list.remove(i);
//					i--;
//				}
//			}
			for (Iterator it = list.iterator(); it.hasNext();) {
				Soldier s = (Soldier) it.next();
				s.attack();
				if (s.blood==0) {
					it.remove();
				}
			}
			System.out.println("ʿ��������"+list.size());
		}
	}
}
