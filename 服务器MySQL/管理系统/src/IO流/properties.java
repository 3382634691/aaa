package IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * properties集合继承hashteli这一早期接口
 * 专门为io流提供的集合
 * properties 作为一个双列集合  key和map的值均为string
 * Load方法是properties的一个特殊方法，参数可以填reader，在文本txt中以= 和空格作为默认的分割符号，自动填错键值对
 * #是可以忽略的   无等于空格的就是只有key无值
 */
public class properties {
public static void main(String[] args) throws IOException
{
//	show1();
	show2();
}

public static void show2() throws IOException
{
	Properties pro=new Properties();
	FileReader reader=new FileReader("E:\\javafile文件操作测试\\file.txt");
	pro.load(reader);
	Set<String> set=pro.stringPropertyNames();
	for(String a:set)
	{
		System.out.println(a+"===>"+pro.getProperty(a));
	}
}
/*
 * 
 */
public static void show1()
{
	Properties prop=new Properties();
	prop.setProperty("zhao", "168");
	prop.setProperty("eri", "1222");
	prop.setProperty("ero", "161");
	
	Set<String> set=prop.stringPropertyNames();
	for(String key:set)
	{
		String value=prop.getProperty(key);
		System.out.println(key+"=="+value);
	}
}
}
