package 栗子;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 斗地主plus {
	private static int i=0;
public static void main(String[] args)
{

	List<String> color =List.of("♠","♣","♦","♥");
	List<String> numbers=List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
	List<Integer> L = new ArrayList<>();
	List<Integer> player1=new ArrayList<>();
	List<Integer> player2=new ArrayList<>();
	List<Integer> player3=new ArrayList<>();
	List<Integer> player=new ArrayList<>();

	Map<Integer,String> map=new HashMap<>();
	for(String c:numbers)
	{
		for(String d:color)
		{
			i++;
			map.put(i,c+d);
			L.add(i);
		}
	}
	
	System.out.println(map);

	
	Collections.shuffle(L);
	for(int i=0;i<L.size();i++)
	{
		if(i>48)
		{
			player.add(L.get(i));
		}
		else {
	if(i%3==0)
	{
		player1.add(L.get(i));
	}
	if(i%3==1)
	{
		player2.add(L.get(i));
	}
	if(i%3==2)
	{
		player3.add(L.get(i));
	}
		}
	}

	
	
	Collections.sort(player);
	Collections.sort(player1);
	Collections.sort(player2);
	Collections.sort(player3);
	
	
	
	System.out.println("player"+player);
	System.out.println("player1"+player1);
	System.out.println("player2"+player2);
	System.out.println("player3"+player3);
	kanpai(player,"底牌",map);
	kanpai(player1,"1号玩家",map);
	kanpai(player2,"2号玩家",map);
	kanpai(player3,"3号玩家",map);
	
	
}

public static void kanpai(List<Integer> name,String names,Map<Integer,String> map)
{
	
   System.out.print(names+"  ");
	for(int i:name)
	{
		System.out.print("  "+map.get(i));
		
		
	}
	
	System.out.println();
}
}
