package mysqlce;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class a {
	static ArrayList<String> names1=new ArrayList<>();
	static ArrayList<String> ids1=new ArrayList<>();

	
    
   
	
	
	public static void main(String[] args)
	{
		 Connection conn = null;
		 Statement my;
		 ResultSet run;
		 PreparedStatement sql;
		 
		 try{
        	 Class.forName("com.mysql.jdbc.Driver");
            //getConnection()方法，连接MySQL数据库！
       System.out.println("驱动加载成功");
         }
         catch(ClassNotFoundException e){
             //数据库驱动类异常处理
        System.out.println("数据库驱动加载失败！");
   
   
        
        }
	 
		 new jframe().jframes();
	       
	  
	}
}

class jframe
{
  static  ArrayList<chat> set=new ArrayList<>();
static	String namex;
	File file=new File("pass.txt");
	
	 ArrayList<String> names1=new ArrayList<>();
		ArrayList<String> ids1=new ArrayList<>();
		ArrayList<String> pass1=new ArrayList<>();
		Connection conn = null;
		 Statement my;
		 ResultSet run;
		 PreparedStatement sql;
		 String readd = null;
			
 void jframes()
 {
	 
 boolean bin =false;
	 if(file.exists())
	 {
		
	 }
	 else
	 {
		 try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		 
		 
	 }
	 
	 
	 try {
		FileReader reader=new FileReader(file);
		BufferedReader buf=new BufferedReader(reader);
		
	try {
		readd=buf.readLine();
		if(readd!=" ")
		{
			bin=true;
		}
	} catch (IOException e1) {
		// TODO 自动生成的 catch 块
		e1.printStackTrace();
	}
	} catch (FileNotFoundException e2) {
		// TODO 自动生成的 catch 块
		e2.printStackTrace();
	}
	 
	 
	 JLabel label = new JLabel();
	
		names1=new a().names1;
		ids1=new a().ids1;
	 Connection con2;
	 Statement sql;
	 ResultSet res;
	 
	 
	 JFrame jFrames = new JFrame("(๑╹ヮ╹๑)ﾉ 轻聊");
	 JLabel jlabel=new JLabel();
	 JLabel jlabelz=new JLabel("账号");
	 JLabel jlabelm=new JLabel("密码");
	 JTextField jtext=new JTextField("",15);
	 label.setIcon(new ImageIcon("210.png"));
	JRadioButton danxuan =new JRadioButton("记住密码");
	 JTextField jtext2=new JTextField("",15);
	JButton jbutton1=new JButton("登录");
	JButton jbutton2=new JButton("注册");
	 jFrames.add(jlabel);
	 jFrames.add(jlabelz);
   JLabel zt= new JLabel("");
  
	 jFrames.add(jtext);
	 jFrames.add(jlabelm);
	 jFrames.add(jtext2);
	 jFrames.add(jbutton1);
	 jFrames.add(jbutton2);
	 jFrames.add(danxuan);
	 jFrames.add(zt);
	jFrames.add(label);
	
	 jFrames.setVisible(true);
     jFrames.setSize(240,450);
     jFrames.setLocation(400,200);
     jFrames.setLayout(new FlowLayout(0,10,10));    
     

   
     
     danxuan.addActionListener(new ActionListener()
    		 {

				@Override
				public void actionPerformed(ActionEvent e) {
					String zhanghao=jtext.getText();
					String mima=jtext2.getText();
					
					
					
					try {
						FileWriter out=new FileWriter(file);
						out.write("账号"+zhanghao+"密码"+mima+"完");
						out.close();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					
					
				}
    	 
    		 }
    		 );
     
     
     
     String zh;
     try {
     if(bin=true) {
     zh= readd.substring(readd.indexOf("账号")+2,readd.indexOf("密码"));
   String mm2;
   mm2=readd.substring(readd.indexOf("密码")+2,readd.indexOf("完"));
   
   jtext.setText(zh);
   jtext2.setText(mm2);
     }
     }catch(Exception e2)
     {
    	 e2.printStackTrace();
     }
     
    Boolean bool=false;
	 
     
     try {
		conn=DriverManager.getConnection("jdbc:mysql://cdb-7iyyamp1.gz.tencentcdb.com:10024/text?useSSL=false& useUnicode=true & characterEnunicode=UTF8","root","19991104w");
			
	    System.out.println("数据库连接成功！");
	    
	    my=conn.createStatement();
	   
	    run=my.executeQuery("select*from user");
	    while(run.next())
	    {
	    	String name=run.getString("name");
	    	String id=run.getString("id");
	    	String pass=run.getString("pass");
	    	chat c= new chat(name,id);
	    	set.add(c);
	    	
	    	System.out.println("账号:"+name+"密码"+id);
	    	names1.add(name);
	    	ids1.add(id);
	    	pass1.add(pass);
	    	
	    }
	 
//     int count = my.executeUpdate("insert into user values(100,3000)");
 
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
     jbutton2.addActionListener(new ActionListener()
    		 {

				@Override
				public void actionPerformed(ActionEvent e) {
				
					
					JFrame jFrame3 = new JFrame("注册");
					
					 jFrame3.setBounds(0,0,200,150);
					  jFrame3.setLayout(new FlowLayout(1,10,10));    
						 jFrame3.setVisible(true);
						 jFrame3.setVisible(true);
				          jFrame3.setSize(200,250);						      
				          jFrame3.setLocation(600,200);
				          JButton button11=new JButton();
		                  button11.setText("注册");
		                  
		                  JTextField xm=new JTextField("昵称",15);
		                  JTextField xm2=new JTextField("账号",15);
		                  JTextField pass2=new JTextField("密码",15);
		                  jFrame3.add(xm);
		                  jFrame3.add(xm2);
		                  jFrame3.add(pass2);
		                  jFrame3.add(button11);
		             
		                  button11.addActionListener(new ActionListener()
		         		 {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO 自动生成的方法存根
								
								
								String zhh=xm.getText();
								String mm=xm2.getText();
								String pass=pass2.getText();
								try {
									int count = my.executeUpdate("insert into user(name,id,pass) values('"+zhh+"',+"+mm+","+pass+")");
									JOptionPane.showMessageDialog(null,"你注册啦","注册成功",JOptionPane.OK_OPTION);
									new jframe();
									
								} catch (SQLException e1) {
									// TODO 自动生成的 catch 块
									e1.printStackTrace();
								}
							}
		                	  
		         		 });

				}
    	 
    		 }
    		 );

     jbutton1.addActionListener(new ActionListener()
    		 {
    	 boolean bool=false;
             
				@Override
				public void actionPerformed(ActionEvent e) {
					
					 String names=jtext.getText();
				     String ids=jtext2.getText();
				
					for(String i:ids1)
					{
						
						for(chat a:set)
						{
							if(a.getid().equals(i))
							{
								namex=a.getName();
							}
						}
					for(String a:pass1)
					{
						
						
						
						if(names.equals(i)&&ids.equals(a))
						{
							
							JOptionPane.showMessageDialog(null,"登录成功啦","登录成功",JOptionPane.OK_OPTION);
							bool= true;
							System.out.println("名字是"+namex);
							
							
			
							new liao();
						}
						
						
						
						
						
						if(bool)
						{
							zt.setText("登录成功");
						
						}
						else
						{
							zt.setText("登录失败");
						}
					}
					}
				}
    	 
    		 }
    		 );
 }
}



class liao extends JFrame
{
	
