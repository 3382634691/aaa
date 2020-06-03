package 异常;

public class runable implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}

}
