package day1503手写双向列表;

public class Mylist {
		private Node head;//列表头
		private Node tail;//尾
		private int size;//数据量
		/*
		 * 内部类Node,节点类
		 * 辅助外部的双向列表实例
		 * 对一个节点的数据进行封装
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
			//n和tail
			n.prev=tail;
			tail.next=n;
			//n和head
			n.next=head;
			head.prev=n;
			//n变成尾部
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
		//访问i位置的节点实例
		Node n=getNode(i);
		return n.value;
	}
	private Node getNode(int i) {
		Node n;
		if (i<=size/2) {//从前向后遍历
			n=head;
			for (int j = 1; j <= i; j++) {
				n=n.next;
			}
		} else {//从后向前遍历
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
			Object value;//存放的数据
			Node prev;//引用前一个节点实例
			Node next;//引用后一个节点实例
			
		}
}

