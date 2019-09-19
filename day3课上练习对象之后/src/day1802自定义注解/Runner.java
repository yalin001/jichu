package day1802自定义注解;

import java.lang.reflect.Method;

public class Runner {
   public static void lauch(Class<?> c) {
	try {
		Object o1 = c.newInstance();
		Method[] a = c.getMethods();
		for (Method t : a) {
			if (t.isAnnotationPresent(Test.class)) {
				Test test = t.getAnnotation(Test.class);
				int id=test.id();
				String title=test.value();
				if (title==null || title.length()==0) {
					title=test.title();
				}
				System.out.println("id="+id+",title="+title);
				t.invoke(o1);
				System.out.println("----------------------------");
				
			}
		}
		
	} catch (Exception e) {
		System.out.println("执行失败");
		e.printStackTrace();
	}
}
   public static void main(String[] args) {
	Runner.lauch(Test1.class);
}
}
