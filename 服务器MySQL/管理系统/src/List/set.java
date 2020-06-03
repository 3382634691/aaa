package List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//1.不允许有重复的元素
//2.无索引
//Hash是无序的
//底层是个哈希表结构（查询非常快）
public class set {
public static void main(String[] args)
{
	Set<Integer> set=new HashSet<>();
	set.add(2);
	set.add(1);
	
	set.add(3);
	set.add(10);
	Iterator<Integer> in=set.iterator();
	while(in.hasNext())
	{
		System.out.println(in.next());
	}
	
	
	for(Integer i:set)
	{
		System.out.println(i);
	}
	
	Set<String> set2=new HashSet<>();
	set2.add("aa");
	set2.add("df");
	
	set2.add("3sa");
	for(String i:set2)
	{
		System.out.println(i);
	}
	

}
}
