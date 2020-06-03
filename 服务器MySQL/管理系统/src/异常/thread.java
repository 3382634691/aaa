package 异常;

public class thread extends Thread{
	public thread()
	{
		
	}
	
	public thread(String name)
	{
		super(name);
	}
	
public void run()
{
	
		String name=getName();
		System.out.println(getName());
		Thread th=Thread.currentThread();
		
		System.out.println(th);
		System.out.println(Thread.currentThread().getName());

}
}
