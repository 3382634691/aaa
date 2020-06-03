package file文件操作;

import java.io.File;

public class 遍历文件夹 {
public static void main(String[] args)
{
	show01();
}
public static void show01()
{
	File file=new File("E:\\javafile文件操作测试");
	String[] arr=file.list();
	for(String filename:arr)
	{
		System.out.println(filename);//隐藏文件夹也可以显示出来
	}
	
	
	File[] file2=file.listFiles();
	for(File arrs:file2)
	{
		System.out.println(arrs);
	}
	
}
}
