package IO流;

import java.io.Serializable;

public class 序列化person implements Serializable
{
	private static final long serialVersionUID=123L;
	//可以通过serialversionuid的方法来实现uid不再变化
private  String name;
private  transient int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "序列化person [name=" + name + ", age=" + age + "]";
}
public 序列化person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public 序列化person() {
	super();
}

}
