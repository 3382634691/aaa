package 多线程;

public class thread extends Thread{
	Object object=new Object();
	public void run()
	{
		synchronized(object)
		{
			System.out.println("告诉老板包子的种类和数目");
			try {
				object.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
