package 异常;

import java.util.Date;

public class cx extends student{
 int i;
	public cx(String name, String id, int e) {
		super(name,id);
		this.i=e;
		
	}
	cx()
	{
		
	}
        public static void main(String[] args)
        {
        	new cx().getId();
        	
        }
	
        public void m()
        {
        	super.getId();
        }
}
