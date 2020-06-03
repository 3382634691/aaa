package IO流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class buffer {
public static void main(String[] args) throws IOException
{
	/*
	 * 关闭时只需关闭缓冲流即可
	 */
	FileInputStream fis=new FileInputStream("E:\\javafile文件操作测试\\file.txt");
	BufferedInputStream bis=new BufferedInputStream(fis);
	int len=0;
	while((len=bis.read())!=-1)
	{
		System.out.println(len);
	}

	
	byte[] bytes=new byte[1024];//存储每次读取的数据
	int lens=0;//记录每次读取的有效字节个数
	while((lens=fis.read(bytes))!=-1)
	{
		System.out.println(lens);
	}
	bis.close();
	
}
}
