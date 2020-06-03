package javaSEjc;

public class d {
	private int i=1,y=2;
public static void main(String[] args)
{
	d[] ds=new d[5];
	for(int i=0;i<ds.length;i++)
	{
		ds[i]=new d(i,i);
	}
	d c=new d(32,1);
	System.out.println("类的toString方法是"+c.toString()); 
	System.out.println("引用数组的是"+ds[2]);
	aa(c);
}



public static void aa(d ddd)
{
	System.out.println("ddd是"+ddd.i);
}

public void a()
{
	System.out.println("我是方法a");
}


//@Override
//public String toString() {
//	return "d [i=" + i + ", y=" + y + "]";
//}


d(int i ,int y)
{
	super();
	this.i=i;
System.out.println("本类对象的i "+this.i);
System.out.println("构造参数的i  "+i);
 
}
d()
{
	System.out.println("我是无参构造方法");
}


}
