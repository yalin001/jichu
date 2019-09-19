package day1204二进制十六进制;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2十六进制 {

	public static void main(String[] args) throws IOException {
/*
 * 向D盘下的f1文件输出字节数据
 * 图片也是16进制字节
 * FileOutputStream向文件输出保存字节数据
 */
		FileOutputStream out = new FileOutputStream("d:\\f1"); 
		out.write(0x61);
		out.write(0x62);
		out.write(0x63);
		out.write(0xd6);
		out.write(0xd0);
		out.close();
		//ultraEdit 用ctrl+h切换文本和字节
	}

}
