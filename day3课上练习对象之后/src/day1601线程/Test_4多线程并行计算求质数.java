package day1601线程;

public class Test_4多线程并行计算求质数 {

	public static void main(String[] args) throws Exception {
		System.out.println("----单线程--------");
		f1();
		System.out.println("----5线程--------");
		f5();
	}
	private static void f5() throws InterruptedException {
		long t=System.currentTimeMillis();
		T1[] a=new T1[50];
		int d=10000000/a.length;
		for (int i = 0; i < a.length; i++) {
			a[i]=new T1(d*i, d*(i+1));
			a[i].start();
			//t1.join();如果放到这个位置，没有起到多线程的作用
		}
		int c=0;
		for (T1 t1 : a) {
			t1.join();//和第17行的位置比较
			c += t1.count;
		}
		t=System.currentTimeMillis()-t;
		System.out.println("耗费时间："+t);
		System.out.println("质数数量："+c);
	}
	private static void f1() throws InterruptedException {
        long t=System.currentTimeMillis();
		T1 t1=new T1(0,10000000);
		t1.start();
		//此处暂停main，等待t1线程结束取结果
		t1.join();
		
        int c=t1.count;
		t=System.currentTimeMillis()-t;
		System.out.println("耗费时间："+t);
		System.out.println("质数数量："+c);
	}
	static class T1 extends Thread{
		int from;
		int to;
		int count;
		
		public T1(int from, int to) {
			if (from<3) {
				from=3;
				count=1;
			}
			this.from = from;
			this.to = to;
		}

		@Override
		public void run() {
			for (int i = from; i < to; i++) {
				if (isPrime(i)) {
					count++;
				}
			}
		}

		private boolean isPrime(int i) {
			//从[2,i开放+1）范围，找到有没有能整除i的数
			double max=Math.sqrt(i)+1;
			for (int j = 2; j < max; j++) {
				if (i%j==0) {
					//i能被j整除
					return false;
				}
			}
			return true;
		}
	}
	
	
}
