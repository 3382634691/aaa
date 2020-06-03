package IO流;

import java.io.FileWriter;
import java.io.IOException;

public class trycatch {
public static void main(String[] args)
{
	FileWriter file = null;
	try {
		
		file=new FileWriter("w:\\javafile文件操作测试\\3.txt");
		file.write("123");
	}catch(IOException e)
	{
		System.out.println(e);
	}finally
	{
		if(file!=null)
		{
			try {
				file.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}
}
}
