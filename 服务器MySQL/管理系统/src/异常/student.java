package 异常;

import java.util.Date;

public class student {
	private String name;
	private String id;
	private Date date;
	
	public student(String name, String id) {
	
		this.name = name;
		this.id = id;
	}
	student()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", date=" + date + "]";
	}

	public student(String name, String id, Date date) {
		super();
		this.name = name;
		this.id = id;
		this.date = date;
	}
	

}
