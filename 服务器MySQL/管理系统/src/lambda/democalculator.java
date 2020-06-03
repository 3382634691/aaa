package lambda;

public class democalculator {
	
	public static void main(String[] args)
	{
		invoke(10,20,new calculator()
				
				{

					@Override
					public int calc(int a, int b) {
						// TODO 自动生成的方法存根
						return a+b;
					}
			
				}
				);
		
		
		invoke(102,202,(a,b)->
		{
			return a+b;
		});
		//简化后
		invoke(102,202,(a,b)->a+b);
	}
	
	public static void invoke(int a,int b,calculator c)
	{
		int sum =c.calc(a, b);
		System.out.println(sum);
	  
	}

}
