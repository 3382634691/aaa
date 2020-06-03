package 异常;

public class run {
public static void main(String agrs[])
{
   Thread thread=new Thread();
   runable run=new runable();
	new Thread(new runable()).start();
	for(int i=0;i<10;i++)
	{
		System.out.println(Thread.currentThread().getName()+"-->"+i);
	}
}
}
