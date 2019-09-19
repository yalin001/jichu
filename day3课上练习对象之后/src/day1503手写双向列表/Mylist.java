package day1503��д˫���б�;

public class Mylist {
		private Node head;//�б�ͷ
		private Node tail;//β
		private int size;//������
		/*
		 * �ڲ���Node,�ڵ���
		 * �����ⲿ��˫���б�ʵ��
		 * ��һ���ڵ�����ݽ��з�װ
		 */
	public void add(Object value) {
		Node n = new Node();
		n.value=value;
		if (size==0) {
			n.prev=n;
			n.next=n;
			head=n;
			tail=n;
		} else {
			//n��tail
			n.prev=tail;
			tail.next=n;
			//n��head
			n.next=head;
			head.prev=n;
			//n���β��
			tail=n;
		}
		size++;
	}
	public Object get (int i){
		if (i<0||i>size) {
			throw new IndexOutOfBoundsException(""+i);
		}
		if (i==0) {
			return head.value;
			
		}
		if (i==size-1) {
			return tail.value;
		}
		//����iλ�õĽڵ�ʵ��
		Node n=getNode(i);
		return n.value;
	}
	private Node getNode(int i) {
		Node n;
		if (i<=size/2) {//��ǰ������
			n=head;
			for (int j = 1; j <= i; j++) {
				n=n.next;
			}
		} else {//�Ӻ���ǰ����
			n=tail;
			for (int j = size-2; j >= i; j--) {
			n=n.prev;	
			}
		}
		return n;
	}
	public int size() {
		return size;
	}
	private class Node{
			Object value;//��ŵ�����
			Node prev;//����ǰһ���ڵ�ʵ��
			Node next;//���ú�һ���ڵ�ʵ��
			
		}
}

