package day1203ʿ����Iterator;

import java.util.Random;

public class Soldier {
	int id;
	int blood =100;
	public Soldier(int id) {
		this(id, 100);
	}
	public Soldier(int id,int blood) {
		this.id=id;
		this.blood=blood;
	}
	public void go() {
		System.out.print(id+"��ǰ����  ");
	}
    public void attack() {
    	if (blood==0) {
			System.out.println(id+"����");
			return;
			}
				System.out.println(id+"�Ž���");
		    	int d= new Random().nextInt(30);
		    	
    	if (blood<d) {
			d =blood;
		}
    	blood -=d;
		System.out.println("Ѫ��ʣ�ࣺ"+blood);
		if (blood==0) {
			System.out.println(id+"����");
		}
	}
    }
