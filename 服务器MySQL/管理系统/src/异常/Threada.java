package 异常;

public class Threada {
public static void main(String args[])
{
	new Thread()
	{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	}.start();
	
	
	new Thread(new Runnable()
	{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
	}
	).start();
}
}
