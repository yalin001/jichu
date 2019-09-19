package day1601线程;

import day1601线程.Test_6.R1;

public class Test_6另解 {

	public static void main(String[] args) {

		R1 r1=new R1();
		
		Thread t1 = new Thread(r1);//
		/*
		 * r1.run();
		 * r1.add()每次都++两个，即加2，但是会出现一个i++没有时间片
		 */
		t1.start();
		R1 r2=new R1();
		//main线程
		while (true) {
			int i=r2.get();
			if (i%2==1) {
				System.out.println(i);
				System.exit(0);//退出虚拟机固定语句，0是自己决定
			}
		}
	}
	static class R1 implements Runnable{
		static int i;//因为有static的原因，r2.get()也会有i++。即r2.get()会使用main方法里面的线程
		synchronized void add() {//synchronized整体方法锁，实例可以直接调用方法
			i++;
			i++;
		}
		static synchronized void f() {
			int i;
		}
		synchronized int get() {
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

