package List;

import java.util.HashSet;

public class hashs {
	public static void main(String[] args)
	{
		HashSet<String> hash=new HashSet<>();
		String a1=new String("a");
		String a2=new String("a");
		hash.add(a1);
		hash.add(a2);
		hash.add("a");
		hash.add("重地");
		hash.add("23");
		hash.add("通话");
		System.out.println(hash);
		
		for(String a:hash)
		{
			System.out.println(a);
		}
	}
}
