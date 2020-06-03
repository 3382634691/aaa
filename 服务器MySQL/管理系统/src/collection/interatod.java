package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代器
//iterator
public class interatod {
public static void main(String[] args)
{
	Collection<String> coll=new ArrayList<>();
	coll.add("1");
	coll.add("2");
	coll.add("3");
	coll.add("4");
	
	
	Iterator<String> it=coll.iterator();
//	
//	System.out.println(it.next());
//	System.out.println(it.next());
//	System.out.println(it.next());
	
	int i=0;
	while(it.hasNext())
	{
		i++;
		String a2=it.next();
		System.out.println(a2);
		if("3".equals(a2))
		{
			System.out.println("3位于"+i);
		}
	}
	
	for(Iterator<String> it2=coll.iterator(); it2.hasNext();)
	{
		System.out.println(it2.next());
	}
	
}
	
}
