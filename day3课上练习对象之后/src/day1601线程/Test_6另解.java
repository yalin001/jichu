package day1601�߳�;

import day1601�߳�.Test_6.R1;

public class Test_6��� {

	public static void main(String[] args) {

		R1 r1=new R1();
		
		Thread t1 = new Thread(r1);//
		/*
		 * r1.run();
		 * r1.add()ÿ�ζ�++����������2�����ǻ����һ��i++û��ʱ��Ƭ
		 */
		t1.start();
		R1 r2=new R1();
		//main�߳�
		while (true) {
			int i=r2.get();
			if (i%2==1) {
				System.out.println(i);
				System.exit(0);//�˳�������̶���䣬0���Լ�����
			}
		}
	}
	static class R1 implements Runnable{
		static int i;//��Ϊ��static��ԭ��r2.get()Ҳ����i++����r2.get()��ʹ��main����������߳�
		synchronized void add() {//synchronized���巽������ʵ������ֱ�ӵ��÷���
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

