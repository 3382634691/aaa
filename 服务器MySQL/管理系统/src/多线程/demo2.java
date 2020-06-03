package 多线程;

public class demo2 {
public static void main(String[] args)
{
	ob object= new ob();
	wait wa=new wait(object);
wa.start();
new Thread()
{
	public void run()
	{
		while(true) {
	synchronized(object)
	{
		if(object.a==1)
		{
			System.out.println("你在等待了");
			try {
				object.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
		
		object.a=0;
		System.out.println("");
		object.notify();
	}
		}	}	
}.start();
}



}
