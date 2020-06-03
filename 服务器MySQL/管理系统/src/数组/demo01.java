package 数组;

public class demo01 {
public static void main(String[] args)
{
	//1.动态初始化数组
	int[] a=new int[10];
	//静态初始化数组
	int[] b=new int[] {1,2,3};
	String[] array=new String[] {"a","b"};
	//省略初始化
	int[] ab= {1,2,3};
	
	//直接打印数组得到的是他的内存哈希值（16进制）
	System.out.println(ab);//[I@27973e9b
	
	
	String ac="a";
	System.out.println(ac.hashCode());//97
	if(ac=="a")
	{
		System.out.println("这是a");
	}
	
	
	int[] b2=b;
	System.out.println(b2);
	b2[0]=10;
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b[2]);
}
}
