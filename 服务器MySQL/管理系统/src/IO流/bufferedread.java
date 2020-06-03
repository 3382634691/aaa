package IO流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//Bufferedreader有一个特殊的方法readline（）一次读取一行
public class bufferedread {
public static void main(String[] args) throws IOException
{
	BufferedReader br=new BufferedReader(new FileReader("E:\\javafile文件操作测试\\bufferedWriter.txt"));
//	int len=0;
//	while((len=br.read())!=-1)
//	{
//		System.out.println((char)len);
//	}
//	
	String lens=null;
	while((lens=br.readLine())!=null)
	{
		System.out.println(lens);
	}
	br.close();
}
}
