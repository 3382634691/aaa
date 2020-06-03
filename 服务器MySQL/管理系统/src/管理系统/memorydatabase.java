	package 管理系统;
	
	import java.util.ArrayList;
	
	public class memorydatabase {
	
		public ArrayList<studen> studenlist;
		//方法体
		{
			studenlist=new ArrayList<studen>();
			studenlist.add(new studen("01","1号"));
			studenlist.add(new studen("03","3号"));
			studenlist.add(new studen("04","4号"));
		}
		//查询方法
		public studen query(String id)
		{
			studen result=null;
			for(int i=0;i<studenlist.size();i++)
			{
			studen temp=studenlist.get(i);
	      if(temp.getId().equals(id))
	      {
		  result=temp;
		  break;
	        }
			}
		 	return result;
		}
		
		
		public int query(studen studen)
		{
			return studenlist.indexOf(studen);
			
		}
		
		public int insert(studen student)
		{
			int result=0;
			studenlist.add(student);
			result=1;
		   System.out.println("内存数据库在末尾新增学生纪律"+student);
				return result;
			}
			
		public int insert(int index,studen student)
		{
			int result=0;
			if(index>=0&&index<=studenlist.size())
			{
				System.out.println("内存数据库在"+index+"新增学生纪律"+student);
				result=1;
			}
			else
			{
				System.out.println("区间错误");
				result=0;
			}
			return result;
		}
		public int insert(ArrayList<studen> students)
		{
			int result=0;
			studenlist.addAll(students);
			result=students.size();
			return result;
		}
		
		public boolean delete(int index)
		{
			boolean result=false;
			if(index>=0&&index<=studenlist.size())
			{
				studenlist.remove(index);
				result=true;
			}
			else
			{
				System.out.println("删除数字不对");
				result=false;
			}
			return result;
			
		}
		
		
		public boolean delete(String id)
		{
			boolean result=false;
			for(studen temp:studenlist)
			{
				if(temp.getId().equals(id))
				{
					studenlist.remove(temp);
					result=true;
				}
				
			}
			return result;
		}
		
		
		public boolean update(int index,studen studen)
		{
			boolean result=false;
			if(index>=0&&index<studenlist.size())
			{
				studenlist.set(index,studen);
			}
			else
			{
				System.out.println("更新元素位置应该在0到");
			}
			return result;
		}
		public boolean update(studen old,studen newd)
		{
			boolean result=false;
			int index=query(old);
			if(index>=0&&index<studenlist.size())
			{
				studenlist.set(index,newd);
				result=false;
			}
			else
			{
				System.out.println("不存在旧对象");
				result=true;
			}
			return result;
		}
		
		public void print() {
	        System.out.println("数据库中共有对象记录数:"+studenlist.size());
	        int orderId=0;
	        for(studen temp:studenlist) {
	            System.out.println("\t"+orderId+":"+temp);
	            orderId++;
	        }
		}
	}
