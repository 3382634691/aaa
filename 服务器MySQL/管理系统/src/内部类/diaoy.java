package 内部类;

public class diaoy {
  public static void main(String[] args)
  {
	  nib bu=new my();
	  bu.method();
	new nib()
	{

		@Override
		public void method() {
			// TODO 自动生成的方法存根
			System.out.println("调用了重写");
		}
		
	}.method();
	
	nib a=new nib()
			{

				@Override
				public void method() {
					// TODO 自动生成的方法存根
					System.out.println("调用了重写");
				}
		
			};
		a.method();	
		a.method();	
		a.method();	
		a.method();	
		
		
		
  }
  

}
