package day1501内部类;

import day1501内部类.A.Inner1;
import day1501内部类.A.Inner2;

public class Test_1 {
public static void main(String[] args) {
	//静态内部类的方法，直接创建
	//方法一： A.Inner1 i= new Inner1();
	 Inner1 i1=new Inner1();
	 System.out.println(i1);
	 //非静态内部类的方法：可以用点调用
	 A a=new A();
	 Inner2 i2=a.new Inner2();
	 System.out.println(i2);
}
}

class A {//public类只能有一个
  static class Inner1{
	  
  }	
  class Inner2{
	  
  }
}