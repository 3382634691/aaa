package javaSEjc;

public class g {
	private int id;
	private String sid;
	private String name;
	private int count;



public g(int id, String name) {
	
	this.id = id;
	this.name = name;
}

@Override
public String toString() {
	return "g [id=" + id + ", sid=" + sid + ", name=" + name + ", count=" + count + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getSid() {
	return sid;
}

public void setSid(String sid) {
	this.sid = sid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

}
