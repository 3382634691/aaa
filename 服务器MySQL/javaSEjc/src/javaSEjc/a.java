package javaSEjc;

import java.util.Scanner;

public class a {
	public enum week{
		a,
		b,
		c
	};
	public static void main(String[] args)
	{
		boolean panduan;
	
		char a='a';
		final int ac=10;
		a='c';
		int[] acc=new int[10];
		int acd[]= {1,2,4};
		week day1=week.a;
	
		System.out.println("week is"+day1);
		System.out.println(ac);
		String b="我是一个String";
		String c=new String("aa");
		String a3="aa";
		
		panduan=a3 instanceof String;
		System.out.println(panduan+"判断结果是");
		System.out.println("c是"+c);
		System.out.println(a);
		System.out.println(5E4);
		int a2=2;
		a2+=a2;
		System.out.println("a2是"+a2);
		System.out.println("除法是"+8.0/0);
		int intj;
		String jies="aa";
		System.out.println("你可以输入了");
		Scanner scanner= new Scanner(System.in);
		 jies=scanner.next();
		 intj=scanner.nextInt();
		if(jies=="ac")
		System.out.println(jies);
	
	}

}
