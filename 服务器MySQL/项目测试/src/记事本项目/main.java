package 记事本项目;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class main {
public static void main(String[] args)
{
	JFrame jframe=new JFrame("记事本小程序");

	jframe.setLayout(new FlowLayout(0,10,10));
	JButton button=new JButton("新建");
	JButton button2=new JButton("读取");
	Container con=jframe.getContentPane();
	button.setSize(80,80);
	button.setBounds(10,10,80,30);
	button2.setSize(80,80);
	button2.setBounds(10,10,80,30);
	
	con.add(button);
	con.add(button2);
	jframe.setVisible(true);
	jframe.setSize(500,550);
	jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
}
}
