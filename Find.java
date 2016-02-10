import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;
class Find implements ActionListener
{
	JFrame f;
	JButton b;
    JTextField tf;JLabel l;
	public Find()
	{
		f=new JFrame("Find IP Address");
		b=new JButton("FIND");
		b.setBounds(100,250,100,40);
		b.addActionListener(this);
		tf=new JTextField();
		tf.setBounds(50,100,300,40);
		tf.setFont(new Font("Arial", Font.PLAIN,20));
		l=new JLabel();
		l.setFont(new Font("Arial", Font.PLAIN,30));
		l.setText("Enter the URL:");
		l.setBounds(50,30,200,40);
	     l.setOpaque(true);
		f.add(l);
		f.add(tf);
		f.setSize(400,400);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e)
	{
         try{
		InetAddress add=InetAddress.getByName(tf.getText());
		String address=add.getHostAddress();
      //JOptionPane.showInternalMessageDialog(f, address,"jbkj", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(f, address);

		//JOptionPane.showMessageDialog(this,address);
	}catch(UnknownHostException ae)
	{
		 JOptionPane.showMessageDialog(null, "PLEASE  ENTER  A  VALID  URL","alert" ,JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(this,ae.toString());
	}

	}
	public static void main(String s[])
	{
		new Find();
	}
}
