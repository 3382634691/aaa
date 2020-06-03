package List;

import java.util.HashSet;

public class demoperson {
public static void main(String[] args)
{
	HashSet<person> set=new HashSet<>();//需要重写hashcode方法和equal方法
	person p1=new person("a",1);
	person p2=new person("a",1);
	person p3=new person("a",2);
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	System.out.println(p3.hashCode());
	System.out.println(p1==p2);
	System.out.println(p1.equals(p2));
	set.add(p1);
	set.add(p2);
	set.add(p3);
	System.out.println(set);
}
}
