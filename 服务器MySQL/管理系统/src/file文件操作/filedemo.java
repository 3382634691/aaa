package file文件操作;

import java.io.File;
import java.io.IOException;

public class filedemo {
public static void main(String[] args)
{
	//pathseoarator路径分隔符;windows 系统是; Liux是：
	String pathseparator =File.pathSeparator;
	System.out.println(pathseparator);
	//separator 是文件名分隔符  windows系统是\,Liux是/
	String separator=File.separator;
	System.out.println(separator);
	
	
	show01();
	
	panduan();
	
	show02();
	mkdirs();
}


public static void show01()
{
	File file=new File("E:\\javafile文件操作测试\\file.txt");
	
	System.out.println(file.getAbsolutePath());
	File file2=new File("demo2.txt");
	System.out.println(file2.getAbsolutePath());
	
	System.out.println(file.getPath());
	System.out.println(file2.getPath());//getpath方法返回的就是相对路径
	//tostring方法的底层就是调用了getpath
	
	System.out.println(file2.toString());
	
	System.out.println(file.getName());
	
	System.out.println(file.length());//legth是返回的文件夹的大小  单位是字节
}
public static void panduan()
{
	File f1=new File("E:\\javafile文件操作测试\\123.txt");
	System.out.println(f1.exists());
	
	
	if(f1.exists())
		
	{
		System.out.println("isDirectory"+f1.isDirectory());
		System.out.println(f1.isFile());
	}
	else
	{
		System.out.println("文件不存在");
	}
	}


public static void show02()
{
	File file=new File("E:\\javafile文件操作测试\\file.txt");
  boolean newfile = false;
try {
	newfile = file.createNewFile();
} catch (IOException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}
  System.out.println("创建文件是否成功"+newfile);
}
public static void mkdirs()
{
	File file=new File("E:\\javafile文件操作测试\\file");
	System.out.println(file.mkdir());
	
	File files=new File("E:\\javafile文件操作测试\\file\\file2\\file3");
	System.out.println(files.mkdirs());
	
	//System.out.println(file.delete());
//	System.out.println(files.delete());
}


}

