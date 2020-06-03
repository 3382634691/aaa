package collection;

import java.util.ArrayList;
import java.util.Collection;


public class collection {
	static String[] a2={"0","2"};;

public static void main(String[] args)
{
	
	
	System.out.println("数组a是"+a2.toString());
	Collection<String> coll=new ArrayList<>();
	System.out.println(coll);

	boolean bool=coll.add("张三");
	System.out.println(bool+"bool");
	System.out.println(coll);
	coll.add("李四");
	coll.add("2");
	System.out.println(coll);
	boolean bool2=coll.remove(2);
	System.out.println(coll.contains("张三"));
	System.out.println(coll.isEmpty());
	System.out.println(coll.size());
	
	System.out.println(coll.toArray());
	
	
	

}




}
