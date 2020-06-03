package javaSEjc;

import java.util.Scanner;

public class c {
	
	
	
	public static void main(String[] args)
	{
		final String a212;
		
//		System.out.println("请输入年份");
//		Scanner scanner=new Scanner(System.in);
//		int nian=scanner.nextInt();
//		System.out.println("请输入月份");
//		Scanner scanner2=new Scanner(System.in);
//		int yuef=scanner.nextInt();
//		yue(nian, yuef);
	
		System.out.println("ceil方法的返回值是"+Math.ceil(10.2));
		System.out.println("min 方法"+Math.min(15, 6));
		System.out.println("返回随机数"+(int)(Math.random()*100));
		System.out.println("返回指定区间随机数"+(int)(1+Math.random()*10));
	System.out.println(new c().a1(1, 2));
	System.out.println(new c().a1(1, 2,"a"));
	}
	
	public int a1(int i,int a)
	{
		
		return 1;
	}
	
	public int a1(int i,int a, String c)
	{
		return 2;
	}
	public int a1(double i,int a)
	{
		
		return 1;
	}
	
	
	public static void yue(int yeah,int yue)
	{
		System.out.println("fanhui");
	}
	
	
	
}

class ac
{
	ac()
	{
		System.out.println("构造方法");
	}
}
