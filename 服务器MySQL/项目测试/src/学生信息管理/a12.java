package 学生信息管理;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class a12 {
public static void main(String[] args) throws ClassNotFoundException, IOException
{
	  ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\javafile文件操作测试\\学生管理系统\\list.txt"));
	    Object o=ois.readObject();
	    
	    
	    System.out.println("打印o"+o);
}
}
