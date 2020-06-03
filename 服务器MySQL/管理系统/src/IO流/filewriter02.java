package IO流;


import java.io.FileWriter;
import java.io.IOException;

public class filewriter02 {
public static void main(String[] args) throws IOException
{
	FileWriter fr=new FileWriter("E:\\javafile文件操作测试\\字符输出流.txt",true);//writer都有一个续写开关append
	char cs[]= {'a','b','c'};
	fr.write(cs);
	fr.write(cs,1,1);
	
	fr.write("写入一个字符串");
	
	
	for(int i=0;i<10;i++)
		fr.write("\n hellowrold"+i);
	fr.close();
			}
}
