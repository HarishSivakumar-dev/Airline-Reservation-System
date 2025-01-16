package database;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.reservation;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;
public class register implements Runnable
{
	JFrame f;
	JComboBox nation;
	static String mobno;
	static String passch;
	register()
	{
		JFrame f=new JFrame();
		f.setLayout(null);
		f.setSize(6000,6000);
		f.setVisible(true);
		
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\maxresdefault.jpg")));
		
		JLabel tit=new JLabel("----------NEW USER REGISTRATION----------");
		tit.setBounds(400,20,2000,40);
		tit.setFont(new Font("CALIBRI",Font.BOLD,30));
		f.add(tit);
		
		JLabel fn=new JLabel("FIRST NAME");
		fn.setBounds(500,50, 90, 90);
		fn.setFont(new Font("calibri",Font.BOLD,16));
		fn.setForeground(Color.BLACK);
		fn.setBackground(Color.white);
		f.add(fn);
		
		JTextField nm= new JTextField();
		nm.setBounds(600,80,150,25);
		f.add(nm);
		
		JLabel ln=new JLabel("LAST NAME");
		ln.setFont(new Font("calibri",Font.BOLD,16));
		ln.setBounds(500,100,90,90);
		ln.setForeground(Color.BLACK);
		ln.setBackground(Color.white);
		f.add(ln);
		
		JTextField lm=new JTextField();
		lm.setBounds(600,130,150,25);
		f.add(lm);
		
		JLabel em=new JLabel("EMAIL");
		em.setFont(new Font("calibri",Font.BOLD,16));
		em.setBounds(500,150,90,90);
		em.setForeground(Color.BLACK);
		em.setBackground(Color.white);
		f.add(em);
		
		JTextField m=new JTextField();
		m.setBounds(600,184,150,25);
		f.add(m);
		
		JLabel gen=new JLabel("GENDER");
		gen.setFont(new Font("calibri",Font.BOLD,16));
		gen.setBounds(500,199, 90, 90);
		gen.setForeground(Color.BLACK);
		gen.setBackground(Color.white);
		f.add(gen);
		
		JRadioButton gm=new JRadioButton("MALE");
		gm.setBounds(600,235,90,30);
		f.add(gm);
		JRadioButton gf=new JRadioButton("FEMALE");
		gf.setBounds(700,235, 90,30);
		f.add(gf);
		JRadioButton go=new JRadioButton("OTHER");
		go.setBounds(800,235,90,30);
		f.add(go);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(gm);
		bg.add(gf);
		bg.add(go);
		
		JLabel nat=new JLabel("COUNTRYCODE");
		nat.setFont(new Font("calibri",Font.BOLD,16));
		nat.setBounds(450,250,150,90);
		nat.setForeground(Color.BLACK);
		nat.setBackground(Color.white);
		f.add(nat);
		
		
		
		String[] countryCodes = Locale.getISOCountries();
		Vector <String> coun= new Vector();
		for (String countryCode : countryCodes)
		{

		    Locale obj = new Locale("", countryCode);
		    coun.add(obj.getDisplayCountry());

		}
		
		JComboBox nation =new JComboBox(coun);
		nation.setBounds(600,285,200,25);
		f.add(nation);
		
		
	
		JLabel co=new JLabel("COUNTRY NAME");
		co.setFont(new Font("calibri",Font.BOLD,16));
		co.setBounds(450, 300,150, 90);
		co.setForeground(Color.BLACK);
		co.setBackground(Color.white);
		f.add(co);
		
		JTextField n=new JTextField();
		n.setBounds(600,335,150,25);
		f.add(n);
		
		JLabel add=new JLabel("ADDRESS");
		add.setFont(new Font("calibri",Font.BOLD,16));
		add.setBounds(500,350,150, 90);
		add.setForeground(Color.BLACK);
		add.setBackground(Color.white);
		f.add(add);
		
		JTextArea a=new JTextArea();
		a.setBounds(600,370,200,90);
		f.add(a);
		
		JLabel mob=new JLabel("CONTACT NO");
		mob.setBounds(480,450,150,90);
		mob.setFont(new Font("calibri",Font.BOLD,16));
		mob.setForeground(Color.BLACK);
		mob.setBackground(Color.white);
		f.add(mob);
		
		JTextField no=new JTextField("+xx-yyyyyyyyyy");
		no.setBounds(600,480,150,25);
		f.add(no);
		
		JLabel pass=new JLabel("PASSWORD");
		pass.setFont(new Font("calibri",Font.BOLD,16));
		pass.setBounds(500,495, 150, 90);
		pass.setForeground(Color.BLACK);
		pass.setBackground(Color.white);
		f.add(pass);
		
		JTextField p=new JTextField();
		p.setBounds(600,523,150, 25);
		f.add(p);
	
		JLabel cp=new JLabel("CONFIRM PASSWORD");
		cp.setFont(new Font("calibri",Font.BOLD,16));
		cp.setForeground(Color.BLACK);
		cp.setBackground(Color.white);
		cp.setBounds(440,540,150,90);
		f.add(cp);
		
		JCheckBox sp=new JCheckBox("SHOW PASSWORD");
		sp.setBounds(770,568,150,20);
		f.add(sp);;
		
		JPasswordField pw=new JPasswordField();
		pw.setBounds(600,568, 150, 25);
		f.add(pw);
		
		JButton mck=new JButton("Verify");
		mck.setBounds(765,184,100,20);
		f.add(mck);
		
		JButton chk=new JButton("Verify");
		chk.setBounds(770,524,100,20);
		f.add(chk);
		
		JButton moch=new JButton("Verify");
		moch.setBounds(770,480,100,20);
		f.add(moch);
		
		JButton sub=new JButton("SUBMIT");
		sub.setBounds(550,630,100,20);
		f.add(sub);
		JButton prev=new JButton("<-- prev page");
		prev.setBounds(40,20,120,20);
		f.add(prev);
		
		JButton del=new JButton("Clear");
		del.setBounds(1150,20,120,20);
		f.add(del);
		
	
		sub.addActionListener(new ActionListener() 
		{
			
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e)
			{
				try 
				{
					String fname,sname,count,addr,passw,email;
					ButtonModel gend;
					fname=nm.getText();
					sname=lm.getText();
					email=m.getText();
					passw=p.getText();
					count=n.getText();
					addr=a.getText();
					passch=pw.getText();
					gend=bg.getSelection();
					String gen=gm.getText();
					String geng=gf.getText();
					String geno=go.getText();
					Boolean ml=gm.isSelected();
					Boolean fl=gf.isSelected();
					Boolean ol=go.isSelected();
					mobno=no.getText();
					String natio=(String) nation.getSelectedItem();
					
					if(fname.isEmpty())
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(sname.isEmpty())
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(email.isEmpty())
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(ml==false && fl==false && ol==false)
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(natio.isEmpty())
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(count.isEmpty())
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(addr.isEmpty())
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(mobno.isEmpty())
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials ! ","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(passw.isEmpty())
					{
						JOptionPane.showMessageDialog(sub,"Enter Valid Credentials ! ","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else
					{
						
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
						String st ="SELECT * FROM register WHERE firstname=? AND lastname=? AND email=? AND pass=? AND mobno=?";
						PreparedStatement sm=conn.prepareStatement(st);
						sm.setString(1,fname);
						sm.setString(2,sname);
						sm.setString(3,email);
						sm.setString(4,passw);
						sm.setString(5,mobno);
						
						ResultSet res=sm.executeQuery();
						if(res.next())
						{
							System.out.println("INVALID Registeration !");
							JOptionPane.showMessageDialog(f,"Already Exist !","ERROR",JOptionPane.ERROR_MESSAGE);						
						}
						else
						{
							System.out.println(passw);
							System.out.println(passch);
							System.out.println("Valid Registration !");
							if(passw.equals(passch))
							{
								System.out.println("entered block");
								if(gm.isSelected())
								{
								String s= "INSERT INTO register (firstname,lastname,email,count,address,pass,gender,country_code,mobno)"+"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
								PreparedStatement statement = conn.prepareStatement(s);
								statement.setString(1, fname);
								statement.setString(2,sname);
								statement.setString(3,email);
								statement.setString(4,count);
								statement.setString(5, addr);
								statement.setString(6, passw);
								statement.setString(7,gen);
								statement.setString(8, natio);
								statement.setString(9,mobno);
								
								statement.executeUpdate();
								reservation ob=new reservation();
								f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								f.setVisible(false);
								}
								else if(gf.isSelected())
								{
									String s= "INSERT INTO register (firstname,lastname,email,count,address,pass,gender,country_code)"+"VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
									PreparedStatement statement = conn.prepareStatement(s);
									statement.setString(1, fname);
									statement.setString(2,sname);
									statement.setString(3,email);
									statement.setString(4,count);
									statement.setString(5, addr);
									statement.setString(6, passw);
									statement.setString(7,geng);
									statement.setString(8, natio);
									
									statement.executeUpdate();
									reservation ob=new reservation();
									f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
									f.setVisible(false);
								}
								else
								{
									String s= "INSERT INTO register (firstname,lastname,email,count,address,pass,gender,country_code)"+"VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
									PreparedStatement statement = conn.prepareStatement(s);
									statement.setString(1, fname);
									statement.setString(2,sname);
									statement.setString(3,email);
									statement.setString(4,count);
									statement.setString(5, addr);
									statement.setString(6, passw);
									statement.setString(7,geno);
									statement.setString(8, natio);
									
									statement.executeUpdate();
									reservation ob=new reservation();
									f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
									f.setVisible(false);
								}
							}
							else
							{
								System.out.println(passch);
								System.out.println(passw);
								JOptionPane.showMessageDialog(sub,"Password Mismatch !","WARNING",JOptionPane.ERROR_MESSAGE);
							}
							
							

						}
						
					}
					
					}
					catch(Exception k)
					{
						System.out.println(k);
						JOptionPane.showMessageDialog(f,"Network Busy !","ERROR",JOptionPane.ERROR_MESSAGE);						
					}
				}
			  
		}
		);
		del.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						nm.setText("");
						lm.setText("");
						m.setText("");
						n.setText("");
						a.setText("");
						p.setText("");
						pw.setText("");
						no.setText("");
						bg.clearSelection();
					}
				}
				);
		prev.addActionListener(new ActionListener()
				
				{
						public void actionPerformed(ActionEvent e)
						{
							sampfram gu=new sampfram();
							f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							f.setVisible(false);
						}
			
				}
		);
		chk.addActionListener(new ActionListener()
				
				{
						public void actionPerformed(ActionEvent e)
						{
							String passw;
							passw=p.getText();
							passcheck pc=new passcheck();
							boolean cap=pc.checkcaps(passw);
							boolean low=pc.checklow(passw);
							boolean no=pc.checknum(passw);
							boolean sp=pc.checkspl(passw);
							if(cap==true && low==true && no==true && sp==true)
							{
								JOptionPane.showMessageDialog(chk,"Password Verified !","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
							}
							else
							{
								JOptionPane.showMessageDialog(chk,"Your Password Must Contain Atleast One Numerical,UpperCase,LowerCase And SpecialCase","ERROR",JOptionPane.ERROR_MESSAGE);
							}
						}		
				}
			
				);
		mck.addActionListener(new ActionListener()
				{
			
					public void actionPerformed(ActionEvent e)
					{
						String email;
						email=m.getText();
						passcheck ss=new passcheck();
						boolean at=ss.checkmail(email);
						boolean dot=ss.checkdot(email);
						if(at==true && dot==true)
						{
							JOptionPane.showMessageDialog(mck,"Email Verified !","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							JOptionPane.showMessageDialog(mck,"Enter Valid Mail ID !","ERROR",JOptionPane.ERROR_MESSAGE);
						}
					}
				});
		moch.addActionListener(new ActionListener()
				{
							public void actionPerformed(ActionEvent e)
							{
								String mob;
								mob=no.getText();
								passcheck ss=new passcheck();
								boolean at=ss.checkph(mob);
								boolean dot=ss.checklen(mob);
								if(at==true && dot==true)
								{
									JOptionPane.showMessageDialog(moch,"MobileNo Verified !","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
								}
								else
								{
									JOptionPane.showMessageDialog(moch,"Enter Valid MobileNo !","ERROR",JOptionPane.ERROR_MESSAGE);
								}
							}
				}
				);
		sp.addActionListener(new ActionListener()
				{
							public void actionPerformed(ActionEvent e)
							{
								if(sp.isSelected())
								{
									pw.setEchoChar((char)0);
								}
								else
								{
									pw.setEchoChar('#');
								}
							}
				}
				);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		register b=new register();			
	}
	@Override
	public void run()
	{
		// TODO Auto-generated method stub	
	}
}
