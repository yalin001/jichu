package day1802�Զ���ע��;

public class Test1 {
	@Test(id=1,value="����һ")
	public void a() {
		System.out.println("Test1.a");
	}
	@Test(id=2)
	public void b() {
		System.out.println("Test1.b");
	}
	public void c() {
		System.out.println("Test1.c");
	}
	@Test(title="������")
	public void d() {
		System.out.println("Test1.d");
	}
	

}
