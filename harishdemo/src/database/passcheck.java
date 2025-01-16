package database;
import java.util.*;
public class passcheck {

		String caps="QWERTYUIOPASDFGHJKLZXCVBNM";
		String low="qwertyuiopasdfghjklzxcvbnm";
		String mailid="@";
		String mail2=".";
		String spl="!@#$%^&*()<>?";
		String num="1234567890";
		String mob="+-";
		
	public boolean checkcaps(String pass)
	{
		boolean temp=false;
		for(int i=0;i<pass.length();i++)
		{
			for(int j=0;j<caps.length();j++)
			{
				if(pass.charAt(i)==caps.charAt(j))
				{
					temp=true;
					break;
				}
				
			
			}
		}         
		return temp;
	}
	public boolean checkmail(String mail)
	{
		boolean temp=false;
		for(int i=0;i<mail.length();i++)
		{
			for(int j=0;j<mailid.length();j++)
			{
				if(mail.charAt(i)==mailid.charAt(j))
				{
					temp=true;
					break;
				}
			}
		}
		return temp;
	}
	public boolean checkdot(String mail)
	{
		boolean temp=false;
		for(int i=0;i<mail.length();i++)
		{
			for(int j=0;j<mail2.length();j++)
			{
				if(mail.charAt(i)==mail2.charAt(j))
				{
					temp=true;
					break;
				}
			}
		}
		return temp;
	}
	public boolean checklow(String pass)
	{
		boolean temp=false;
		for(int i=0;i<pass.length();i++)
		{
			for(int j=0;j<low.length();j++)
			{
				if(pass.charAt(i)==low.charAt(j))
				{
					temp=true;
					break;
				}
		

			}
		}
	return temp;	
	}
	public boolean checkspl(String pass)
	{	boolean temp=false;
		for(int i=0;i<pass.length();i++)
		{
			for(int j=0;j<spl.length();j++)
			{
				if(pass.charAt(i)==spl.charAt(j))
				{
					temp=true;
					break;
				}
			

			}
		
		}
		return temp;
	}
	public boolean checknum (String pass)
	{
		boolean temp=false;
		for(int i=0;i<pass.length();i++)
		{
			for(int j=0;j<num.length();j++)
			{
				if(pass.charAt(i)==num.charAt(j))
				{
					temp=true;
					break;
				}

			}
		}
		return temp;
	}
	public boolean checkph(String num)
	{
		boolean temp=false;
		for(int i=0;i<num.length();i++)
		{
			for(int j=0;j<mob.length();j++)
			{
				if(num.charAt(i)==mob.charAt(j))
				{
					temp=true;
					break;
				}
			}
		}
		return temp;
	}
	public boolean checklen(String num)
	{
		if(num.length()<=15)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}


		public static void main(String[] args)
		{
			// TODO to check whether the entered password is correct or not
			Scanner obj=new Scanner(System.in);
			System.out.println("ENTER THE PASSWORD: ");
			String password=obj.nextLine();
			passcheck c=new passcheck();
			boolean spl=c.checkspl(password);
			boolean caps=c.checkcaps(password);
			boolean low=c.checklow(password);
			boolean num=c.checknum(password);
			while(true)
			{
				if(spl==true && caps==true && low==true && num==true)
				{
					break;
				}
				else
				{
					System.out.println("INVALID !");
					System.out.println("ACCESS DENIED !");
					System.out.println("RE-ENTER THE PASSWORD !");
					password=obj.nextLine();
				}
			}
			
			


	}


}
