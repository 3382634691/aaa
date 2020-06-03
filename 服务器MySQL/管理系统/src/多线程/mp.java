package 多线程;

public class mp {
public static void main(String args[])
{
	
   runnable run=new runnable();
   System.out.println("实例化"+run);
   Thread thread=new Thread(run);
   Thread thread2=new Thread(run);
 Thread th3=new Thread(run);
   thread.start();
   thread2.start();
   th3.start();
   
}
}
