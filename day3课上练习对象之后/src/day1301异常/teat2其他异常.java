package day1301异常;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class teat2其他异常 {

	public static void main(String[] args) {
		try {
			f();
		} catch (ParseException e) {
			System.out.println("日期格式错误，请检查");
		} catch (IOException e) {
			System.out.println("磁盘路径错误，请检查");
		}
	}

	private static void f() throws ParseException, IOException {
		System.out.println("请输入日期 格式(yyyy-MM-dd)：");
		String d = new Scanner(System.in).nextLine();
		//SimpleDateFormat将字符型日期解析成date型
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		//强制处理异常，必须实现考虑异常如何处理，并给出处理方案(初级程序员看到错误，用系统的解决方案反而不好即首选throws)
		//用parse将字符串解析成Date
		System.out.println(s);//输出s日期实例的地址
		Date p = s.parse(d);
		String path="d:\\"+p.getTime()+".txt";
		File file=new File(path);
		file.createNewFile();
		System.out.println("文件已创建："+path);
		
	}

}
