package day1501�ڲ���;

public class test2�ֲ��ڲ��� {
public static void main(String[] args) {
	Weapon w1 =f1();
	w1.kill();
	System.out.println(w1);
	
	Weapon w2 =f2("���콣");
	w2.kill();
	System.out.println(w2);
}

private static Weapon f2(final String name) {
	Weapon w = new Weapon(){//�����������ֻ࣬��ʹ��һ��
		//�ֲ������У�ʹ������ľֲ������������final
		//����������� final string name=name
		@Override
		public void kill() {
			System.out.println("ʹ��"+name+"����");
		}
	};//��������½����ķֺ�;
return w;
}
private static Weapon f1() {
	class AK47 implements Weapon{
		public void kill() {
			System.out.println("ʹ��AK47����");
		}
	}
	AK47 a= new AK47();
	return a;

}
}