	ArrayList<String> chars1=new ArrayList<>();
	ArrayList<String> id1=new ArrayList<>();
	 Connection conn = null;
	 Statement my;
	 ResultSet run;
	 PreparedStatement sql;
	 String namee=new jframe().namex;
	 JTextArea jtextarea=new JTextArea();
     JScrollPane jscrollpane=new JScrollPane(jtextarea);
	liao()
	{
	
		System.out.println("传入的名字是"+namee);
		Container conratiner=getContentPane();
		Container conratiner2=getContentPane();
		JLabel jlanel=new JLabel("");
		JFrame jFrame3 = new JFrame("轻聊");
		JTabbedPane tabbedpane=new JTabbedPane();
		tabbedpane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
       
		 jFrame3.setBounds(0,0,200,150);
		
			 jFrame3.setVisible(true);
			 jFrame3.setVisible(true);
	          jFrame3.setSize(500,550);						      
	          jFrame3.setLocation(600,200);
	          JButton button11=new JButton("发送");
	          button11.setText("发送");
	         
	          
	         
		  try {
				conn=DriverManager.getConnection("jdbc:mysql://cdb-7iyyamp1.gz.tencentcdb.com:10024/text?useSSL=false","root","19991104w");
					
			    System.out.println("数据库连接成功！");
			    
			    my=conn.createStatement();
			   
			    run=my.executeQuery("select*from chars");
			    while(run.next())
			    {
			    	String id =run.getString("id");
			    	String chars=run.getString("chars");
			 chars1.add(chars);
			 id1.add(id);
			 jtextarea.append(id+":"+chars+"\n");
			    	
			    }
			    
			    
			    
			    
			 
//		     int count = my.executeUpdate("insert into user values(100,3000)");
		 
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
		
		  JPanel panel=new JPanel();
          JLabel text2=new JLabel("");
          conratiner2.add(text2);
  		JLabel text1=new JLabel("");
  		JTextField xm2=new JTextField("",15);
  	     xm2.setBounds(10,450,350,20);
  	     button11.setBounds(400,450,40,20);
  	     conratiner.setBounds(0,500,400,400);
  		conratiner.add(button11);
  		conratiner.add(xm2);
  		conratiner.add(jscrollpane);
  		
  		
  		JTextField te=new JTextField("",15);
      te.setBounds(0,0, 150,20);
      JButton but=new JButton("搜索");
      but.setBounds(0,100,50,20);
      DefaultMutableTreeNode root = new DefaultMutableTreeNode("好友");
      DefaultMutableTreeNode S1 = new DefaultMutableTreeNode("aaa");
      root.add(S1);
		JTree tree = new JTree(root);
		
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		JScrollPane scrollPane = new JScrollPane(tree);
		scrollPane.setBounds(20, 20, 250, 400);
       tree.addTreeSelectionListener(new TreeSelectionListener() {
		

			@Override
			public void valueChanged(TreeSelectionEvent e) {
				// TODO 自动生成的方法存根
			
			}
		});

      
      
     
		

       panel.add(te);
       panel.add(but);
      
       panel.add(tree);
    
       
       
       
       
       
       
  		
  		tabbedpane.addTab("聊天区",conratiner);
  		tabbedpane.addTab("好友",panel);
        tabbedpane.addTab(namee,text1);
        
        
      
         
          jFrame3.add(jlanel);
          jFrame3.add(tabbedpane);
         
         
          

        but.addActionListener(new ActionListener()
        		{

					@Override
					public void actionPerformed(ActionEvent e) {
					String mz=te.getText();
					for(chat c:new jframe().set)
					{
						if(c.getName().equals(c))
						{
			

						}
					}
				
					}
        	
					
        		}
);          
         
          button11.addActionListener(new ActionListener()
  		 {

        	  
        	  
        	  
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 自动生成的方法存根
					
					String mm=xm2.getText();
				
					try {
						
						int count = my.executeUpdate("insert into chars(chars,id) values('"+mm+"','"+namee+"')");
						xm2.setText("");
						
					} catch (SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					updata();
				}
         	  
  		 });

	     
      
	}
	
	
	
	
	void updata()
    {
jtextarea.setText("");
		try {
			conn=DriverManager.getConnection("jdbc:mysql://cdb-7iyyamp1.gz.tencentcdb.com:10024/text?useSSL=false","root","19991104w");
				
		    System.out.println("数据库连接成功！");
		    
		    my=conn.createStatement();
		   
		    run=my.executeQuery("select*from chars");
		    while(run.next())
		    {
		    	String id =run.getString("id");
		    	String chars=run.getString("chars");
		 chars1.add(chars);
		 id1.add(id);
		 jtextarea.append(id+":"+chars+"\n");
		    	
		    }
		    
		    
		    
		    
		 
//	     int count = my.executeUpdate("insert into user values(100,3000)");
	 
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	
    }
}



	class chat{
		private String aname;
		private String apass;
		chat(String aname,String apass)
		{
		this.aname=aname;
		this.apass=apass;
		}
		public String getName()
		{
			return aname;
		}
		public String getid()
		{
			return apass;
		}
	}
