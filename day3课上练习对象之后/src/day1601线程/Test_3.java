package day1601线程;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test_3 {
public static void main(String[] args) {
    Thread t = new Thread() {
    	@Override
    	public void run() {
    		for (int i = 0; i < 10; i++){
    			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:ms");
        		String s=sdf.format(new Date());
        		System.out.println(s);
        		try {
    				Thread.sleep(1000);
    			} catch (InterruptedException e) {
    				System.out.println("谁戳老子");
    				break;
    			}
			}
    	}
    };
   
    t.start();
    /////////////////////////////////
    Thread t2 = new Thread() {
    	@Override
    	public void run() {
    		System.out.println("按回车惊醒t1线程");
    		new Scanner(System.in).nextLine();
    		t.interrupt();
    		
    	}
    };
    t2.setDaemon(true);//设置下一个线程为后台线程
    t2.start();
}
}
