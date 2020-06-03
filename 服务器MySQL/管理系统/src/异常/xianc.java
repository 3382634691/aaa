package 异常;

public class xianc {
	private String name;

	public xianc(String name) {	
		this.name = name;
		
	}
	public void run()
	{
		for(int i=0;i<7;i++)
		{
			System.out.println(getName()+"运行第"+i);
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
