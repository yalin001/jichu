package day1601�߳�;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_5ͬʱ����һ������ {
	static char [] a= {'*','*','*','*','*','*'};
	static char c = '-';
	
	
	public static void main(String[] args) {
		new Thread() {
		@Override
		public void run() {
			while (true) {
				synchronized (a) {//�����ݵ��������ȷ���Ȩ��
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
					synchronized (a) {//�����ݵ��������ȷ���Ȩ��
						System.out.println(Arrays.toString(a));	
					}
				}
			
			}	
		}.start();
		
		
	}

}
