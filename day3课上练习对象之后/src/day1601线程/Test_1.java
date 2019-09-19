package day1601线程;

import java.util.Random;

public class Test_1 {
public static void main(String[] args) {
	T1 t1=new T1();
    T1 t2=new T1();
    //启动线程，线程启动后，自动执行run()方法代码
    t1.start();
    t2.start();
    
    System.out.println("main线程");
    int ra = new Random().nextInt();
	;
}
static class T1 extends Thread{//继承Thread类，便于创建新的类进而构造实例线程
	
	public void run() {
		//打印线程名字和打印1-1000
		String n = super.getName();
		for (int i = 1; i < 10; i++) {
			System.out.println(n+"-"+i);
		}
	}
}


}
