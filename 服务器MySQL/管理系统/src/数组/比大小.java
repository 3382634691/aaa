package 数组;

public class 比大小 {
	static int max=0;
	static int abc;
	static int max2;
	static int temp2;
public static void main(String[] args)
{
	int[] m= {1,5,8,6,2,10,3};
	for(int i=0;i<m.length;i++)
	{
		System.out.println(i);
		if(m[i]>max)
		{
		 max=m[i];
		}
	}
	System.out.println("最大值是"+max);
	
	
	for(int mins=0,maxs=m.length-1;mins<max;mins++,max--)
	{
		int temp=m[mins];
		m[mins]=m[maxs];
		m[maxs]=temp;
	}
	for(int i=0;i<m.length/2;i++)
	{
		System.out.println(i);
		abc=m[i];
		m[i]=m[m.length-i-1];
		m[m.length-i-1]=abc;
	}
	System.out.println("----------");
	for(int i:m)
	{
		System.out.print("     "+i);
	}
	
	
	System.out.println("\n-----------------------\n");
	
	
	//冒泡排序
	for(int i=0;i<m.length;i++)
	{
		
	
		for(int a=0;a<m.length-i-1;a++)
		{
			if(m[a]>m[a+1])
			{
				int temp=m[a];
				m[a]=m[a+1];
				m[a+1]=temp;
			}
		}
	}
	
	
	
	//冒泡排序
	for(int i:m)
	{
		System.out.print(" 排序 "+i);
	}
	
}
}
