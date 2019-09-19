package day1201前期绑定后期绑定;

public class Test_1 {

	public static void main(String[] args) {
		f(new A());
		f(new B());
		
	}
	static void f(A a) {
		/*
		 * 后期绑定，运行期绑定
		 * 程序运行期间，执行到此代码时，动态的从子类到父类查找a（）
		 */
		a.a();//及可能执行A.a，也可能执行B.a的
		//变量和静态方法都是前期绑定，
		//非静态方法是后期绑定，运行期绑定
		a.b();//都执行A.a
		/*
		 * 变量前期绑定
		 * 编译期不会再查找绑定
		 */
		System.out.println(a.v1);
	}
}
class A{
	int v1=1;
	void a() {
		System.out.println("A.a()");
	}
	static void b() {
		System.out.println("A.b()");
	}
}
class B extends A{
	int v1=2;
	void a() {
		System.out.println("B.a()");
	}
	static void b() {
		System.out.println("B.b()");
	}
}