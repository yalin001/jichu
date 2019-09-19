package day1301异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_4异常包装 {

	public static void main(String[] args) {
		Student su = new Student("张三", "1995-6-13");
		System.out.println(su);
	}

}
class Student {
	String name;
	String birthday;
	public Student(String name, String birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date p = st.parse(birthday);
			return name + ", birthday=" + p.getTime();
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
}