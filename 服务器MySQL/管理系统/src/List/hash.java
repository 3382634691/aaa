package List;

public class hash {
public static void main(String[] args)
{
	hash ha=new hash();
	int i=ha.hashCode();
	System.out.println(i);
	hash ha2=new hash();
	System.out.println(ha2.hashCode());
	System.out.println(ha);
	String s1=new String("abc");
	String s2=new String("abc");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println("12".hashCode());
	System.out.println("34".hashCode());
	System.out.println("重地".hashCode());
	System.out.println("通话".hashCode());
	Integer ints=12;
	System.out.println(ints.hashCode());
}

//public int hashCode()
//{
//	return 1;
//	
//}
}
