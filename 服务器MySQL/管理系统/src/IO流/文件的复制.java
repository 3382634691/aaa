package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//字节流对任何文件都可以读写，可复制文件，txt，mp4，mp3
public class 文件的复制 {
public static void main(String[] args) throws IOException
{
	long s=System.currentTimeMillis();
	FileInputStream input=new FileInputStream("E:\\javafile文件操作测试\\200.png");
	FileOutputStream out=new FileOutputStream("E:\\javafile文件操作测试\\file\\200.png");
	int len=0;
	while((len=input.read())!=-1)
	{
		System.out.println(len);
		out.write(len);
	}
	//102,652个字节就意味着while循环要执行102652次
	//优化方法
	byte[] bytes=new byte[1024];
	int lens=0;
	while((lens=input.read(bytes))!=-1)
	{
		System.out.println(lens);
		out.write(bytes,0,lens);
	}
	
	
	System.out.println("复制成功");
	//先关写的，后关读的
	out.close();
	input.close();
	long e=System.currentTimeMillis();
	System.out.println("程序共执行了"+(e-s)+"毫秒");
}
}
