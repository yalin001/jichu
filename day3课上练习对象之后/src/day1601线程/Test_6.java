package day1601线程;

public class Test_6 {
public static void main(String[] args) {
	R1 r1=new R1();
	
	Thread t1 = new Thread(r1);//
	/*
	 * r1.run();
	 * r1.add()每次都++两个，即加2，但是会出现一个i++没有时间片
	 */
	t1.start();
	
	while (true) {
		int i=r1.get();
		if (i%2==1) {
			System.out.println(i);
			System.exit(0);//退出虚拟机固定语句，0是自己决定
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
