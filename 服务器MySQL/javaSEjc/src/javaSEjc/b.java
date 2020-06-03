package javaSEjc;

import java.util.Date;
import java.util.Scanner;

public class b {
	 private int a=10;
	 public int  a2=12;
	
	 /**
	  * 
	  * @param args
	  */
	public static void main(String[] args)
	{
		 String sur;
//		sur=new Scanner(System.in).nextLine();
//		System.out.println(sur);
//		switch(sur) {
//		case "a":
//			System.out.println("aaa");
//			break;
//			default :
//				
//		}
		 int aa[]= {1,2,3,4,6,9};
		 for(int i=0;i<6;i++)
		 {
			 System.out.println(aa[i]);
			 
		 }
		 
		
		int i=0;
		do {
			i++;
			System.out.println(i);
		}while(i<10);
		
		float a=10;
		System.out.printf("%f",a);
		/*
		 * 
		 */
		ad(new Date());
	}
	
	

	static void ad(Date date)
	{
		System.out.println(date);
	}
	public static int ac()
	{
		return 2;
	}
	
	public int a1(int i,int a)
	{
		
		return 1;
	}
	public int a2(int i,int a, String c)
	{
		return 2;
	}
	
	
	

}
 
class b2{
	
}
