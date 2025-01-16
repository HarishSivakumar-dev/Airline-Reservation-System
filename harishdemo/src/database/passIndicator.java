package database;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import database.ChangePass;

public class passIndicator{
	
	passIndicator()
	{
		JFrame op=new JFrame();
		op.setSize(700,350);
		op.setLayout(null);
		op.setVisible(true);
		
		ChangePass po=new ChangePass();
		String pass=po.pass;
		
		JLabel ps=new JLabel("YOUR PASSWORD: "+pass);
		ps.setFont(new Font("calibri",Font.BOLD,25));
		ps.setBounds(150,140,1000,30);
		op.add(ps);
		
		JButton np=new JButton("Change Password");
		np.setBounds(300,200,150,20);
		op.add(np);
		
		np.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						newPass gy=new newPass();
					}
				});
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		passIndicator op=new passIndicator();

	}

}
