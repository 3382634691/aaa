package collection;

import java.util.ArrayList;

public class foreach {
	
public static void main(String[] args)
{
	int[] arr= {1,2,3};
	for(int a :arr)
	{
		System.out.println(a);
	}
	
	ArrayList<String> list=new ArrayList<>();
	list.add("1");
	list.add("2");
	for(String a:list)
	{
		System.out.println(a);
	}
}
}
