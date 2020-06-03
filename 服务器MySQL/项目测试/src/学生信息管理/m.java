package 学生信息管理;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;



public class m {
	LinkedList<student> link=new LinkedList<>();
	public static void main(String[] args)
	{
		m m=new m();
		JFrame jframe=new JFrame("学生管理系统");

		jframe.setLayout(new FlowLayout(0,10,10));
		JButton button=new JButton("添加学生");
		JButton button1=new JButton("读取学生");
		JButton button2=new JButton("删除学生");
		JButton button3=new JButton("搜索学生");
	
		Container con=jframe.getContentPane();
		new m().setbutton(button);
		new m().setbutton(button2);
		new m().setbutton(button3);
		new m().setbutton(button1);
		
		con.add(button);
		con.add(button1);
		con.add(button2);
		con.add(button3);

		jframe.setVisible(true);
		jframe.setSize(500,550);
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		button.addActionListener(e->
				{
						m.add();
				});
		
		button1.addActionListener(e->
		{
			try {
				duqu();
			} catch (FileNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
		
		
	
	}
	
	
	public void setbutton(JButton j)
	{
	
		j.setSize(80,80);
		j.setBounds(10,10,80,30);
	}
	
	
	public void  add()
	{
		System.out.println("添加学生");
		
		JFrame jframe=new JFrame("添加学生");
	
		jframe.setLayout(null);
		 TextField f1 = new TextField("学生姓名");
		 TextField f2 = new TextField("学生年龄");
		JButton button=new JButton("确定");
		JButton button1=new JButton("取消");
	    
		Container con=jframe.getContentPane();
		new m().setbutton(button);

		new m().setbutton(button1);
		
	       f1.setBounds(80,10,80,20);
	       f2.setBounds(80,50,80,20);
	       
	       button.setBounds(100,100,80,30);
	       button1.setBounds(100,150,80,30);
		con.add(f1);
		con.add(f2);
		con.add(button);
		con.add(button1);
	
	
		jframe.setVisible(true);
		jframe.setSize(250,250);
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	button.addActionListener(e->
	{
		String name=f1.getText();
		String age=f2.getText();
		System.out.println(name);
		link.add(new student(name,age));
		
		try {
			try {
				IO.o(link);
			} catch (ClassNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		
		for(student s:link)
		{
			System.out.println(s.getName()+s.getId());
		}
	}
			);
		
		
	
	
	}
	
	
	
	public static void duqu() throws FileNotFoundException, ClassNotFoundException, IOException
	{
		
		
	
	
		ObjectInputStream oos=new ObjectInputStream(new FileInputStream("E:\\javafile文件操作测试\\学生管理系统\\list.txt"));
		Object ob=oos.readObject();
		
		System.out.println(((LinkedList<student>)ob));
		LinkedList<student> lin= (LinkedList<student>)ob;
	
		System.out.println(lin.size());
	for(student s:lin)
	{
	new m().link.add(s);
	
	}
		
		
		oos.close();
	  
		
	}
}
