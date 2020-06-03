package 多线程;

public class chihuo extends Thread{
private baozi bz;
public chihuo(baozi bz)
{
	this.bz=bz;
}

public void run()
{
	while(true)
	{
		synchronized(bz)
		{
			if(bz.flag==false)
			{
				try {
					System.out.println("吃货正在等待状态");
					bz.wait();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("chihuo正在吃"+bz.pi+bz.xian+"包子");
			bz.flag=false;
			bz.notify();
			
			System.out.println("吃货已经吃完包子了，包子铺开始生产包子");
			System.out.println("_____________________________________");
		
		}
	}
}
}
