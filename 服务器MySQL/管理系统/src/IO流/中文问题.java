package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//GBK编码时  中文占用2个字节
//UTF-8编码时 中文占用3个字节
public class 中文问题 {
public static void main(String[] args) throws IOException
{
	FileInputStream input=new FileInputStream("E:\\javafile文件操作测试\\abc.txt");
	int len=0;
	while((len=input.read())!=-1)
	{
		System.out.println((char)len);//出现乱码的原因是3个字节才组成一个汉字，而这里只读取一个字节就强转了
	}
}
}
