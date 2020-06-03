package file文件操作;

public class 递归累加算法 {
public static void main(String[] args)
{
	System.out.println(show(6));
	int a=0;
	for(int i=1;i<=6;i++)
	{
		
		a=i+a;
	}
	System.out.println(a);
	
	
	
	System.out.println("阶乘的结果是"+show2(6));
}
public static int show(int n)
{
	if(n==1)
	{
		return 1;
		
	}
	 
	return n+show(n-1);
	
}


public static int show2(int a)
{
	if(a==1)
	{
		return 1;
		
	}
	return a*show2(a-1);
	
}
}
