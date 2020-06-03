package file文件操作;

import java.io.File;

public class 递归打印文件夹 {
public static void main(String[] args)
{
	File file=new File("E:\\javafile文件操作测试");
	
	array(file);
}


//public static String[] digui(File file)
//{
//	String[] a=file.list();
//	for(String ac:a)
//	{
//		if(ac.)
//	}
//}

public static void array(File file)
{
	File[] arry=file.listFiles();
	
	for(File arr1:arry)
	{
		
	
		
		if(arr1.isDirectory()==true&&arr1 !=null)
		{
		panduan(arr1);
		}
		
	
	

	
//		String a=arr1.toString();
//		System.out.println("a是"+a);
//		
//		if(a.endsWith(".txt"))
//			{
//			System.out.println("存在filetxt文件");
//			
//			}

		else {
		System.out.println(arr1);
		}
		
	}
	
	
	
	
	
}

public static boolean panduan(File files)
{
	boolean bool=false;
File[] arry=files.listFiles();
	
	for(File arr1:arry)
	{
		
	
		
		if(arr1.isDirectory()==true)
		{
			array(arr1);
	    bool=true;
		}
		else
		{
		bool=false;
		}
	}
	return bool;
}
}
