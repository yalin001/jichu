package day1204������ʮ������;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2ʮ������ {

	public static void main(String[] args) throws IOException {
/*
 * ��D���µ�f1�ļ�����ֽ�����
 * ͼƬҲ��16�����ֽ�
 * FileOutputStream���ļ���������ֽ�����
 */
		FileOutputStream out = new FileOutputStream("d:\\f1"); 
		out.write(0x61);
		out.write(0x62);
		out.write(0x63);
		out.write(0xd6);
		out.write(0xd0);
		out.close();
		//ultraEdit ��ctrl+h�л��ı����ֽ�
	}

}
