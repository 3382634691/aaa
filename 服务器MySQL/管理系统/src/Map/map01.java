package Map;

import java.util.HashMap;
import java.util.Map;

/*map集合的特点
 * 1.map集合是一个双列集合。一个元素包含两个值key和value
 * 2.map集合中的元素value和key可以相同可以不同
 * 3.key不允许重复value可以
 * 4.map中key与value一一对应
 * 双列集合
 * 
 * 
 * Hashmap集合的特点
 * 数组+单向链表/红黑树（链表长度超过8）
 */
public class map01 {
public static void main(String[] args)
{
	show01();
	show2();
}

public static void show01()
{
	Map<String,String> map=new HashMap<>();
	Map<String,Integer> map02=new HashMap<>();
	Integer v12=map02.put("12",2);
	String v1=map.put("01","小王");
	System.out.println("v1     "+v1);
	String v2=map.put("01","小王");
	System.out.println("v2     "+v2);
	System.out.println(map);
	
	
    map.put("11","小王");
	map.put("12","小w");
	map.put("13","小a");
	map.put("14","小a");
	System.out.println(map);
}


public static void show2()
{
	Map<String,Integer> map02=new HashMap<>();
	map02.put("xiao",168);
	map02.put("a",170);
	map02.put("b",180);
	System.out.println(map02);
	Integer in=map02.remove("xiao");
	System.out.println(in);
//	int in2=map02.remove("1");
	System.out.println(map02);
	
	Integer i=map02.get("a");
	System.out.println(i+"       a");
	
	Boolean bool1=map02.containsKey("a");
	System.out.println("bool1:"+bool1);
	Boolean bool2=map02.containsKey("xx");
	System.out.println("b2"+bool2);
}
}


