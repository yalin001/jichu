package day1601�߳�;

public class Test_6 {
public static void main(String[] args) {
	R1 r1=new R1();
	
	Thread t1 = new Thread(r1);//
	/*
	 * r1.run();
	 * r1.add()ÿ�ζ�++����������2�����ǻ����һ��i++û��ʱ��Ƭ
	 */
	t1.start();
	
	while (true) {
		int i=r1.get();
		if (i%2==1) {
			System.out.println(i);
			System.exit(0);//�˳�������̶���䣬0���Լ�����
		}
	}
	
	
}
static class R1 implements Runnable{
	static int i;
	void add() {
		i++;
		i++;
	}
	int get() {
		return i;
	}
	@Override
	public void run() {
		
		while (true) {
			add();
			
		}
	}
}
}
