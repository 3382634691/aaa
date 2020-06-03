package lambda;

public class demo {
public static void main(String[] args)
{
	invoke(new cook()
			{
		public void makefood()
		{
			System.out.println("1111");
		}
			}
			);
	
	invoke(()->
	{
		System.out.println("22");
	}
			);
	
	
	invoke(()->	System.out.println("22"));
}

public static void invoke(cook cook)
{
	cook.makefood();
}
}
