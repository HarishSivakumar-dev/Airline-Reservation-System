package database;
import database.sampfram;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import java.util.Random;
import java.util.Vector;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class myBooking
{
	static JTextField nt,snt,emt;
	static String fname,sname,email,counr,counm,em,im,vi,cla,d,time,day,eve;
	static Random rm=new Random();
	static int p=rm.nextInt(10000000);
	static String pm=Integer.toString(p);
	static Random tr=new Random();
	static int amt=tr.nextInt(250000);
	static String am=Integer.toString(amt);
	
	myBooking()
	{
		
		JFrame mb=new JFrame("MY BOOKING");
		mb.setLayout(null);
		mb.setSize(6000,6000);
		mb.setVisible(true);
		mb.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\lp.jpg")));
		
		JLabel nm=new JLabel("First Name");
		nm.setBounds(500,20,110,150);
		nm.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(nm);
		JTextField nt=new JTextField();
		nt.setBounds(620,85,150,22);
		mb.add(nt);
		
		JLabel sn=new JLabel("Last Name");
		sn.setBounds(500,80,110,150);
		sn.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(sn);
		JTextField snt=new JTextField();
		snt.setBounds(620,140,150,22);
		mb.add(snt);
		
		JLabel em=new JLabel("Email");
		em.setBounds(510,130,110,150);
		em.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(em);
		JTextField emt=new JTextField();
		emt.setBounds(620,190,150,22);
		mb.add(emt);
		
		JLabel tt=new JLabel("Type Of Travel");
		tt.setBounds(465,175,150,150);
		tt.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(tt);
		
		JRadioButton emm=new JRadioButton("Emigration");
		emm.setBounds(620,240,100,20);
		mb.add(emm);
		JRadioButton imm=new JRadioButton("Immigration");
		imm.setBounds(720,240,100,20);
		mb.add(imm);
		ButtonGroup rd=new ButtonGroup();
		rd.add(emm);
		rd.add(imm);
		
		JLabel v=new JLabel("Type Of VISA");
		v.setBounds(470,220,150,150);
		v.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(v);
		String tv[]= {"Business VISA","Employment VISA","Tourist VISA","Entry VISA","Transit VISA","Student VISA","Conference VISA","Journalist VISA","Medical VISA","O VISA","Diplomatic VISA","F VISA","Missionary VISA","X VISA"};
		JComboBox vis=new JComboBox(tv);
		vis.setBounds(620,280,150,22);
		mb.add(vis);
		
		
		JLabel cor=new JLabel("Depature Point");
		cor.setBounds(460,240,200,200);
		cor.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(cor);
		
		String[] countryCodes = Locale.getISOCountries();
		Vector <String> coun= new Vector();
		for (String countryCode : countryCodes)
		{

		    Locale obj = new Locale("", countryCode);
		    coun.add(obj.getDisplayCountry());
		    
		}
		
		JComboBox nation =new JComboBox(coun);
		nation.setBounds(620,328,150,22);
		mb.add(nation);
		
		JLabel com=new JLabel("Arrival Point");
		com.setBounds(460,290,200,200);
		com.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(com);
		
		String[] countryCo = Locale.getISOCountries();
		Vector <String> cou= new Vector();
		for (String countryCode : countryCo)
		{

		    Locale obj = new Locale("", countryCode);
		    cou.add(obj.getDisplayCountry());

		}
		
		JComboBox nati =new JComboBox(cou);
		nati.setBounds(620,375,150,22);
		mb.add(nati);
		
		JLabel cls=new JLabel("Type Of Class");
		cls.setBounds(460,340,200,200);
		cls.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(cls);
		String cl[]= {"Economy","Business"};
		JComboBox cb=new JComboBox(cl);
		cb.setBounds(620,425,150,22);
		mb.add(cb);
		
		JLabel dat=new JLabel("Date Of Travel");
		dat.setBounds(450,390,200,200);
		dat.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(dat);
		JDateChooser dt=new JDateChooser();
		dt.setBounds(620,480,150,22);
		mb.add(dt);

		
		JLabel tm=new JLabel("Time Of Travel");
		tm.setBounds(450,440,200,200);
		tm.setFont(new Font("calibri",Font.BOLD,20));
		mb.add(tm);

		String oy[]= {"1:","2:","3:","4:","5:","6:","7:","8:","9:","10:","11:","12:"};
		
		Vector <String> co= new Vector();
	
		for(String tmp : oy)
		{
			{
			String dp=tmp+"00";
			co.add(dp);
			String p=tmp+"30";
			co.add(p);
			}
		}

		JComboBox ko=new JComboBox(co);
		ko.setBounds(620,526,80,22);
		mb.add(ko);
		
		JRadioButton a=new JRadioButton("AM");
		a.setBounds(710,527,50,20);
		mb.add(a);
		
		JRadioButton p=new JRadioButton("PM");
		p.setBounds(770,527,50,20);
		mb.add(p);
		
		ButtonGroup yp=new ButtonGroup();
		yp.add(a);
		yp.add(p);
		
		JButton cf=new JButton("Check Fare");
		cf.setBounds(840,527,100,20);
		mb.add(cf);
		
		JLabel totfre=new JLabel("Total Amount: ");
		totfre.setFont(new Font("calibri",Font.BOLD,20));
		totfre.setBounds(450,490,200,200);
		mb.add(totfre);
		
		JTextField tot=new JTextField();
		tot.setBounds(620,575,150,22);
		mb.add(tot);
		

	
		JButton bk=new JButton("BOOK");
		bk.setBounds(550,620,100,20);
		mb.add(bk);
		
		JButton bak=new JButton("BACK");
		bak.setBounds(710,620,100,20);
		mb.add(bak);
		
		JButton bok=new JButton("HOME");
		bok.setBounds(170,20,200,30);
		mb.add(bok);
		
		JButton ft=new JButton("AVAILABE FLIGHTS");
		ft.setBounds(410,20,200,30);
		mb.add(ft);
		
		JButton off=new JButton("TOP OFFERS");
		off.setBounds(650,20, 200, 30);
		mb.add(off);
		
		JButton hlp=new JButton("HELP");
		hlp.setBounds(900,20, 200, 30);
		mb.add(hlp);
		
		JButton auto=new JButton("AutoFill");
		auto.setBounds(800,85,80,20);
		mb.add(auto);
		
		JButton cle=new JButton("CLEAR");
		cle.setBounds(390,620,100,20);
		mb.add(cle);
		
		JLabel head=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\bgpage.jpg"));
		head.setBounds(0,15,1500,40);
		mb.add(head);
		
		cf.addActionListener(new ActionListener()
				{
					public void actionPerformed( ActionEvent e)
					
					{
						counr=(String)nation.getSelectedItem();
						counm=(String)nati.getSelectedItem();
						
					}
				
				}
				);
		cf.addActionListener(new ActionListener()
				
				{
			public void actionPerformed(ActionEvent e)
					{
						tot.setText("Rs "+am+"+ GST");
					}
				
				});
		
		
		bk.addActionListener(new ActionListener() 
		{
			
				public void actionPerformed(ActionEvent e)
			{
					try 
				{
					fname=nt.getText();
					sname=snt.getText();
					email=emt.getText();
					counr=(String)nation.getSelectedItem();
					counm=(String)nati.getSelectedItem();
					String em=emm.getText();
					String im=imm.getText();
					Boolean tr=emm.isSelected();
					Boolean tr1=imm.isSelected();
					Boolean mer1=a.isSelected();
					Boolean mer2=p.isSelected();
					vi=(String) vis.getSelectedItem();
					cla=(String) cb.getSelectedItem();
					d=dt.getDate().toLocaleString();
					time=(String) ko.getSelectedItem();
					day=a.getText();
					eve=p.getText();
					String ot=(String) nation.getSelectedItem();
					System.out.println(d);
					
					
					if(fname.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(sname.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(email.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(tr==false && tr1==false)
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(vi.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(counr.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(counm.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(cla.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(counr==counm)
					{
						JOptionPane.showMessageDialog(bk,"Depature And Arrival Cannot Be Same !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(d.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(time.isEmpty())
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else if(mer1==false && mer2==false)
					{
						JOptionPane.showMessageDialog(bk,"Enter Valid Credentials !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else
					{			
						System.out.println(vi+""+cla);
						
						if(emm.isSelected())
						{
							if(a.isSelected())
							{
								
									Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
									String st ="SELECT * FROM det WHERE timing=?";
									PreparedStatement sm=con.prepareStatement(st);
									sm.setString(1,time+day);
									ResultSet res=sm.executeQuery();
									if(res.next())
									{
										JOptionPane.showMessageDialog(bk,"Your Booking Has Been Registered,we will intimate you the further details through MAIL","information",JOptionPane.INFORMATION_MESSAGE);
										boardingPass op=new boardingPass();
											String s= "INSERT INTO bookings (fname,sname,email,depature,arrivial,mig_type,visa_type,class_type,depature_date,depature_time,pnrno)"+"VALUES(?, ?, ?, ?, ?, ? , ? , ?, ?, ?, ?)";
											PreparedStatement statement = con.prepareStatement(s);
							
											statement.setString(1, fname);
											statement.setString(2,sname);
											statement.setString(3, email);
											statement.setString(4, counr);
											statement.setString(5, counm);
											statement.setString(6, em);
											statement.setString(7, vi);
											statement.setString(8, cla);
											statement.setString(9,d);
											statement.setString(10,time+day);
											statement.setString(11,pm);
											
											statement.executeUpdate();
											boardingPass pp=new boardingPass();
											
									}
									else
									{
											JOptionPane.showMessageDialog(bk,"OOPS! No Flight Found At Your Time.Check Available Flights For More Details","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
											
									}
							
							}
							else
							{
								Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
								String st ="SELECT * FROM det WHERE timing=?";
								PreparedStatement sm=con.prepareStatement(st);
								sm.setString(1,time+eve);
								ResultSet res=sm.executeQuery();
								if(res.next())
								{
									JOptionPane.showMessageDialog(bk,"Your Booking Has Been Registered,we will intimate you the further details through MAIL","information",JOptionPane.INFORMATION_MESSAGE);
									boardingPass op=new boardingPass();
									String s= "INSERT INTO bookings (fname,sname,email,depature,arrivial,mig_type,visa_type,class_type,depature_date,depature_time)"+"VALUES(?, ?, ?, ?, ?, ? , ? , ?, ?, ?)";
									PreparedStatement statement = con.prepareStatement(s);
								
									statement.setString(1, fname);
									statement.setString(2,sname);
									statement.setString(3, email);
									statement.setString(4, counr);
									statement.setString(5, counm);
									statement.setString(6, em);
									statement.setString(7, vi);
									statement.setString(8, cla);
									statement.setString(9,d);
									statement.setString(10,time+eve);
									statement.setString(11,pm);
								
									statement.executeUpdate();
									boardingPass pp=new boardingPass();
								}
								else
								{
									JOptionPane.showMessageDialog(bk,"OOPS! No Flight Found At Your Time.Check Available Flights For More Details","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
								}
								
								
							}
						}
						else if(imm.isSelected())
						{
							if(a.isSelected())
							{
								Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
								String st ="SELECT * FROM det WHERE timing=?";
								PreparedStatement sm=con.prepareStatement(st);
								sm.setString(1,time+day);
								ResultSet res=sm.executeQuery();
								if(res.next())
								{
									JOptionPane.showMessageDialog(bk,"Your Booking Has Been Registered,we will intimate you the further details through MAIL","information",JOptionPane.INFORMATION_MESSAGE);
									boardingPass op=new boardingPass();
									String s= "INSERT INTO bookings (fname,sname,email,depature,arrivial,mig_type,visa_type,class_type,depature_date,depature_time)"+"VALUES(?, ?, ?, ?, ?, ? , ? , ?, ?, ?)";
									PreparedStatement statement = con.prepareStatement(s);
								
									statement.setString(1, fname);
									statement.setString(2,sname);
									statement.setString(3, email);
									statement.setString(4, counr);
									statement.setString(5, counm);
									statement.setString(6, im);
									statement.setString(7, vi);
									statement.setString(8, cla);
									statement.setString(9,d);
									statement.setString(10,time+day);
									statement.setString(11,pm);
									
									
									statement.executeUpdate();
									boardingPass pp=new boardingPass();
									
								}
								else
								{
									JOptionPane.showMessageDialog(bk,"OOPS! No Flight Found At Your Time.Check Available Flights For More Details","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
								}
							
							}
							else
							{
								Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
								String st ="SELECT * FROM det WHERE timing=?";
								PreparedStatement sm=con.prepareStatement(st);
								sm.setString(1,time+day);
								ResultSet res=sm.executeQuery();
								if(res.next())
								{
									JOptionPane.showMessageDialog(bk,"Your Booking Has Been Registered,we will intimate you the further details through MAIL","information",JOptionPane.INFORMATION_MESSAGE);
									boardingPass op=new boardingPass();
									String s= "INSERT INTO bookings (fname,sname,email,depature,arrivial,mig_type,visa_type,class_type,depature_date,depature_time)"+"VALUES(?, ?, ?, ?, ?, ? , ? , ?, ?, ?)";
									PreparedStatement statement = con.prepareStatement(s);
								
									statement.setString(1, fname);
									statement.setString(2,sname);
									statement.setString(3, email);
									statement.setString(4, counr);
									statement.setString(5, counm);
									statement.setString(6, im);
									statement.setString(7, vi);
									statement.setString(8, cla);
									statement.setString(9,d);
									statement.setString(10,time+eve);
									statement.setString(11,pm);
									
									statement.executeUpdate();
									boardingPass pp=new boardingPass();
									boardingPass.dd.setText(myBooking.time+myBooking.eve);
									
									
								}
								else
								{
									JOptionPane.showMessageDialog(bk,"OOPS! No Flight Found At Your Time.Check Available Flights For More Details","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
								}
								
							}
						}
					}
					
		
				}
					catch(Exception k)
					{
						JOptionPane.showMessageDialog(bk,"ENTER VALID CREDENTIALS !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
				}
			  
		}
		);
		cle.addActionListener(new ActionListener()
				
				{
					public void actionPerformed(ActionEvent e)
					{
						nt.setText("");
						snt.setText("");
						emt.setText("");
						rd.clearSelection();
						yp.clearSelection();
						dt.cleanup();
						
					}
				}
				
				);
		auto.addActionListener(new ActionListener()
				{
						public void actionPerformed(ActionEvent e)
						{
							nt.setText(sampfram.fname);
							snt.setText(sampfram.sname);
							emt.setText(sampfram.email);
						}
				}	
		);
		bok.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					reservation oky=new reservation();
					mb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					mb.setVisible(false);
				}	
		}		
		);
		ft.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					flgtDet oh=new flgtDet();
					
				}	
		}		
		);
		off.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					topoffers oh=new topoffers();
					mb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					mb.setVisible(false);
				}
		}
		
		);
		hlp.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent e)
				{
					helpPage oh=new helpPage();
					mb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					mb.setVisible(false);	
				}
		}	
		
		);
		bak.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e)
			{
				bookingPage op=new bookingPage();
				mb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				mb.setVisible(false);	
			}
		}	
	);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		myBooking hk=new myBooking();
	}
}
