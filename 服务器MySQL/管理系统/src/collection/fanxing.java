package collection;

import java.util.ArrayList;

public class fanxing {
public static void main(String[] args)
{
	ArrayList<Integer> list1=new ArrayList<Integer>();
	ArrayList<String> list2=new ArrayList<>();
	ArrayList<Number> list3=new ArrayList<>();
	ArrayList<Object> list4=new ArrayList<>();
	
	get(list1);
	get(list2);
	get(list3);
	get(list4);
}

public static void get(ArrayList<? extends Number> coll)
{
	
}


public static void get2(ArrayList<? super Number> coll)
{
	
}
}

