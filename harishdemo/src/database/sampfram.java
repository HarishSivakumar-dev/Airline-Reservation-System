package database;
import javax.swing.*;
import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField;
import database.register.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.*;
public class sampfram implements ActionListener

{
	JButton f1,sg;
	JFrame fr;
	JTextField jt,jt2,jt3;
	static String fname,email,sname,passc;
	sampfram()
	{
		JFrame fr=new JFrame("AIRLINE RESERVATION SYSTEM");
		fr.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\loginpage1.jpg")));
		fr.setLayout(null);
		fr.setSize(7000,7000);
		fr.setVisible(true);
		
		JLabel title=new JLabel("SWIFTWINGS AIRLINE RESERVATION SYSTEM");
		title.setBounds(200,10,2000, 200);
		title.setFont(new Font("times new roman",Font.BOLD,40));
		fr.add(title);
		
		JLabel logo=new JLabel("- - - FLY WITH LUXURY !");
		logo.setBounds(720,50, 400,200);
		logo.setFont(new Font("futura",Font.BOLD,20));
		fr.add(logo);
		
		JLabel jl=new JLabel("FIRST NAME");
		jl.setBounds(500,200,90,90);
		fr.add(jl);
		JTextField jt =new JTextField();
		jt.setBounds(610,235,150,25);
		fr.add(jt);

		JLabel jl2=new JLabel("LAST NAME");
		jl2.setBounds(500,260,90,90);
		fr.add(jl2);
		JTextField jt2=new JTextField();
		jt2.setBounds(610,298,150,25);
		fr.add(jt2);
	
		JLabel em= new JLabel("EMAIL ID");
		em.setBounds(500,320, 90, 90);
		fr.add(em);
		JTextField jt3=new JTextField();
		jt3.setBounds(610, 355, 150,25);
		fr.add(jt3);
	
		JLabel pass=new JLabel("PASSWORD");
		pass.setBounds(500,385,90,90);
		fr.add(pass);
	
		JPasswordField jt4=new JPasswordField();
		fr.add(jt4);
		jt4.setBounds(610,420,150,25);
		
		JCheckBox sp=new JCheckBox("SHOW PASSWORD");
		sp.setBounds(770,422,150,20);
		fr.add(sp);
		
		JButton f1=new JButton("log-in");
		f1.setBounds(480,550,80,20);
		fr.add(f1);
		JButton sg=new JButton("register");
		sg.setBounds(720,550,80,20);
		fr.add(sg);
		JButton de=new JButton("Clear");
		de.setBounds(600,600,80,20);
		fr.add(de);
		
		JLabel forg=new JLabel("Forgot Password ?");
		forg.setBounds(790,450,110,20);
		fr.add(forg);
		
		forg.addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent e)
					{
						ChangePass oi=new ChangePass();
						oi.ChangePas();
					}
				});
		

		sg.addActionListener(new ActionListener() 
		{
				public void actionPerformed(ActionEvent e)
				{
					register nw=new register();
					fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					fr.setVisible(false);
				}
		}
		);
		de.addActionListener(new ActionListener()
				{
			
					public void actionPerformed(ActionEvent e)
					{
						jt.setText("");
						jt2.setText("");
						jt3.setText("");
						jt4.setText("");
					}
				}
				);
		sp.addActionListener(new ActionListener()
		{
					public void actionPerformed(ActionEvent e)
					{
						if(sp.isSelected())
						{
							jt4.setEchoChar((char)0);
						}
						else
						{
							jt4.setEchoChar('#');
						}
					}
		}
		);
		f1.addActionListener(new ActionListener()
		{
			
			
			public void actionPerformed(ActionEvent e)
		{
			try
			{
				
				
				fname=jt.getText();
				sname=jt2.getText();
				email=jt3.getText();
				passc=jt4.getText();
				System.out.println("user TYPED:"+fname);
				System.out.println("user TYPED:"+sname);
				System.out.println("user TYPED:"+email);
				System.out.println("user TYPED:"+passc);
				if(fname.isEmpty())
				{
					JOptionPane.showMessageDialog(f1,"Enter Your FirstName !","WARNING",JOptionPane.WARNING_MESSAGE);
				}
				else if(sname.isEmpty())
				{
					JOptionPane.showMessageDialog(f1,"Enter Your SurName !","WARNING",JOptionPane.WARNING_MESSAGE);
				}
				else if(email.isEmpty())
				{
					JOptionPane.showMessageDialog(f1,"Enter Your Mail ID !","WARNING",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
					String st ="SELECT * FROM register WHERE firstname=? AND lastname=? AND email=?";
					PreparedStatement sm=conn.prepareStatement(st);
					sm.setString(1,fname);
					sm.setString(2,sname);
					sm.setString(3,email);
					ResultSet res=sm.executeQuery();
						if(res.next())
						{
							System.out.println("Valid LOGIN");
							String stt ="SELECT * FROM register WHERE pass=?";
							PreparedStatement smm=conn.prepareStatement(stt);
							smm.setString(1,passc);
							ResultSet rest=smm.executeQuery();
					
							if(rest.next())
							{
								System.out.println("VALID PASSWORD !");
								String s= "INSERT INTO logindet (firstname,surname,email)"+"VALUES(?, ?, ?)";
								PreparedStatement statement = conn.prepareStatement(s);
								statement.setString(1,fname);
								statement.setString(2, sname);
								statement.setString(3,email);
								statement.executeUpdate();
								
								reservation op=new reservation();
								fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								fr.setVisible(false);
							}
							else
							{
								
								JOptionPane.showMessageDialog(f1,"Wrong Password !","ERROR",JOptionPane.ERROR_MESSAGE);
								
							}
						}
						else
						{
							System.out.println("INVALID LOGIN");
							JOptionPane.showMessageDialog(f1,"No Such Users Found","ERROR",JOptionPane.ERROR_MESSAGE);
						}
						
				}
			}
			catch(Exception k)
			{
				System.out.println(k);
				JOptionPane.showMessageDialog(f1,"Network Busy !","ERROR",JOptionPane.ERROR_MESSAGE);
			}	
		}
		}
		);	
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sampfram obj=new sampfram();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
	}	
}