package 多线程;

public class runable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"新线程创建了");
		
	}

}
