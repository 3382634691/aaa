package javaSEjc;

public class fengz {
public static void main(String[] args)
{
	g gg=new g(1212,"121");
	g gg2=new g(1,"2222");
	System.out.println(gg.getName());
	System.out.println(gg.getId());
	System.out.println(gg2.getName());
	System.out.println(gg.toString());
	gg.setId(111);
	System.out.println(gg.getId());
}
}
