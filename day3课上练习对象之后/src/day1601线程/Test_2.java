package day1601�߳�;

import day1601�߳�.Test_1.T1;

public class Test_2 {
public static void main(String[] args) {
	R1 r1=new R1();
	Thread t1=new Thread (r1);
	Thread t2=new Thread(r1);
    //�����̣߳��߳��������Զ�ִ��r1.run()��������
    t1.start();
    t2.start();
}
	static class 	R1 implements Runnable{

		@Override
		public void run() {
			//�������ִ�д���ĵ�ǰ�߳�ʵ��
			Thread t = Thread.currentThread();
			//����߳���
			t.getName();
			String n = t.getName();
			//1-1000
			for (int i = 1; i < 10; i++) {
				System.out.println(n+"-"+i);
			}
		}
		
	}


}
