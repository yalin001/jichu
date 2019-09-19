package day1601线程;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_5同时访问一个数据 {
	static char [] a= {'*','*','*','*','*','*'};
	static char c = '-';
	
	
	public static void main(String[] args) {
		new Thread() {
		@Override
		public void run() {
			while (true) {
				synchronized (a) {//抢数据的锁（优先访问权）
					for (int i = 0; i < a.length; i++) {
						a[i]=c;
					}	
				}
				
				c=(c=='-'? '*':'-');
			}
			
		}
		}.start();
		new Thread() {
			@Override
			public void run() {
				while (true) {
					synchronized (a) {//抢数据的锁（优先访问权）
						System.out.println(Arrays.toString(a));	
					}
				}
			
			}	
		}.start();
		
		
	}

}
