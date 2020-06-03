package mysqlce;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b {
	static int i=0;
public static void main(String[] args)
{
	
	new d();
ExecutorService exec = Executors.newCachedThreadPool();


exec.submit( new Callable<Integer>()
		{
	public Integer call() throws Exception {
		
		return 12;
	}
		}

		
		);

    exec.execute(    
    	 
    		new Thread(new Runnable()
    		{
    			@Override
    			public void run() {
    				// TODO 自动生成的方法存根
    				while(i<10)
    				{
    				i++;
    				System.out.println(i);
    				}
    			}
    		}
    		)
    		);
    exec.shutdown();
       while(true) {
      if(exec.isTerminated()) {
       System.out.println("我启动了");
       break;
}
}
}


}




class d
{
	d()
	{
		ExecutorService exec = Executors.newFixedThreadPool(3);
		exec.execute(new caa());
		exec.execute(new caa());
		exec.execute(new caa());
	}
	
	
}

class caa  implements Runnable 
{
static int i=0;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		 synchronized  (b.class)
         {

		while(i<10)
		{
			i++;
			 System.out.println("我启动了"+i);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
         }
	}
	
	
}

