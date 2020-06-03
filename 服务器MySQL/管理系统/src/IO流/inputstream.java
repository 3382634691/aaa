package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstream {
public static void main(String[] args) throws IOException
{
	utf_8();
	gbk();
}
public static void utf_8() throws IOException
{
	InputStreamReader isr=new InputStreamReader(new FileInputStream("E:\\javafile文件操作测试\\output.txt"));
	int len=0;
	while((len=isr.read())!=-1)
	{
		System.out.println((char)len);
	}
	
	//默认使用utf-8
}

public static void gbk() throws IOException
{
	InputStreamReader isr=new InputStreamReader(new FileInputStream("E:\\javafile文件操作测试\\gbk.txt"),"GBK");
	int len=0;
	while((len=isr.read())!=-1)
	{
		System.out.println((char)len);
	}
}
}
