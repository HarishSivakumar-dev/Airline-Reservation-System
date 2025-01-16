package database;

import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.*;

public class FoodMenuPage {
	
	FoodMenuPage()
	{
		JFrame oq=new JFrame();
		oq.setLayout(null);
		oq.setSize(6000,6000);
		oq.setVisible(true);
		
		
		JLabel q1= new JLabel("Delivering");
		q1.setFont(new Font("magneto",Font.BOLD,35));
		q1.setBounds(120,150,200,80);
		oq.add(q1);
	
		
		JLabel q2=new JLabel("Deliciousness !");
		q2.setFont(new Font("magneto",Font.BOLD,35));
		q2.setBounds(120,250,300,80);
		oq.add(q2);
		
		JLabel cui=new JLabel("Cuisine: ");
		cui.setFont(new Font("calibri",Font.ITALIC,25));
		cui.setBounds(800,220,150,30);
		oq.add(cui);
		
		String dish[]= {"Indian","Chinese","Italian","Continental","Korean","Gulf","Japanese","Vietnamese","ONLY FOR KIDDOS !","DIET MEALS","CUSTOMIZE (Additional Charges Included) "};
		
		JComboBox cu=new JComboBox(dish);
		cu.setBounds(900,218,150,30);
		oq.add(cu);
		
		JButton pro=new JButton("PROCEED");
		pro.setBounds(926,260,95,20);
		oq.add(pro);
		
		JLabel img1=new JLabel(new ImageIcon(""));
		
		
		
		JLabel img2=new JLabel(new ImageIcon(""));
				
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FoodMenuPage op=new FoodMenuPage();
	}

}
