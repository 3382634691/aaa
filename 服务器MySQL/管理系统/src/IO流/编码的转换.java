package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class 编码的转换 {
public static void main(String[] args) throws IOException
{
	OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("E:\\javafile文件操作测试\\编码的转换.txt"),"utf-8");
	out.write("编码转换测试");
	out.flush();
	out.close();
	InputStreamReader read=new InputStreamReader(new FileInputStream("E:\\javafile文件操作测试\\编码的转换.txt"),"utf-8");
	OutputStreamWriter outs=new OutputStreamWriter(new FileOutputStream("E:\\javafile文件操作测试\\编码的转换.txt"),"GBK");
	int len=0;
	while((len=read.read())!=-1)
	{
		
		outs.write(len);
	}
	outs.flush();
	outs.close();
	read.close();
	duqu();
}


public static void duqu() throws IOException
{
	InputStreamReader read=new InputStreamReader(new FileInputStream("E:\\javafile文件操作测试\\编码的转换.txt"),"utf-8");
	
	int len=0;
System.out.println("转换完毕使用utf-8d读取");
	while((len=read.read())!=-1)
	{
		System.out.println((char)len);
		
	}
	read.close();
	
}
}
