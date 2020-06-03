package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashmaplinked {
public static void main(String[] args)
{
	Map<String,Integer> map=new LinkedHashMap<>();
	map.put("a", 1);
	map.put("c", 1);
	map.put("b", 1);
	System.out.println(map);
}
}
