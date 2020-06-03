package List;

import java.util.LinkedList;
import java.util.List;

public class linked {
//查询慢，增删快
	//采用链表的储存结构
	public static void main(String[] args)
	{
		
		LinkedList<String> link=new LinkedList<>();
		link.add("a");
		link.add("b");
		link.add("c");
		System.out.println(link);
		link.addFirst("www");
		System.out.println(link);
		link.push("aaa");//等价于在第一个位置加一个元素
		link.addLast("come");
		System.out.println(link);
		link.get(2);
		link.removeFirst();
		link.removeLast();
		link.pop();//等价于移除第一个元素
	link.clear();
	if(!link.isEmpty())
	{
		  System.out.println(link.getFirst());
		    System.out.println(link.getLast());
	}
		
		List<String> list=new LinkedList<>();
	
	    
	    
	  
	}
	
	
}
