package day1701生产者消费者模型;

public class test1 {
public static void main(String[] args) {
	Stack stack = new Stack();
	Producer p = new Producer(stack);
	Consumer c = new Consumer(stack);
	p.start();
	c.start();
	//用while多敲了一个盘子，但是在wait()的外面，总体while循环
	while (true) {
		synchronized (stack) {
		stack.notifyAll();	
		}
	}
	
}
}
