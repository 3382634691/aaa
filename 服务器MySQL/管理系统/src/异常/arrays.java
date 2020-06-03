package 异常;

import java.util.ArrayList;

public class arrays {
	public static void main(String[] args)
	{
	ArrayList<String> arrays=new ArrayList<String>();
	arrays.add("1");
	arrays.add("13");
	arrays.add("12");
    String[] string=new String[5];
    String[] string1 = {"1","2","3","4","5"};
    
    String[] s=new String[arrays.size()];
    arrays.toArray(s);
    System.out.println(s);
    for(String i:s)
    {
    	System.out.println(i);
    }
    System.out.println("运行了");
}
}
