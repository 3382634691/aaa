package java基础;

public class statica {
static int a=10;
int b=1;
public static int getA() {
	return a;
}
public static void setA(int a) {
	statica.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}

}
