package day1402�ļ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class test4 {
public static void main(String[] args) throws Exception {
	FileInputStream in = new FileInputStream("d:/abc/f1");
	byte [] buff= new byte[5];
	int n;
	while ((n=in.read(buff)) !=-1) {
		System.out.println(n+"����"+Arrays.toString(buff));
	}
	in.close();
}
}
