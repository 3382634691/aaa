package 多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class runnable implements Runnable{
	private int mps=100;
   Object object=new Object();
   Lock lock=new ReentrantLock();
	@Override
	public void run() {
		System.out.println("this"+this);
		while(true)
		{
//		{synchronized(object)
//			{
//			paytick();
//			}
			lock.lock();
			if(mps>0) {
				
				System.out.println(Thread.currentThread().getName()+"-->"+mps);
				mps--;
				}
			lock.unlock();
			
		}
		}
		
		
		
	
	
	public synchronized void paytick()
	{
		if(mps>0) {
			
			System.out.println(Thread.currentThread().getName()+"-->"+mps);
			mps--;
			}
	}
	}



