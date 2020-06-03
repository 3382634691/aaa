package 学生信息管理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class IO {


public static void o(LinkedList<student> link) throws IOException, IOException, ClassNotFoundException
{
	FileOutputStream f=new FileOutputStream("E:\\javafile文件操作测试\\学生管理系统\\list.txt",true);
	ObjectOutputStream oos=new ObjectOutputStream(f);
	oos.writeObject(link);
	oos.flush();
	ObjectInputStream o=new ObjectInputStream(new FileInputStream("E:\\javafile文件操作测试\\学生管理系统\\list.txt"));
	Object ob=o.readObject();
	
	System.out.println(((LinkedList<student>)ob));
	LinkedList<student> lin= (LinkedList<student>)ob;
	System.out.println(lin.size());
	o.close();
}
}
