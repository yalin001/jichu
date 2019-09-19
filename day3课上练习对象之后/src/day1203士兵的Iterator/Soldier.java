package day1203Ê¿±øµÄIterator;

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
		System.out.print(id+"ºÅÇ°½ø£º  ");
	}
    public void attack() {
    	if (blood==0) {
			System.out.println(id+"ËÀÍö");
			return;
			}
				System.out.println(id+"ºÅ½ø¹¥");
		    	int d= new Random().nextInt(30);
		    	
    	if (blood<d) {
			d =blood;
		}
    	blood -=d;
		System.out.println("ÑªÁ¿Ê£Óà£º"+blood);
		if (blood==0) {
			System.out.println(id+"ËÀÍö");
		}
	}
    }
