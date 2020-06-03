package IO流;

import java.io.FileInputStream;
import java.io.IOException;
//构造方法 参数可以是String路径   也可以是file路径
public class fileinput {
public static void main(String[] args) throws IOException
{
	
	FileInputStream fis=new FileInputStream("E:\\new.txt");
//	int a=fis.read();
//	System.out.println(a);
//	fis.close();
int len=0;
while((len=fis.read())!=-1)
{
	System.out.println(len);
}
fis.close();
//
//while(fis.read()!=-1)
//{
//	System.out.println(fis.read());
//}
//这种方法是不行的，每一次read都会读取一下个文件字节的	
	 
	
}
}
