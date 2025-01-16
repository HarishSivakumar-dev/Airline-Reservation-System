package database;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;



public class boardingPass
{
	static JTextField nm,ema,mo,pn,dp,ar,cl,dt,dd;
	static String n;
	boardingPass()
	{
		JFrame bp=new JFrame();
		bp.setLayout(null);
		bp.setVisible(true);
		bp.setSize(1000,500);
		bp.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\std2.jpg")));
		
		
		JLabel head=new JLabel("SwiftWings Airlines");
		head.setForeground(Color.BLUE);
		head.setBounds(420,-130,400,300);
		head.setFont(new Font("calibri",Font.BOLD,30));
		bp.add(head);
		
		JLabel b=new JLabel("BOARDING PASS");
		b.setBounds(475,-100,400,300);
		b.setFont(new Font("calibri",Font.BOLD,18));
		bp.add(b);
		
		JLabel nme=new JLabel("Name");
		nme.setFont(new Font("calibri",Font.ITALIC,18));
		nme.setBounds(280,-50,200,300);
		bp.add(nme);
		
		JTextField nm=new JTextField();
		nm.setBounds(350,85,180,22);
		bp.add(nm);
		
		JLabel em=new JLabel("Email");
		em.setFont(new Font("calibri",Font.ITALIC,18));
		em.setBounds(280,-20,200,300);
		bp.add(em);
		
		JTextField ema=new JTextField();
		ema.setBounds(350,120,180,22);
		bp.add(ema);
		
		JLabel mob=new JLabel("Mob No");
		mob.setFont(new Font("calibri",Font.ITALIC,18));
		mob.setBounds(263,15,200,300);
		bp.add(mob);
		
		JTextField mo=new JTextField();
		mo.setBounds(350,155,180,22);
		bp.add(mo);
		
		JLabel pnr=new JLabel("PNR number");
		pnr.setFont(new Font("calibri",Font.ITALIC,18));
		pnr.setBounds(230,50,200,300);
		bp.add(pnr);
		
		JTextField pn=new JTextField();
		pn.setBounds(350,190,180,22);
		bp.add(pn);
		
		JLabel dep=new JLabel("Depature");
		dep.setBounds(250,85,200,300);
		dep.setFont(new Font("calibri",Font.BOLD,18));
		bp.add(dep);
		
		JTextField dp=new JTextField();
		dp.setBounds(350,225,180,22);
		bp.add(dp);
		
		JLabel arr=new JLabel("Arrival");
		arr.setBounds(265,120,200,300);
		arr.setFont(new Font("calibri",Font.BOLD,18));
		bp.add(arr);
		
		JTextField ar=new JTextField();
		ar.setBounds(350,260,180,22);
		bp.add(ar);
		
		JLabel cls=new JLabel("Class");
		cls.setBounds(280,155,200,300);
		cls.setFont(new Font("calibri",Font.ITALIC,18));
		bp.add(cls);
		
		JTextField cl=new JTextField();
		cl.setBounds(350,295,180,22);
		bp.add(cl);
		
		JLabel dept=new JLabel("Depature Date");
		dept.setBounds(205,190,200,300);
		dept.setFont(new Font("calibri",Font.BOLD,18));
		bp.add(dept);
		
		JTextField dt=new JTextField();
		dt.setBounds(350,330,180,22);
		bp.add(dt);
		
		JLabel depd=new JLabel("Time");
		depd.setFont(new Font("calibri",Font.BOLD,18));
		depd.setBounds(280,226,200,300);
		bp.add(depd);
		
		JTextField dd=new JTextField();
		dd.setBounds(350,365,180,22);
		bp.add(dd);
		
		JButton down=new JButton("Download");
		down.setBounds(475,420,100,30);
		bp.add(down);
		
		JLabel pic=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\boarding.png"));
		pic.setBounds(250,100,1000,200);
		bp.add(pic);
		
		JButton gd=new JButton("Generate Details");
		gd.setBounds(460,60,150,15);
		bp.add(gd);
		
		gd.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent e)
				{
					n=myBooking.fname+" "+myBooking.sname;
					nm.setText(n);
					ema.setText(myBooking.email);
					try
					{
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
						String st ="SELECT * FROM register WHERE firstname=? AND lastname=?";
						PreparedStatement sm=con.prepareStatement(st);
						System.out.println(myBooking.fname);
						sm.setString(1,myBooking.fname);
						sm.setString(2,myBooking.sname);
						ResultSet res=sm.executeQuery();
						if(res.next())
						{
							String mbno=res.getString(9);
							System.out.println(mbno);
							mo.setText(mbno);
						}
						else
						{
							System.out.println("No data");
						}
					}
					catch(Exception w)
					{
						System.out.println(w);
					}
					pn.setText(myBooking.pm);
					dp.setText(myBooking.counr);
					ar.setText(myBooking.counm);
					cl.setText(myBooking.cla);
					dt.setText(myBooking.d);
					dd.setText(myBooking.time+myBooking.day+"/"+myBooking.eve);
				}
		}	
		
		);
		
		down.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent e)
				{
					if(myBooking.fname==null && myBooking.sname==null)
					{
						JOptionPane.showMessageDialog(down,"Generate Details Before Download !","WARNING",JOptionPane.WARNING_MESSAGE);
					}
					else
					{
						System.out.println("Access Grant");
						JOptionPane.showMessageDialog(down,"Downloaded ! Please Don't Share Your PNR Number.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
					}
				}
		}	
		
		);
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boardingPass op=new boardingPass();
	}

}
