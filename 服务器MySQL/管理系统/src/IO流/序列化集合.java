package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class 序列化集合 {
public static void main(String[] args) throws IOException, IOException, ClassNotFoundException
{
	ArrayList<序列化person>  array=new ArrayList<>();
	array.add(new 序列化person("张三",18));
	array.add(new 序列化person("李四",17));
	array.add(new 序列化person("四",117));
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("list.txt"));
    oos.writeObject(array);
    ObjectInputStream ois=new ObjectInputStream(new FileInputStream("list.txt"));
    Object o=ois.readObject();
    
    System.out.println("打印o"+o);
    ArrayList<序列化person> list2=(ArrayList<序列化person>)o;
    for(Object oc:list2)
    {
    	System.out.println(oc);
    }
    
   ois.close();
   oos.close();
}
}
