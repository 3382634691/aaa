package IO流;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class 打印流system {
public static void main(String[] args) throws IOException
{
	PrintStream ps=new PrintStream("E:\\javafile文件操作测试\\32.txt");
	ps.write(97);//继承自父类的方法写入字节
	ps.print(999);
	ps.close();
	a();
}

public static void a() throws IOException
{
	System.out.println("正常启动输出");
	PrintStream ps=new PrintStream("E:\\javafile文件操作测试\\打印流输出目的地.txt");
	System.setOut(ps);
	System.out.println("此次输出在外面");
	ps.close();
}
}
