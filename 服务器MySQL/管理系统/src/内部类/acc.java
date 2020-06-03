package 内部类;

public class acc {
	acc()
	{
		System.out.println("无参构造");
	}
	acc(int i)
	{
		System.out.println("有参构造");
	}
	public static void main(String[] args)
	{
		new acc();
	}

}
