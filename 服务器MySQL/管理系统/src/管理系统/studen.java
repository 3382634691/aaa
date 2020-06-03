    package 管理系统;
	
	import java.util.Date;
	
	public class studen {
	private String id;
	private String name;
	Date birthdate;
	protected double average=0;
	
	public studen()
	{
		
	}
	
	public studen(String id)
	{
		super();
		this.id=id;
		
	}
	
	public studen(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void setAverage(double average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return "studen [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", average=" + average + "]";
	}
	
	
	}
