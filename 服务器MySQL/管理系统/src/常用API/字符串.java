package 常用API;
//字符串内容永不可变
//字符串相当于byte数组

//字符串直接用""的值都会储存在字符常量池中（在堆内存中）
//new在堆内存中创建一个新的内存空间
public class 字符串 {
public static void main(String[] args)
{
	String string="123";
	string="什么";
	System.out.println(string);
}
}
