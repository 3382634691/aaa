package List;

import java.util.HashSet;
import java.util.LinkedHashSet;

//底层是一个哈希表（数组+链表）+列表
//他是 有序 的
public class linkhash {
	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<>();
		set.add("www");
		set.add("aa");
		set.add("22");
		
	
		System.out.println(set);
		LinkedHashSet<String> linkset=new LinkedHashSet<>();
		linkset.add("www");
		linkset.add("aa");
		linkset.add("22");
		
		
		System.out.println(linkset);
		
	}

}
