package day1501�ڲ���;

import day1501�ڲ���.A.Inner1;
import day1501�ڲ���.A.Inner2;

public class Test_1 {
public static void main(String[] args) {
	//��̬�ڲ���ķ�����ֱ�Ӵ���
	//����һ�� A.Inner1 i= new Inner1();
	 Inner1 i1=new Inner1();
	 System.out.println(i1);
	 //�Ǿ�̬�ڲ���ķ����������õ����
	 A a=new A();
	 Inner2 i2=a.new Inner2();
	 System.out.println(i2);
}
}

class A {//public��ֻ����һ��
  static class Inner1{
	  
  }	
  class Inner2{
	  
  }
}