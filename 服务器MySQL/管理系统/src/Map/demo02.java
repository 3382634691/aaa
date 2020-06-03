package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo02 {
public static void main(String[] args)
{
	show2();
}

public static void show1()
{
	Map<String,fz> map=new HashMap<>();
	map.put("1号", new fz("张三",18));
	map.put("2号",new fz("李四",15));
	map.put("23号",new fz("四",15));
	
	map.put("2号",new fz("xiao四",15));
	
	
	for(String a:map.keySet())
	{
		String key=a;
		fz fz=map.get(key);
		System.out.println("key是"+a+"vlue是"+fz.getName()+fz.getAge());
		System.out.println("-------");
	}
}

public static void show2()
{
Map<fz,String> map=new HashMap<>();
map.put(new fz("女王",18), "英国");
map.put(new fz("秦始皇",18), "qin国");
map.put(new fz("普及",115), "els国");
map.put(new fz("女王",18), "毛里求斯国");

Set<Map.Entry<fz,String>> set =map.entrySet();
for(Map.Entry<fz, String> entry	:	set)
{
	fz fz=entry.getKey();
	System.out.println("1 is"+entry.getValue()+fz.getAge()+fz.getName());
}
}

}
