package 学生信息管理;

import java.io.Serializable;

public class student implements Serializable{
private String name;
private String id;
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
public student(String name, String id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "student [name=" + name + ", id=" + id + "]";
}
public student() {
	super();
}

}
