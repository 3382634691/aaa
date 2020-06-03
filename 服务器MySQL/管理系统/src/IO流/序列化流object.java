package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class 序列化流object {
	//objectoutputStream 对象的序列化流
	//以二进制存储  且  自定义类 均需要实现Serializble接口  其次Serializble接口没有任何方法，只是一个标记接口 
	public static void main(String[] args) throws IOException
{
//需要注意 的是 被静态的变量staic是不能序列化的，会自动变成默认值0
		//被瞬态关键字修饰也是如此transient
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\javafile文件操作测试\\person.txt"));
	oos.writeObject(new 序列化person("网二",18));
	oos.close();
	
	
}
}
