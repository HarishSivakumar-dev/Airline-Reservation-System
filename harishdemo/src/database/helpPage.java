package database;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.*;


public class helpPage
{

	String dt;
	
	helpPage()
	{
		JFrame hp=new JFrame("Help Desk");
		hp.setLayout(null);
		hp.setSize(6000,6000);
		hp.setVisible(true);
		hp.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\lp.jpg")));
		JLabel top=new JLabel("How Can We Help ?");
		top.setBounds(500,50,500,90);
		top.setFont(new Font("magneto",Font.CENTER_BASELINE,30));
		hp.add(top);
		
		JButton hd=new JButton("Click Here To Ask Your Queries To Our ChatBot");
		hd.setBounds(410,130,500,25);
		hp.add(hd);
		
		dt=hd.getText();
		
		JLabel hed=new JLabel("Help Desk: ");
		hed.setFont(new Font("calibri",Font.BOLD,30));
		hed.setBounds(80,220,200,110);
		hp.add(hed);
		JLabel gs=new JLabel("Getting Started ");
		gs.setFont(new Font("calibri",Font.BOLD,25));
		gs.setBounds(160,400,300,200);
		hp.add(gs);
		JLabel ac=new JLabel("Account Center ");
		ac.setFont(new Font("calibri",Font.BOLD,25));
		ac.setBounds(570,400,300,200);
		hp.add(ac);
		JLabel faq=new JLabel("Support Resources");
		faq.setFont(new Font("calibri",Font.BOLD,25));
		faq.setBounds(945,400,300,200);
		hp.add(faq);
		
		JLabel get= new JLabel("Get Your Account SetUp With Just 6");
		get.setFont(new Font("calibri",Font.ITALIC,15));
		get.setBounds(130,430,600,200);
		hp.add(get);
		JLabel get1= new JLabel("Simple Steps");
		get1.setFont(new Font("calibri",Font.ITALIC,15));
		get1.setBounds(200,450,600,200);
		hp.add(get1);
		
		JLabel accm= new JLabel("Managing Your Account,Creating New Users");
		accm.setFont(new Font("calibri",Font.ITALIC,15));
		accm.setBounds(505,430,600,200);
		hp.add(accm);
		JLabel accm1= new JLabel("Pricing Details,Exporting Data");
		accm1.setFont(new Font("calibri",Font.ITALIC,15));
		accm1.setBounds(560,450,600,200);
		hp.add(accm1);
		
		JLabel ques=new JLabel("Interaction With Users,Quick Answers For");
		ques.setFont(new Font("calibri",Font.ITALIC,15));
		ques.setBounds(915,430,600,200);
		hp.add(ques);
		JLabel ques1=new JLabel("Commonly Asked Questions");
		ques1.setFont(new Font("calibri",Font.ITALIC,15));
		ques1.setBounds(960,450,600,200);
		hp.add(ques1);
		
		JButton bk=new JButton("HOME");
		bk.setBounds(170,25,200,30);
		hp.add(bk);
		
		JButton ft=new JButton("MY BOOKING");
		ft.setBounds(410,25,200,30);
		hp.add(ft);
		
		JButton off=new JButton("AVAILABLE FLIGHTS");
		off.setBounds(650,25, 200, 30);
		hp.add(off);
		
		JButton hlp=new JButton("TOP OFFERS");
		hlp.setBounds(900,25, 200, 30);
		hp.add(hlp);
		
		JButton art1=new JButton("10 Articles");
		art1.setBounds(196,562,95,15);
		hp.add(art1);
		JButton art2=new JButton("30 Articles");
		art2.setBounds(605,562,95,15);
		hp.add(art2);
		JButton art3=new JButton("16 Articles");
		art3.setBounds(1000,562,95,15);
		hp.add(art3);
		
		JLabel gt=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\getst.png"));
		gt.setBounds(140,300,200,200);
		hp.add(gt);
		JLabel user=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\user.jfif"));
		user.setBounds(600,300,100,200);
		hp.add(user);
		JLabel fq=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\freaskq.jpg"));
		fq.setBounds(925,330,250,160);
		hp.add(fq);
		JLabel ar1=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\std2.jpg"));
		ar1.setBounds(70,300,350,300);
		hp.add(ar1);
		JLabel ar2=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\std2.jpg"));
		ar2.setBounds(470,300,350,300);
		hp.add(ar2);
		JLabel ar3=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\std2.jpg"));
		ar3.setBounds(870,300,350,300);
		hp.add(ar3);
		JLabel head=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\bgpage.jpg"));
		head.setBounds(0,20,1500,40);
		hp.add(head);
		
		
		hd.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						ChatBot op=new ChatBot();
					}
		
				});
		bk.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					reservation oy=new reservation();
					hp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					hp.setVisible(false);
					
				}	
		}		
		);
		ft.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					bookingPage oh=new bookingPage();
					hp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					hp.setVisible(false);
				}	
		}		
		);
		off.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					flgtDet tr=new flgtDet();
					hp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					hp.setVisible(false);
				}
		}		
		);
		hlp.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent e)
				{
					topoffers oh=new topoffers();
					hp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					hp.setVisible(false);
				}
		}		
		);
		
		
		
		}
	public static void main(String[] args) throws IOException
	{
		
		// TODO Auto-generated method stub
		helpPage hc=new helpPage();
		
		
	}	
}
