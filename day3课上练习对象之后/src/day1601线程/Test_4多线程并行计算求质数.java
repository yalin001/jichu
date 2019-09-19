package day1601�߳�;

public class Test_4���̲߳��м��������� {

	public static void main(String[] args) throws Exception {
		System.out.println("----���߳�--------");
		f1();
		System.out.println("----5�߳�--------");
		f5();
	}
	private static void f5() throws InterruptedException {
		long t=System.currentTimeMillis();
		T1[] a=new T1[50];
		int d=10000000/a.length;
		for (int i = 0; i < a.length; i++) {
			a[i]=new T1(d*i, d*(i+1));
			a[i].start();
			//t1.join();����ŵ����λ�ã�û���𵽶��̵߳�����
		}
		int c=0;
		for (T1 t1 : a) {
			t1.join();//�͵�17�е�λ�ñȽ�
			c += t1.count;
		}
		t=System.currentTimeMillis()-t;
		System.out.println("�ķ�ʱ�䣺"+t);
		System.out.println("����������"+c);
	}
	private static void f1() throws InterruptedException {
        long t=System.currentTimeMillis();
		T1 t1=new T1(0,10000000);
		t1.start();
		//�˴���ͣmain���ȴ�t1�߳̽���ȡ���
		t1.join();
		
        int c=t1.count;
		t=System.currentTimeMillis()-t;
		System.out.println("�ķ�ʱ�䣺"+t);
		System.out.println("����������"+c);
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
			//��[2,i����+1����Χ���ҵ���û��������i����
			double max=Math.sqrt(i)+1;
			for (int j = 2; j < max; j++) {
				if (i%j==0) {
					//i�ܱ�j����
					return false;
				}
			}
			return true;
		}
	}
	
	
}
