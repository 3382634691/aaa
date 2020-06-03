package 常用API;

import java.util.Random;
//获取一个随机数，范围是int，具有所有值
//random=nexInt(3)左闭右开；[0,3)

public class random {
public static void main(String[] args)
{
	Random random=new Random();
	int num=random.nextInt(100);
	System.out.println("随机数是"+num);
	
	//取得指定区间的随机数
	int max=50;
	int min=42;
	int nums=random.nextInt(max-min+1)+min;
	System.out.println(nums);
}
}
