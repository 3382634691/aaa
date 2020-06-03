package IO流;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出流需要注意的是
 * 字符输出流
 * 1.创建对象
 * 2.write方法只会将数据写入内存缓冲区（字符转换为字节的过程）
 * 3.使用flush方法，把内存缓冲区中的数据刷新到文件中
 * 4.使用close方法，释放资源（会先把内存缓冲区的数据刷新到文件中）
 * 可以只使用flush或者closse方法都可以将文本写入，但是只要write不行
 *  */
public class 字符输出流writer {
public static void main(String[] args) throws IOException
{
	FileWriter fw=new FileWriter("E:\\javafile文件操作测试\\filewrite.txt");
	fw.write(97);
	fw.flush();
	fw.close();
	
}
}
