package day1802自定义注解;

public class Test1 {
	@Test(id=1,value="测试一")
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
	@Test(title="测试三")
	public void d() {
		System.out.println("Test1.d");
	}
	

}
