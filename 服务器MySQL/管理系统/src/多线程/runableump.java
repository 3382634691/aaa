package 多线程;

public class runableump implements Runnable{
	int i=0;
public void run()
{
	System.out.println("我开始执行i++");
	i++;
	
	System.out.println(Thread.currentThread().getName()+"--->"+i);
}
}
