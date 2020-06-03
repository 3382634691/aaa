package java基础;

public class lei {
	
public static void main(String[] args)
{
	statica sta=new statica();
	statica sta2=new statica();
	sta.b=20;
	System.out.println(sta.getB());
	System.out.println(sta2.getB());
	sta.a=10;
	
	System.out.println(sta.getA());
	System.out.println(sta2.getA());
}
}
