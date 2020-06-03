package file文件操作;

public class 递归操作 {
public static void main(String[] args)
{
//	a();
	b(1);
//	new 递归操作().c(1);
	//最多栈是11157
	//构造方法禁止递归
}
public static void a()
{
	System.out.println("我是a方法");
	a();
}

public static void b(int i)
{

	
	System.out.println("i是"+i);
	
	b(i++);
	System.out.println("下面的操作");
	return;

//	c(1);


}


public static void  c(int ic)
{
	
	System.out.println("ic是"+ic);
	b(1);
	

}
}
