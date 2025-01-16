package database;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class topoffers
{
	topoffers()
	{
		JFrame top=new JFrame("TOP OFFERS ");
		top.setVisible(true);
		top.setJMenuBar(null);
		top.setLayout(null);
		top.setSize(6000,6000);
		top.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\lp.jpg")));
		
		
		JLabel off=new JLabel("Offer For Students !");
		off.setBounds(130,40,300,20);
		off.setFont(new Font("Serif",Font.BOLD,20));
		top.add(off);
		JLabel det=new JLabel("Upto 50% Off for School "
				+ "And College Students");
		det.setBounds(18,240,500,30);
		det.setFont(new Font("Serif",Font.BOLD,20));
		top.add(det);
		JLabel up= new JLabel("To Avail");
		up.setBounds(130,275,110,20);
		up.setFont(new Font("Serif",Font.BOLD,20));
		top.add(up);
		JButton ch=new JButton("Click Here");
		ch.setBounds(210,276,100,20);
		top.add(ch);
		
		JButton bk=new JButton("HOME");
		bk.setBounds(170,04,200,15);
		top.add(bk);
		
		JButton af=new JButton("MY BOOKING");
		af.setBounds(400,04,200,15);
		top.add(af);
		
		JButton tof=new JButton("AVAILABE FLIGHTS");
		tof.setBounds(650,04, 200,15);
		top.add(tof);
		
		JButton hlp=new JButton("HELP");
		hlp.setBounds(900,04,200,15);
		top.add(hlp);
		
		JLabel std=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\stdoff.jfif"));
		std.setBounds(-28,-350,500,1000);
		top.add(std);
		JLabel std1=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\std2.jpg"));
		std1.setBounds(20,25,400,300);
		top.add(std1);
		
		JLabel off1=new JLabel("Offer for Tourists !");
		off1.setBounds(620,40,300,20);
		off1.setFont(new Font("Serif",Font.BOLD,20));
		top.add(off1);
		JLabel dt=new JLabel("Flat 30% Off In Return Tickets !");
		dt.setBounds(560,240,500,30);
		dt.setFont(new Font("Serif",Font.BOLD,20));
		top.add(dt);
		JLabel ta= new JLabel("To Avail"); 
		ta.setBounds(600,275,110,20); 
		ta.setFont(new Font("Serif",Font.BOLD,20)); 
		top.add(ta); 
		JButton b2=new JButton("Click Here");
		b2.setBounds(680,276,100,20);
		top.add(b2);
		JLabel buz=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\trav.jfif"));
		buz.setBounds(400,55,600,200);
		top.add(buz);
		JLabel buz1=new JLabel(new ImageIcon("C:\\\\Users\\\\hai\\\\Desktop\\\\project java\\\\std2.jpg"));
		buz1.setBounds(500,25,400,300);
		top.add(buz1);
		JLabel head=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\bgpage.jpg"));
		head.setBounds(0,01,1500,20);
		top.add(head);
		
		JLabel not=new JLabel("NOTE: ");
		not.setBounds(950, 40,90,90);
		not.setFont(new Font("Serif",Font.BOLD,20));
		top.add(not);
		JLabel inf=new JLabel("The First Booking Offer Is ");
		inf.setBounds(1020, 40,400,90);
		inf.setFont(new Font("Serif",Font.BOLD,20));
		top.add(inf);
		JLabel inf1=new JLabel("Purely Based On Lucky Draw ");
		inf1.setBounds(1020,70,400,90);
		inf1.setFont(new Font("Serif",Font.BOLD,20));
		top.add(inf1);
		
		
		
		JLabel ft=new JLabel("Festival Dhamaka Offer !");
		ft.setBounds(353,370,300,20);
		ft.setFont(new Font("Serif",Font.BOLD,20));
		top.add(ft);
		JLabel of=new JLabel("Book For Three Get One For Free !");
		of.setBounds(310,560,500,30);
		of.setFont(new Font("Serif",Font.BOLD,20));
		top.add(of);
		JLabel bt= new JLabel("To Avail"); 
		bt.setBounds(370,600,110,20); 
		bt.setFont(new Font("Serif",Font.BOLD,20)); 
		top.add(bt); 
		JButton bt2=new JButton("Click Here");
		bt2.setBounds(450,600,100,20);
		top.add(bt2);
		JLabel fes=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\festive.jfif"));
		fes.setBounds(110,280,700,400);
		top.add(fes);
		JLabel fes1=new JLabel(new ImageIcon("C:\\\\Users\\\\hai\\\\Desktop\\\\project java\\\\std2.jpg"));
		fes1.setBounds(260,350,400,300);
		top.add(fes1);
		
		JLabel dof=new JLabel("First Booking Offer !");
		dof.setBounds(850,360,300,20);
		dof.setFont(new Font("Serif",Font.BOLD,20));
		top.add(dof);
		JLabel lb=new JLabel("Book Your First Flight, Get A Chance");
		lb.setBounds(770,560,500,30);
		lb.setFont(new Font("Serif",Font.BOLD,20));
		top.add(lb);
		JLabel lb1=new JLabel("To Win A Theme Park Ticket !");
		lb1.setBounds(800,580,500,30);
		lb1.setFont(new Font("Serif",Font.BOLD,20));
		top.add(lb1);
		JLabel ck= new JLabel("To Avail"); 
		ck.setBounds(840,620,110,20); 
		ck.setFont(new Font("Serif",Font.BOLD,20)); 
		top.add(ck); 
		JButton ck2=new JButton("Click Here");
		ck2.setBounds(920,620,100,20);
		top.add(ck2);
		JLabel id=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\trip.jpg"));
		id.setBounds(784,385,300,180);
		top.add(id);
		JLabel id1=new JLabel(new ImageIcon("C:\\\\Users\\\\hai\\\\Desktop\\\\project java\\\\std2.jpg"));
		id1.setBounds(730,350,400,300);
		top.add(id1);
		
		bk.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					reservation oy=new reservation();
					top.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					top.setVisible(false);
					
				}	
		}		
		);
		af.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					bookingPage oh=new bookingPage();
					top.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					top.setVisible(false);
				}	
		}		
		);
		tof.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					flgtDet tr=new flgtDet();
					top.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					top.setVisible(false);
				}
		}		
		);
		hlp.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent e)
				{
					helpPage oh=new helpPage();
					top.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					top.setVisible(false);	
				}
		}		
		);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		topoffers nk=new topoffers();
	}
}
