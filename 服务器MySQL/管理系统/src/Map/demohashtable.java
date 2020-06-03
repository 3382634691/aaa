package Map;

import java.util.HashMap;
import java.util.Hashtable;

public class demohashtable {
public static void main(String[] args)
{
	HashMap<String,String> map=new HashMap<String,String>();
	map.put("1","1");
	map.put(null, "b");
	map.put(null,null);
	
	System.out.println(map);
	
	Hashtable<String,String> hash=new Hashtable<>();
	hash.put(null, null);
	hash.put(null,"a");
}
}
