package IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//filereader extends Inputsteam (extends reader) 
public class 字符输入流reader {
public static void main(String[] args) throws IOException
{
	
	FileReader fr=new FileReader("E:\\javafile文件操作测试\\abc.txt");
	int len=0;
	while((len=fr.read())!=-1)
	{
		System.out.println((char)len);//字符流每次都读取一个字符，字节流每次只读取一个字节
		
	}
	
	
	char[] ch=new char[1024];
	int lens=0;
	while((lens=fr.read(ch))!=-1)
	{
		
		System.out.println(new String(ch,0,lens));
	}
	
	fr.close();
	
}
}
