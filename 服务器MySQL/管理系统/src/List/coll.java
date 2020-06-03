package List;

import java.util.ArrayList;
import java.util.Collections;

public class coll {
public static void main(String[] args)
{
	ArrayList<Integer> lists=new ArrayList<>();
	ArrayList<String> list=new ArrayList<>();
	list.add("a");
	list.add("a");
	list.add("a");
	list.add("a");
	
	Collections.addAll(list,"1","2","3");
	System.out.println(list);
	//大乱顺序
	Collections.shuffle(list);
	System.out.println(list);
	
	
	
	
	ArrayList<Integer> ints=new ArrayList<Integer>();
	Collections.addAll(ints,1,5,3,2);
	System.out.println(ints);
	Collections.sort(ints);
	System.out.println(ints);
	
	ArrayList<String> intss=new ArrayList<String>();
	intss.add("a");
	intss.add("e");
	intss.add("b");
	Collections.sort(intss);
	System.out.println(intss);
	
	
	
}
}
