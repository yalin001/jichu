package day1601线程;

import day1601线程.Test_1.T1;

public class Test_2 {
public static void main(String[] args) {
	R1 r1=new R1();
	Thread t1=new Thread (r1);
	Thread t2=new Thread(r1);
    //启动线程，线程启动后，自动执行r1.run()方法代码
    t1.start();
    t2.start();
}
	static class 	R1 implements Runnable{

		@Override
		public void run() {
			//获得正在执行代码的当前线程实例
			Thread t = Thread.currentThread();
			//获得线程名
			t.getName();
			String n = t.getName();
			//1-1000
			for (int i = 1; i < 10; i++) {
				System.out.println(n+"-"+i);
			}
		}
		
	}


}
