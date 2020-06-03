package 多线程;

public class baozipu extends Thread{
private baozi bz;
int count=0;
public baozipu(baozi bz) {
	super();
	this.bz = bz;
	
}
public void run()
{
	while(true) {
	synchronized(bz)
	{
		if(bz.flag ==true)
		{
		try {
			System.out.println("包子铺等待了");
			bz.wait();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		}
		if(count%2==0)
		{
			bz.pi="薄皮";
			bz.xian="三鲜";
					
		}else
		{
			bz.pi="冰皮";
			bz.xian="牛肉";
		}
		count++;
		System.out.println("包子铺正在生产"+bz.pi+bz.xian+"包子");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		bz.flag=true;
		bz.notify();
		
		System.out.println("包子铺已经生产完毕"+bz.pi+bz.xian+"包子");
		System.out.println("==============");
	}
}
}
}
