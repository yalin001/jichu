package day1201ǰ�ڰ󶨺��ڰ�;

public class Test_1 {

	public static void main(String[] args) {
		f(new A());
		f(new B());
		
	}
	static void f(A a) {
		/*
		 * ���ڰ󶨣������ڰ�
		 * ���������ڼ䣬ִ�е��˴���ʱ����̬�Ĵ����ൽ�������a����
		 */
		a.a();//������ִ��A.a��Ҳ����ִ��B.a��
		//�����;�̬��������ǰ�ڰ󶨣�
		//�Ǿ�̬�����Ǻ��ڰ󶨣������ڰ�
		a.b();//��ִ��A.a
		/*
		 * ����ǰ�ڰ�
		 * �����ڲ����ٲ��Ұ�
		 */
		System.out.println(a.v1);
	}
}
class A{
	int v1=1;
	void a() {
		System.out.println("A.a()");
	}
	static void b() {
		System.out.println("A.b()");
	}
}
class B extends A{
	int v1=2;
	void a() {
		System.out.println("B.a()");
	}
	static void b() {
		System.out.println("B.b()");
	}
}