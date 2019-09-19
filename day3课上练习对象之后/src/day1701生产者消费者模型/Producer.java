package day1701������������ģ��;

import java.util.Random;

public class Producer extends Thread{
	private Stack stack;

	public Producer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		while (true) {
			/*
			 * 'a'+[0,26)
			 */
			char c  = (char)('a'+new Random().nextInt(26));
			synchronized (stack) {
				while (stack.isFull()) {
					try {
						stack.wait();
					} catch (InterruptedException e) {
						//e.printStackTrace();���Բ���ʾ
					}
				}
				stack.push(c);
				System.out.println("<<"+c);
				stack.notifyAll();
			}
		}
	}
	
	
	
	
	
}
