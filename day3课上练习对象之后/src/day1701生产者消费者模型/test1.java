package day1701������������ģ��;

public class test1 {
public static void main(String[] args) {
	Stack stack = new Stack();
	Producer p = new Producer(stack);
	Consumer c = new Consumer(stack);
	p.start();
	c.start();
	//��while������һ�����ӣ�������wait()�����棬����whileѭ��
	while (true) {
		synchronized (stack) {
		stack.notifyAll();	
		}
	}
	
}
}
