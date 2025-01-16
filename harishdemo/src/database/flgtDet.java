package database;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
public class flgtDet
{
	
	
	flgtDet()
	{
		
		JFrame det=new JFrame("Flight Details");
		det.setLayout(null);
		det.setSize(6000,6000);
		det.setVisible(true);
		
		det.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\lp.jpg")));
		
		JLabel tit=new JLabel("Available Flights Right Now........");
		tit.setBounds(475,60,500,100);
		tit.setFont(new Font("magneto",Font.ITALIC,20));
		det.add(tit);
		
		JButton bk=new JButton("MY BOOKING");
		bk.setBounds(400,25,200,30);
		det.add(bk);
		
		JButton ft=new JButton("HOME");
		ft.setBounds(170,25,200,30);
		det.add(ft);
		
		JButton off=new JButton("TOP OFFERS");
		off.setBounds(650,25, 200, 30);
		det.add(off);
		
		JButton hlp=new JButton("HELP");
		hlp.setBounds(900,25, 200, 30);
		det.add(hlp);
		
		String [] clm= {"SINO","Airlines","Flight name","Timing"};
		try
		{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
				PreparedStatement st= con.prepareStatement("select * from det");
				ResultSet rs=st.executeQuery();
				
				String [][] dat =new String [10][4];
				for(int r=0;r<10;r++)//1
				{
				    rs.next();//row 2

					int g=1;//1
					for(int k=0;k<4;k++)
					{
						dat[r][k]=rs.getString(g);//1 0 
						g++;
					}
				}
//				for(int r=0;r<10;r++)
//				{
//					int g=1;
//					for(int k=0;k<4;k++)
//					{
//						System.out.println(dat[r][k]);
//					}
//				}
		
		JTable dt=new JTable(dat,clm);
		dt.setBounds(400,150,500,300);
		det.add(dt);
		
		JLabel head=new JLabel(new ImageIcon("C:\\Users\\hai\\Desktop\\project java\\bgpage.jpg"));
		head.setBounds(0,20,1500,40);
		det.add(head);
}
catch(Exception e)
{
	
}


		bk.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					bookingPage oh=new bookingPage();
					det.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					det.setVisible(false);
				}	
		}		
		);
		ft.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					reservation ok=new reservation();
					det.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					det.setVisible(false);
					
				}	
		}		
		);
		off.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					topoffers oh=new topoffers();
					det.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					det.setVisible(false);
					
				}
		}		
		);
		hlp.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent e)
				{
					helpPage oh=new helpPage();
					det.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					det.setVisible(false);
					
				}
		}		
		);

		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		flgtDet og=new flgtDet();

	}

}