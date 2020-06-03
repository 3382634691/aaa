package 多线程;

public class mps {
public static void main(String args[])
{
	mps m=new mps();
   run run=new run(m);
   run run2=new run(m);
   System.out.println("实例化"+run);


   run.start();
   run2.start();

   
}
}
