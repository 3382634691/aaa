package 多线程;



public class wait extends Thread{
 private ob object;
	public wait(ob object) {
	super();
	this.object = object;
}
	public void run()
	{
		while(true)
		{
		synchronized(object)
		{
		
			System.out.println("我还在执行");
		if(object.a==1)
		{
			try {
			
				object.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		object.notify();
		object.a=1;
		
		}
		
		
		
		}
	}
}
