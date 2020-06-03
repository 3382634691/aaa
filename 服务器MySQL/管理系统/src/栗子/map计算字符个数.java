package 栗子;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map计算字符个数 {
public static void main(String[] args)
{
	
	Scanner scanner =new Scanner(System.in);
	String zf=scanner.next();
	HashMap<Character,Integer> map=new HashMap<>();
	char[] zfs=zf.toCharArray();
	for(char c:zfs)
	{
		if(map.containsKey(c))
		{
		Integer i=map.get(c);
		i++;
		map.put(c,i);
		}
		
		else {
		map.put(c, 1);	
		}
	}
	
	
	Set<Character> set=map.keySet();
	for(Character c:set)
	{
		System.out.println("单词"+c+"有"+map.get(c)+"个");
	}
	
	
}
}
