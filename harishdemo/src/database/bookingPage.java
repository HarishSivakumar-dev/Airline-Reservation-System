package database;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class bookingPage {

	bookingPage()
	{
			JFrame bp=new JFrame();
			bp.setLayout(null);
			bp.setSize(6000,6000);
			bp.setVisible(true);
			bp.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\lp.jpg")));
			
			JButton bok=new JButton("HOME");
			bok.setBounds(170,20,200,30);
			bp.add(bok);
			
			JButton ft=new JButton("AVAILABE FLIGHTS");
			ft.setBounds(410,20,200,30);
			bp.add(ft);
			
			JButton off=new JButton("TOP OFFERS");
			off.setBounds(650,20, 200, 30);
			bp.add(off);
			
			JButton hlp=new JButton("HELP");
			hlp.setBounds(900,20, 200, 30);
			bp.add(hlp);
			
			JLabel head=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\bgpage.jpg"));
			head.setBounds(0,15,1500,40);
			bp.add(head);
			
			JLabel tic=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\ticket2.png"));
			tic.setBounds(89,230,250,200);
			bp.add(tic);
			
			JLabel bo=new JLabel("Book Tickets");
			bo.setFont(new Font("calibri",Font.BOLD,30));
			bo.setBounds(144,300,200,300);
			bp.add(bo);
			
			JButton b=new JButton("CLICK HERE");
			b.setBounds(169,460,107,15);
			bp.add(b);
			
			JLabel newbok=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\std2.jpg"));
			newbok.setBounds(39,200,350,300);
			bp.add(newbok);
			
			JLabel cl=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\cancel.png"));
			cl.setBounds(515,230,260,200);
			bp.add(cl);
			
			JLabel can=new JLabel("Cancel Tickets");
			can.setFont(new Font("calibri",Font.BOLD,30));
			can.setBounds(563,300,200,300);
			bp.add(can);
			
			JButton c=new JButton("CLICK HERE");
			c.setBounds(598,460,107,15);
			bp.add(c);
			
			JLabel nw=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\std2.jpg"));
			nw.setBounds(470,200,350,300);
			bp.add(nw);
			
			JLabel fod=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\food.png"));
			fod.setBounds(955,230,260,200);
			bp.add(fod);
			
			JLabel f=new JLabel("Pre-Book Food");
			f.setFont(new Font("calibri",Font.BOLD,30));
			f.setBounds(990,300,200,300);
			bp.add(f);
			
			JButton cd=new JButton("CLICK HERE");
			cd.setBounds(1030,460,107,15);
			bp.add(cd);
			
			JLabel fd=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\std2.jpg"));
			fd.setBounds(900,200,350,300);
			bp.add(fd);
			
			bok.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e)
					{
						reservation oky=new reservation();
						bp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						bp.setVisible(false);
					}	
			}		
			);
			ft.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e)
					{
						flgtDet oh=new flgtDet();
						bp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						bp.setVisible(false);
					}	
			}		
			);
			off.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e)
					{
						topoffers oh=new topoffers();
						bp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						bp.setVisible(false);
					}
			}
			
			);
			hlp.addActionListener(new ActionListener()
			{	
					public void actionPerformed(ActionEvent e)
					{
						helpPage oh=new helpPage();
						bp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						bp.setVisible(false);	
					}
			}	
			
			);
			
			b.addActionListener(new ActionListener()
			{	
					public void actionPerformed(ActionEvent e)
					{
						myBooking oh=new myBooking();
						bp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						bp.setVisible(false);
					}
			}	
			
			);
			
			c.addActionListener(new ActionListener()
			{	
					public void actionPerformed(ActionEvent e)
					{
						cancellation ko=new cancellation();
					}
			}	
			
			);
			
			
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		bookingPage ob=new bookingPage();
	}

}
