package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

//outputStream extends read
public class 转换流 {
public static void main(String[] args) throws IOException
{
	utf_8();
	gbk();
}

public static void utf_8() throws IOException
{
	//不指定默认使用utf-8
	OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("E:\\javafile文件操作测试\\output.txt"),"utf-8");
	out.write("你好");
	out.flush();
	out.close();
	
	
}

public static void gbk() throws IOException, FileNotFoundException
{
	OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("E:\\javafile文件操作测试\\gbk.txt"),"GBK");
	out.write("你好");
	out.flush();
	out.close();
}
}
