package 异常;

import java.util.ArrayList;
import java.util.Scanner;

public class user {
	private student student;
	private ArrayList<Double> arraylist;
	public static void main(String[] args)
	{
	 user user=new user();
	 user.inputstudent();
	 user.input();
	 System.out.println("学生的总分是"+user.gettotal());
     System.out.println( "平均分是"+user.getaverage());
    System.out.println();
     
	}
	
	
      public void inputstudent() {
    	  Scanner scanner=new Scanner(System.in);
    	  System.out.println("请输入学会说呢过的学号姓名");
    	  String id =scanner.next();
    	  String name=scanner.next();
    	  this.student=new student(id,name);
      }
	public void input () {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入学生成绩");
		String scorestr;
		double score = 0;
		while(true)
		{
			scorestr=scanner.next();
			if(scorestr.equals("#"))
			{
				break;
			}
			try {
				score=Double.parseDouble(scorestr);
				System.out.println(score);
				
				arraylist.add(score);
			}catch(NullPointerException e)
			{
				arraylist=new ArrayList<Double>();
				arraylist.add(score);	
			} 
			catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
           for(int i=0;i<arraylist.size();i++)
           {
        	   System.out.println(arraylist.get(i));
           }
		}
		
		public double gettotal()
		{
			double total=0;
			for(double score:arraylist)
			{
				total+=score;
			}
			return total;
		}
		
		public double getaverage()
		{
			
			return gettotal()/arraylist.size();
		}
		
		

}
