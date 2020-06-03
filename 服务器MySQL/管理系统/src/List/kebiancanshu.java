package List;
/*
 * 底层是个数组，根据参数的不同，会闯进不同数量的数组
 * 
 */

/*
 * 可变参数应该注意：
 * 方法参数只能有一个参数列表不能有多个可变参数
 * 如果方法参数有多个，可变参数必须卸载参数列表的末尾
 */
public class kebiancanshu {
public static void main(String[] args)
{
	
	int[] ac= {1,2};
	System.out.println(add(10,3,20));
//	adds({1,2});
}

//public static void method(int...arr,String...b)
//{
//	
//}


public static void method(String b,int...arr)
{
	
}

public static void method(Object...ob)
{
	
}


public static void adds(int[] a)
{
	
}

public static int add(int...arr)
{
//	System.out.println(arr.length);
//	System.out.println(arr);
	int sum=0;
	for(int i:arr)
	{
		sum+=i;
	}
	return sum;
}









public int a(int a,int b,int c)
{
	return a+b+c;	
}
public int a(int a,int b)
{
	return a+b;
	
}
}
