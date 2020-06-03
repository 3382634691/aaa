package List;

import java.util.ArrayList;
import java.util.Collections;

public class demoone {
public static void main(String[] args)
{
	ArrayList<demo01> list=new ArrayList<>();
	ArrayList<Integer> list01=new ArrayList<>();
	list01.add(1);
	list01.add(13);
	list01.add(12);
	list.add(new demo01("张三",18));
	list.add(new demo01("李四",16));
	list.add(new demo01("张",11));
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
}
}
