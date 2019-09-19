package day1701生产者消费者模型;

public class Stack {
	private char [] a=new char [5];	
	private int index;
	//创建进弹夹和出弹夹的方法
	public void push(char c) {//数据输入弹夹方法
		if (isFull()) {
		return;	//数据满了结束
		}
		a[index]=c;
		index++;
	}
	public char pop () {
		if (isEmpty()) {
			return ' ';//空格表示没有数据
		}
		index--;
		char c = a[index];
		return c;
	}
	public boolean isEmpty() {
		return index==0;
	}
	
	public boolean isFull() {
		return index==5;
	}
	
	
	
	
}
