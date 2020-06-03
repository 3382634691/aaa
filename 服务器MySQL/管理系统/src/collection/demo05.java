package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class demo05 {
public static void main(String[] args)
{
	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	prin(list);
	ArrayList<String> list2=new ArrayList<>();
	list2.add("问问");
	prin(list2);
	
}

public static  void prin(ArrayList<?> list)
{
	Iterator<?> i=list.iterator();
	while(i.hasNext())
	{
		Object it=i.next();
		System.out.println(it);
	}
}
}
