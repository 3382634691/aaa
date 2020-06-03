package 项目测试;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;



public class 小记事本测试{
public static void main(String[] args)
{
	
	JFrame jframe=new JFrame("标题");

	Container con=jframe.getContentPane();
	JLabel jl=new JLabel("这是一个标签");
	con.add(jl);
	jframe.setVisible(true);
	jframe.setSize(200,150);
	jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	

}
}
