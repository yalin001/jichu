package day1801_反射;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;

import day1403序列化.student;

public class Runner {
	private static ArrayList<String> list=new ArrayList<>();
	static {
		try {
			BufferedReader in= new BufferedReader(//输出时自动换行
					new InputStreamReader(//编码转换流
							new FileInputStream("d:/config.txt")));//网络流
			String line;
			while ((line = in.readLine()) !=null) {
				line=line.trim();
				if (line.length()==0) {
					continue;
				}
				list.add(line);
			}
			in.close();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println("加载配置文件失败");
			e.printStackTrace();
		}
	}
public static void main(String[] args) throws Exception {
	Runner.launch();
}
private static void launch() throws Exception {
	for (String s : list) {
		//将"day1801.A;a"---->["day1801.A";"a"]
		String [] a=s.split(";");
		//获得"类对象"
		Class<?> c=Class.forName(a[0]);
		//反射新建实例
		Object o1=c.newInstance();
		//获取方法名
		Method t=c.getMethod(a[1]);
		//反射调用方法
		t.invoke(o1);
		
	}
}	
}
