package database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.*;

public class ChangePass{
	
	String ml;
	static String pass;
	public void ChangePas()
	{
		JFrame op=new JFrame();
		op.setLayout(null);
		op.setSize(700,350);
		op.setVisible(true);
		
		Random yt=new Random();
		int p=yt.nextInt(10000000);
		String pm=Integer.toString(p);
		
		JLabel po=new JLabel("Password Reset Portal");
		po.setBounds(280,20,150,30);
		op.add(po);
		
		JLabel ui=new JLabel("Enter Email: ");
		ui.setBounds(100,100,110,20);
		op.add(ui);
		
		JButton send=new JButton("Send OTP");
		send.setBounds(400,100,110,20);
		op.add(send);
		
		JLabel wp=new JLabel("Enter your OTP: ");
		wp.setBounds(78,160,110,20);
		op.add(wp);
		
		
		JButton pi=new JButton("RESET");
		pi.setBounds(320,280,100,20);
		op.add(pi);
		
		JTextField ou=new JTextField();
		ou.setBounds(180,100,200,24);
		op.add(ou);
		
		JTextField or= new JTextField();
		or.setBounds(180,160,200,24);
		op.add(or);
		
		
		
		send.addActionListener(new ActionListener()
				
				{	
					public void actionPerformed(ActionEvent e)
					{
						try
						{
						String ml=ou.getText();
						
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flgtinfo","root","HarishShiva@07");
						String st ="SELECT * FROM register WHERE email=?";
						PreparedStatement sm=conn.prepareStatement(st);
						sm.setString(1,ml);
						ResultSet res=sm.executeQuery();
						
						
							if(res.next())
							{
								pass=res.getString(6);
								Session newSession =null;
								MimeMessage mimeMessage = new MimeMessage(newSession);
								
								Properties prop=System.getProperties();
								prop.put("mail.smtp.port","25");
								prop.put("mail.smtp.auth", "true");
								prop.put("mail.smtp.starttls.enable","true");
								
								newSession = Session.getDefaultInstance(prop,null);
								
								String reci= ml;
								
								String emailSubject = "THIS IS YOUR OTP: "+pm;
								String emailBody="Please Enter This In The Portal Within 5 Minutes. ThankYou !";
								
								mimeMessage.addRecipient(Message.RecipientType.TO,new InternetAddress(reci));
								
								mimeMessage.setSubject(emailSubject);
								
								MimeBodyPart bodypart=new MimeBodyPart();
								bodypart.setContent(emailBody, "text/plain");
								MimeMultipart multi=new MimeMultipart();
								multi.addBodyPart(bodypart);
								
								mimeMessage.setContent(multi);
								
								String fromUser="harishsathiyasivakumar@gmail.com";
								String fromUserPassword="HarishSathiya@07";      
								String emailHost="smtp.freesmtpservers.com";
								Transport trans=newSession.getTransport("smtp");
								trans.connect(emailHost, fromUser, fromUserPassword);
								trans.sendMessage(mimeMessage,mimeMessage.getAllRecipients());
								trans.close();
								System.out.println("email sent successfully ! ");
								
							}
							else
							{
								JOptionPane.showMessageDialog(send,"INVALID EMAIL ENTERED !","ERROR",JOptionPane.ERROR_MESSAGE);
							}
						}
						catch(Exception r)
						{
							System.out.println(r);
						}
					}
				}
				);
		pi.addActionListener(new ActionListener()
				{
			
					public void actionPerformed(ActionEvent e)
					{
						String oi=or.getText();
						if(oi.equals(pm))
						{
							passIndicator ri=new passIndicator();	
						}
						else
						{
							JOptionPane.showMessageDialog(pi,"INVALID OTP !","ERROR",JOptionPane.ERROR_MESSAGE);
							System.out.println(oi);
							System.out.println(pm);
						}
					}
					});
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stud
		ChangePass oi=new ChangePass();
		oi.ChangePas();
		
	}

}
