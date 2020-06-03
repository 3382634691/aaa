package collection;

public class demo02 {
public static void main(String[] args)
{
	generic gen=new generic();
	gen.setName("为啥");
	System.out.println(gen.getName());
	gen.setName(23);
	
	
	System.out.println(gen.getName());
	Object obj=gen.getName();
	generic<Integer> gen2=new generic<Integer>();
	gen2.setName(2);
	
	
}


}
