package 多线程;

public class suo {
public static void main(String[] args)
{

	Object object=new Object();
	new Thread()
	{
		public void run ()
		{
			synchronized(object)
			{
				System.out.println("顾客1告诉老板包子的种类和数目");
				try {
					object.wait();//object.wait(m);在m秒后如果未被唤醒则自己唤醒
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println("顾客1收到了");
			}
		}
	}.start();
	new Thread()
	{
		public void run ()
		{
			synchronized(object)
			{
				System.out.println("顾客2告诉老板包子的种类和数目");
				try {
					object.wait();//object.wait(m);在m秒后如果未被唤醒则自己唤醒
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println("顾客2收到了");
			}
		}
	}.start();;
	
	new Thread()
	{
		
		public void run ()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			synchronized(object)
			{
				System.out.println("做好了包子");
				object.notifyAll();
				System.out.println("及时被唤醒该线程也要执行完毕");
			}
		}
	}.start();
	
	
	
}
}
