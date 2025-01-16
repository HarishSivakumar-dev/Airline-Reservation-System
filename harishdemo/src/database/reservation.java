package database;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class reservation
{
	JFrame res;
	reservation()
	{
		JFrame res=new JFrame("RESERVATION");
		res.setVisible(true);
		res.setSize(6000,6000);
		res.setLayout(null);
		
		res.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\lp.jpg")));
		
		JLabel tit=new JLabel("The Sky Is Waiting For You !");
		tit.setBounds(400,-60,500,200);
		tit.setFont(new Font("magneto",Font.ITALIC,30));
		res.add(tit);
		
		JButton bk=new JButton("MY BOOKING");
		bk.setBounds(170,90,200,30);
		res.add(bk);
		
		JButton ft=new JButton("AVAILABE FLIGHTS");
		ft.setBounds(400,90,200,30);
		res.add(ft);
		
		JButton off=new JButton("TOP OFFERS");
		off.setBounds(650, 90, 200, 30);
		res.add(off);
		
		JButton hp=new JButton("HELP");
		hp.setBounds(900,90, 200, 30);
		res.add(hp);
		
		JLabel head=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\bgpage.jpg"));
		head.setBounds(0,85,1500,40);
		res.add(head);
		
		bk.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					if(e.getSource()==bk)
					{
						bookingPage ob=new bookingPage();
						res.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						res.setVisible(false);
						
					}
				}
			
		}		
		);
		ft.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					flgtDet oh=new flgtDet();
					res.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					res.setVisible(false);
					
				}
			
		}		
		);
		off.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					topoffers oh=new topoffers();
					res.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					res.setVisible(false);
					
				}
			
		}		
		);
		hp.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					helpPage oh=new helpPage();
					res.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					res.setVisible(false);
				}
		}		
		);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		reservation ob=new reservation();	
	}
}
