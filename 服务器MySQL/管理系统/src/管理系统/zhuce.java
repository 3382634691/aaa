package 管理系统;

import java.util.Scanner;

public class zhuce {
static String[] username= {"张三","李四","王五"};
public static void main(String[] args) throws reexception
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入您的用户名");
	String user=scanner.next();
	System.out.println();
	checkname(user);
}


public static void checkname(String name) throws reexception
{
	for(String name2:username)
	{
	if(name2.equals(name))
	{
		throw new reexception("重复");
		
	}

	}
	System.out.println("注册cg");
}
}
