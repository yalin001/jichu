package day1601�߳�;

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
    				System.out.println("˭������");
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
    		System.out.println("���س�����t1�߳�");
    		new Scanner(System.in).nextLine();
    		t.interrupt();
    		
    	}
    };
    t2.setDaemon(true);//������һ���߳�Ϊ��̨�߳�
    t2.start();
}
}
