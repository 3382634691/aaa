package javaSEjc;

public class f {
	
	
	int i,y;
	
public f(int i, int y) {
		super();
		this.i = i;
		this.y = y;
	}

public f(int i) {
		super();
		this.i = i;
	}
f()
{
	
}

@Override
public String toString() {
	return "f [i=" + i + ", y=" + y + "]";
}

public static void main(String[] args)
{
	f ff=new f(1);
	System.out.println(ff.toString());
}


}
