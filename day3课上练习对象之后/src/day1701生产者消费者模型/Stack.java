package day1701������������ģ��;

public class Stack {
	private char [] a=new char [5];	
	private int index;
	//���������кͳ����еķ���
	public void push(char c) {//�������뵯�з���
		if (isFull()) {
		return;	//�������˽���
		}
		a[index]=c;
		index++;
	}
	public char pop () {
		if (isEmpty()) {
			return ' ';//�ո��ʾû������
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
