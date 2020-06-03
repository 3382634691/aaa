package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class fanx {
public static void main(String[] args)
{
	ArrayList list=new ArrayList();
	list.add(1);
	list.add("2");
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		Object obj=it.next();
		System.out.println(obj);
		
		String s=(String)obj;
		System.out.println(s.length());
	}
	
	ArrayList<String> list2=new ArrayList();
	list2.add("1");
	Iterator<String> it2=list2.iterator();
	
}


}
