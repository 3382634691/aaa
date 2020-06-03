package 异常;

public class xiancc {

	public static void main(String[] args)
	{
		thread thread=new thread();
		thread.start();
		thread.setName("啊");
		System.out.println(thread.getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(new thread("aaa").getName());
//		for(int i=0;i<20;i++)
//		{
//			System.out.println("main"+i);
//		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("现在运行了"+i);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			
		}
	}
	public void m()
	{
		System.out.println(Thread.currentThread().getName());
		
	}
}
