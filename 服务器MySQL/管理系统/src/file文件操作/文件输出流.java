package file文件操作;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class 文件输出流 {
public static void main(String[] args)
{
	
show2();
}

public static void show()
{
	FileOutputStream fos;
	try {
		fos = new FileOutputStream("E:\\javafile文件操作测试\\filea.txt");
		fos.write(69);
		fos.close();
	} 
	catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
}

/*
 * 一次写多个字节的时候
 * 如果第一个字节是正数0-127 那么显示的时候就是acs表
 * 如果第一个字节是负数就会和第二个字节组成一个中文
 */
public static void show2()
{
	FileOutputStream fos;
	try {
		fos = new FileOutputStream("E:\\javafile文件操作测试\\a.txt");
		fos.write(49);
		fos.write(49);
		fos.write(49);
		
		
		byte[] bytes= {-48,49,-49,50,-65,-65};
		fos.write(bytes);
		fos.write(bytes,3,3);//将字节数组的一部分写入，从3开始写3个
	
		
		
		byte[] byte2="你好".getBytes();
		System.out.println(Arrays.toString(byte2));
		fos.write(byte2);
		fos.close();
	} 
	catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
}



}
