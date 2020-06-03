package IO流;

import java.io.FileReader;
import java.io.IOException;

public class read {
	public static void main(String[] args) throws IOException
	{
	FileReader fr=new FileReader("E:\\javafile文件操作测试\\200.png");
	int i=0;
	while((i=fr.read())!=-1) {
	System.out.println(i);
	}
	}
}
