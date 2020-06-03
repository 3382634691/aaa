package java基础;

public class demo {
public static void main(String[] args)
{
	jeikou j=new shixian();
	j.a();
	((shixian)j).c();
	
	jeikou j2=new shixian02();
	j2.a();
	new jeikou()
	{
		@Override
		public void a() {
			// TODO 自动生成的方法存根
			System.out.println("内部类");
		}
		
	}.a();
	
}


public static void s(jeikou j)
{
	j.a();
}
}
