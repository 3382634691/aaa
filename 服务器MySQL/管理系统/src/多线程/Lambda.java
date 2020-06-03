package 多线程;

public class Lambda {
	public static void main(String[] args)
	{
		new Thread(()->
		{
			System.out.println("线程创建了");
		}
				).start();
		
	new Thread(new Runnable()
	{
		public void run() {
		System.out.println("线程2创建了");
		}
	}
			).start();
	}
	}


