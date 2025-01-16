package database;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class newPass{
	
	newPass()
	{
		JFrame op=new JFrame();
		op.setLayout(null);
		op.setSize(700,350);
		op.setVisible(true);
		
		JLabel old=new JLabel("Enter Old Password: ");
		old.setBounds(100,100,200,20);
		old.setFont(new Font("Calibri",Font.ITALIC,20));
		op.add(old);
		
		JLabel nw=new JLabel("Enter New Password: ");
		nw.setBounds(90,160,200,20);
		nw.setFont(new Font("Calibri",Font.ITALIC,20));
		op.add(nw);
		
		JLabel cnfm=new JLabel("Confirm Password: ");
		cnfm.setBounds(109,220,200,20);
		cnfm.setFont(new Font("Calibri",Font.ITALIC,20));
		op.add(cnfm);
		
		JTextField od=new JTextField();
		od.setBounds(270,99,200,22);
		op.add(od);
		
		JTextField nwps=new JTextField();
		nwps.setBounds(270,159,200,22);
		op.add(nwps);
		
		JPasswordField cnfmps=new JPasswordField();
		cnfmps.setBounds(270,219,200,22);
		op.add(cnfmps);
		
		JButton cfm=new JButton("Confirm ?");
		cfm.setBounds(300,280,100,20);
		op.add(cfm);
		
		JCheckBox hide=new JCheckBox("show password");
		hide.setBounds(470,219,200,20);
		op.add(hide);
		
		hide.addActionListener(new ActionListener()
				{
			
					public void actionPerformed(ActionEvent e)
					{
						if(hide.isSelected())
						{
							cnfmps.setEchoChar((char)0);
						}
						else
						{
							cnfmps.setEchoChar('$');
						}
						
					}
		
				});
		
		cfm.addActionListener(new ActionListener()
				{
					
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							
							
							String oldpass=od.getText();
							String newpass=nwps.getText();
							String cnfrm=cnfmps.getText();
							
							
							if(oldpass.isEmpty())
							{
								JOptionPane.showMessageDialog(cfm,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
							}
							else if(newpass.isEmpty())
							{
								JOptionPane.showMessageDialog(cfm,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
							}
							else if(cnfrm.isEmpty())
							{
								JOptionPane.showMessageDialog(cfm,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
							}
							else if(newpass.equals(cnfrm)==false)
							{
								JOptionPane.showMessageDialog(cfm,"Password Mismatch !","WARNING",JOptionPane.WARNING_MESSAGE);
							}
							else
							{
								passcheck oi=new passcheck();
								if(oi.checkcaps(newpass)==true && oi.checklen(newpass)==true && oi.checklow(newpass)==true && oi.checknum(newpass)==true && oi.checkspl(newpass)==true)
								{
									System.out.println("Verified !");
									Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
									String st ="SELECT * FROM register WHERE pass=?";
									PreparedStatement sm=conn.prepareStatement(st);
									sm.setString(1,oldpass);
									ResultSet res=sm.executeQuery();
									if(res.next())
									{
										System.out.println("entered");
										String ins="UPDATE register SET pass=? WHERE pass=? ";
										PreparedStatement m=conn.prepareStatement(ins);
										m.setString(1,newpass);
										m.setString(2,oldpass);
										m.executeUpdate();
										
										sampfram op=new sampfram();
										
									}
									else
									{
										JOptionPane.showMessageDialog(cfm,"Enter Valid Password !","WARNING",JOptionPane.WARNING_MESSAGE);
									}
								}
								else
								{
									JOptionPane.showMessageDialog(cfm,"Your Password Must Contain UpperCase, LowerCase, Special Characters and Numbers !","WARNING",JOptionPane.WARNING_MESSAGE);
								}
							}
							
						}
						catch(Exception w)
						{
							System.out.println(w);
						}
					}
		
				});
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		newPass cono=new newPass();

	}

}
