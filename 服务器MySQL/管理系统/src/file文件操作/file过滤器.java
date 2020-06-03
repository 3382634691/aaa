package file文件操作;

import java.io.File;

public class file过滤器 {
	public static void main(String[] args)
	{
		File file=new File("E:\\javafile文件操作测试");
		array(file);
	}

	public static void array(File file)
	{
		File[] arry=file.listFiles(new 过滤器实现类());
		for(File arr1:arry)
		{
			
//			if(arr1.isDirectory())
//			{
//				array(arr1);
//			}
////			else
////			{
////				
//			String a=arr1.toString();
//			System.out.println("a是"+a);
			
//			if(a.endsWith(".txt"))
//				{
//				System.out.println("存在filetxt文件");
//				
//				}
			if(arr1.isDirectory())
			{
				array(arr1);
			}
			else {
			System.out.println(arr1);
			}
//			}
//			
		}
		
	}
}
