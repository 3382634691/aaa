package 多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class run extends Thread{
	private int mps=100;
  private mps mp;
  
	public run(mps mps) {
	super();
	this.mp = mps;
}

	@Override
	public void run() {
		System.out.println("this"+this);
		while(true)
		{		
			synchronized(mp)
			{
			if(mps>0) {			
				System.out.println(Thread.currentThread().getName()+"-->"+mps);
				mps--;
				}
			}
		}
		}
}
		
		
		
