package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class list {
	
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("1");
		System.out.println(list);
		
		ArrayList<String> list2=new ArrayList<String>();
	   list.add(3, "it");
		System.out.println(list);
		System.out.println(list.remove(2));
		list.set(2, "A");
		
		for(int i=0;i<list.size();i++)
		{
			String st= list.get(i);
			System.out.println(st);
		}
		
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			String a=it.next();
			System.out.println(a);
	}
	}
}
