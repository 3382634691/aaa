package IO流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//BufferdWriter 有一个特有的方法  newline该方法可以根据不同的系统提供换行符
public class bufferdwrite {
public static void main(String[] args) throws IOException
{
	BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\javafile文件操作测试\\bufferedWriter.txt"));
	for(int i=0;i<10;i++)
	{
		bw.write("写入咯");
		bw.newLine();
	}
	bw.close();
}
}
