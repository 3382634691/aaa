package 斗地主;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Doudizhu {
public static void main(String[] args)
{
	ArrayList<String> poker=new ArrayList<>();
	String[] colors= {"♠","♣","♦","♥"};
	String[] numbers= {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
	poker.add("大王");
	poker.add("小王");
	for(String color:colors)
	{
		for(String number:numbers)
		{
			poker.add(color+number);
		}
	}
	
	  System.out.println(poker);
	  Collections.shuffle(poker);//将集合中的元素随机大乱
	  
	  System.out.println(poker);
	  
	  
	  ArrayList<String> player01=new ArrayList<String>();
	  ArrayList<String> player02=new ArrayList<String>();
	  ArrayList<String> player03=new ArrayList<String>();
      ArrayList<String> dipai=new ArrayList<String>();
     for(int i=0;i<poker.size();i++)
     {
    	 if(i>=51)
    	 {
    		 dipai.add(poker.get(i));
    	 }
    	 else
    	 {
    		 if(i%3==0)
    			 player01.add(poker.get(i));
    		 if(i%3==1)
    			 player02.add(poker.get(i));
    		 if(i%3==2)
    			 player03.add(poker.get(i));
    	 }
     }
     
     
     System.out.println(player01);
     System.out.println(player02);
     System.out.println(player03);
     System.out.println(dipai);
}
}
