package day1701生产者消费者模型;

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
						//e.printStackTrace();可以不显示
					}
				}
				stack.push(c);
				System.out.println("<<"+c);
				stack.notifyAll();
			}
		}
	}
	
	
	
	
	
}
