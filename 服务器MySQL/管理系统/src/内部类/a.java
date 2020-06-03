package 内部类;

public class a {
	
	 class b
	{
		b()
		{
			System.out.println();
			aa();
		}
		public void c()
		{
			System.out.println("我是内部类的方法");
		}
	}

	public static void main(String[] args)
	{
	a.b aa=new a().new b();
	aa.c();
	}
	
	
	public void acs()
	{
		
	}
	public void aa()
	{
		System.out.println("我是外部方法");
         
	
		
		class aba
		{
           
			 void abc()
			{
				 System.out.println("我是局部内部类");
				 acs();
			}
			}
		
		aba aba=new aba();
		aba.abc();
		}
	
	}
	
	

