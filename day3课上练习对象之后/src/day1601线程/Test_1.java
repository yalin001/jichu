package day1601�߳�;

import java.util.Random;

public class Test_1 {
public static void main(String[] args) {
	T1 t1=new T1();
    T1 t2=new T1();
    //�����̣߳��߳��������Զ�ִ��run()��������
    t1.start();
    t2.start();
    
    System.out.println("main�߳�");
    int ra = new Random().nextInt();
	;
}
static class T1 extends Thread{//�̳�Thread�࣬���ڴ����µ����������ʵ���߳�
	
	public void run() {
		//��ӡ�߳����ֺʹ�ӡ1-1000
		String n = super.getName();
		for (int i = 1; i < 10; i++) {
			System.out.println(n+"-"+i);
		}
	}
}


}
