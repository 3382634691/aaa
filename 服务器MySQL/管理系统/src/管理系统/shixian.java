package 管理系统;

import java.util.Date;
import java.util.Scanner;

public class shixian {

	public static void main(String[] args)
	{
		memorydatabase me=new memorydatabase();
		me.print();
		studen studen1=new studen("04","4好");
		studen1.setBirthdate(new Date(2000-19000,07-1,01));
		studen1.setAverage(90);
		me.insert(studen1);
		System.out.println("插入完成");
		me.print();
		
		studen studen2=new studen("03","小华");
		studen2.setBirthdate(new Date(2000-19000,07-1,01));
		studen2.setAverage(90);
		me.insert(studen2);
		
		studen studen3=me.query("03");
		if(studen3!=null)
		{
			System.out.println("数据库操作03的对象");
		}
		
	
	}
}
