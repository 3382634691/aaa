package 异常;

public class fu {
	int i=0;
	public static void main(String[] args)
	{
		zi1 zi=new zi1(1);
		zi2 zi2=new zi2();
	   new fu().m();
	  
		
	}
	public void say()
	{

	}
	public void m()
	{
		new fu().ms();
	}
	public void ms()
	{
		
	}
	
	
	fu(int i)
	{
		System.out.println("调用了inti的构造");
	}
	fu()
	{
		System.out.println("无参构造");
	}
	
}
