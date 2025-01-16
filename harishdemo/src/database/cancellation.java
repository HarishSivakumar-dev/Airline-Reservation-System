package database;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class cancellation {

	cancellation()
	{
		JFrame ok=new JFrame();
		ok.setLayout(null);
		ok.setSize(700,350);
		ok.setVisible(true);
		ok.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\has.jpg")));
		
		JLabel hd=new JLabel("Ticket Cancellation");
		hd.setFont(new Font("magneto",Font.BOLD,30));
		hd.setBounds(200,-110,400,300);
		ok.add(hd);
		
		JLabel pn=new JLabel("PNR number:");
		pn.setFont(new Font("calibri",Font.BOLD,20));
		pn.setBounds(60,-55,200,300);
		ok.add(pn);
		
		JTextField nr=new JTextField();
		nr.setBounds(200,80,180,22);
		ok.add(nr);
		
		JLabel em=new JLabel("Email:");
		em.setFont(new Font("calibri",Font.BOLD,20));
		em.setBounds(120,-10,200,300);
		ok.add(em);
		
		JTextField ek=new JTextField();
		ek.setBounds(200,125,180,22);
		ok.add(ek);
		
		JLabel res=new JLabel("Reason:");
		res.setFont(new Font("calibri",Font.BOLD,20));
		res.setBounds(105,35,200,300);
		ok.add(res);
		
		JLabel ar=new JLabel("Are You Sure You Want To Cancel Your Ticket ?");
		
		
		JRadioButton m=new JRadioButton("The Credentials filled Are Wrong");
		m.setBounds(200,170,230,20);
		ok.add(m);
		
		JRadioButton pr=new JRadioButton("Due To Personal Reasons");
		pr.setBounds(200,200,230,20);
		ok.add(pr);
		
		JRadioButton hi=new JRadioButton("Due To Health Issues");
		hi.setBounds(200,230,230,20);
		ok.add(hi);
		
		JRadioButton ot=new JRadioButton("Other");
		ot.setBounds(200,260,70,20);
		ok.add(ot);
		
		JButton cl=new JButton("Submit");
		cl.setBounds(100,290,100,20);
		ok.add(cl);
		
		JButton bk=new JButton("Back");
		bk.setBounds(300,290,100,20);
		ok.add(bk);
		
		cl.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						String pnr=nr.getText();
						String mail=ek.getText();
						String r1=m.getText();
						String r2=pr.getText();
						String r3=hi.getText();
						String r4=ot.getText();
						
					int cfrm=JOptionPane.showConfirmDialog(ar, ar);
					if(cfrm==0)
					{
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
						String st ="SELECT * FROM bookings WHERE pnrno=? AND email=?";
						PreparedStatement sm=con.prepareStatement(st);
						sm.setString(1,pnr);
						sm.setString(2,mail);
						
						ResultSet re=sm.executeQuery();
						if(re.next())
						{
							System.out.println("entered");
							if(m.isSelected())
							{
							String s ="DELETE FROM bookings WHERE pnrno=? AND email=?";
							PreparedStatement m=con.prepareStatement(s);
							m.setString(1,pnr);
							m.setString(2,mail);
							
							m.executeUpdate();
							
							String sr="INSERT INTO cancellation(pnrno,email,reason)"+"VALUES( ?, ?, ?)";
							PreparedStatement mn=con.prepareStatement(sr);
							mn.setString(1,pnr);
							mn.setString(2,mail);
							mn.setString(3,r1);
							
							mn.executeUpdate();
							JOptionPane.showMessageDialog(cl,"Ticket Cancelled SuccessFully.Amount Will Be Refunded Within 3 Days.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
							}
							else if(pr.isSelected())
							{
								String s ="DELETE FROM bookings WHERE pnrno=? AND email=?";
								PreparedStatement m=con.prepareStatement(s);
								m.setString(1,pnr);
								m.setString(2,mail);
								
								m.executeUpdate();
								
								String sr="INSERT INTO cancellation(pnrno,email,reason)"+"VALUES( ?, ?, ?)";
								PreparedStatement mn=con.prepareStatement(sr);
								mn.setString(1,pnr);
								mn.setString(2,mail);
								mn.setString(3,r2);
								
								mn.executeUpdate();
								JOptionPane.showMessageDialog(cl,"Ticket Cancelled SuccessFully.Amount Will Be Refunded Within 3 Days.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
							}
							else if(hi.isSelected())
							{
								String s ="DELETE FROM bookings WHERE pnrno=? AND email=?";
								PreparedStatement m=con.prepareStatement(s);
								m.setString(1,pnr);
								m.setString(2,mail);
								
								m.executeUpdate();
								
								String sr="INSERT INTO cancellation(pnrno,email,reason)"+"VALUES( ?, ?, ?)";
								PreparedStatement mn=con.prepareStatement(sr);
								mn.setString(1,pnr);
								mn.setString(2,mail);
								mn.setString(3,r3);
								
								mn.executeUpdate();
								JOptionPane.showMessageDialog(cl,"Ticket Cancelled SuccessFully.Amount Will Be Refunded Within 3 Days.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
							}
							else if(ot.isSelected())
							{
								String s ="DELETE FROM bookings WHERE pnrno=? AND email=?";
								PreparedStatement m=con.prepareStatement(s);
								m.setString(1,pnr);
								m.setString(2,mail);
								
								m.executeUpdate();
								
								String sr="INSERT INTO cancellation(pnrno,email,reason)"+"VALUES( ?, ?, ?)";
								PreparedStatement mn=con.prepareStatement(sr);
								mn.setString(1,pnr);
								mn.setString(2,mail);
								mn.setString(3,r4);
								
								mn.executeUpdate();
								JOptionPane.showMessageDialog(cl,"Ticket Cancelled SuccessFully.Amount Will Be Refunded Within 3 Days.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
							}
							else
							{
								System.out.println("No Data");
							}
						}
						else
						{
							JOptionPane.showMessageDialog(cl,"No Entities Found Corresponding To Your Data","ERROR",JOptionPane.ERROR_MESSAGE);						
						}
						
					}
					else 
					{
						System.out.println("Not Cancelled");						
					}
					}
					catch(Exception er)
					{
						System.out.println(er);
					}
				}
		}	
		);
		
		bk.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					ok.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ok.setVisible(false);
				}	
		}		
		);
		
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		cancellation ko=new cancellation();
	}

}
