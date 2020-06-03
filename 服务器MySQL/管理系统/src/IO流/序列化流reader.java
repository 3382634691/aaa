package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 序列化流reader {
public static void main(String[] args) throws IOException, ClassNotFoundException
{
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\javafile文件操作测试\\person.txt"));
	Object o=ois.readObject();
	System.out.println(o);
	ois.close();
  System.out.println(((序列化person)o).getName());
}
}
