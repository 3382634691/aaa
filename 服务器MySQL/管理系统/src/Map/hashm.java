package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * 遍历map集合的方法，使用keyset方法将key转换为对应的set集合
 */
public class hashm {
public static void main(String[] args)
{
	Map<String,Integer> map=new HashMap<>();
	map.put("第一号",1);
	map.put("2号",2);
	map.put("3号",3);
	Set<String> set=map.keySet();
	Iterator<String> it=set.iterator();
	while(it.hasNext())
	{
		String key=it.next();
		Integer in=map.get(key);
		System.out.println("key----"+key+"vlue---"+in);
	}
	
	
	for(String a:map.keySet())
	{
		Integer in=map.get(a);
		System.out.println("key---"+a+"vlue--"+in);
	}
}
}
