package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapentry {
public static void main(String[] args)
{
	Map<String,Integer> map=new HashMap<>();
	map.put("abc", 1);
	map.put("cd",2);
	map.put("cc", 3);
	Set<Map.Entry<String,Integer>> set=map.entrySet();
	Iterator<Map.Entry<String,Integer>> iterator =set.iterator();
	
	while(iterator.hasNext())
	{
		Map.Entry<String,Integer> entry=iterator.next();
	   
		 String a=entry.getKey();
		    Integer b=entry.getValue();
		    System.out.println("key---"+a+"value---"+b);
	}
	
	
	for(Map.Entry<String,Integer> entry:map.entrySet())
	{
		 String a=entry.getKey();
		    Integer b=entry.getValue();
		    System.out.println("key---"+a+"value---"+b);
		    System.out.println("-------------------------");
	}
}
}
