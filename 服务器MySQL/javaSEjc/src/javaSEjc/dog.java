package javaSEjc;

public class dog extends amin{
	
	String name;

	public dog(int age, int a, String name) {
		super(age,a);
		super.m();
		this.name = name;
	}
	
	public static void main(String[] args)
	{
		
	dog a=new dog(12,13,"66");
	amin amin=new amin();
	amin.m();
	amin dogs=new dog(12,13,"55");
	dogs.say();
	a.says();
	dogs.cxie();
	System.out.println(a.age);
	System.out.println(a.a);
	System.out.println(a.name);
	
	}
	
	public void cxie()
	{
		System.out.println("我是子类类的方法");
	}
	public void say(int i)
	{
  super.say();
		System.out.println("我重写了");
	}
	public void says()
	{System.out.println("我是重写的有参构造方法");
		
	}
	public static void m()
	{
		System.out.println("重写了m方法");
	}
	
}
