package cs3;

import java.util.Scanner;

public class Casestudy_three {
	public static Scanner sc=new Scanner(System.in);
  public static void main (String[] args)
  {
	  String p=" ";
	  int i=1;
	  int list[]=new int[25];
	  System.out.println("Registration");
	  System.out.println("Enter your name");
	  String name=sc.next();
	  System.out.println("Enter your address ");
	  String address=sc.next();
	  System.out.println("Enter your contact number");
	  String Cn=sc.next();
	  System.out.println("E-Mail ID");
	  String mail=sc.next();
	  System.out.println("Enter proof type");
	  String Ptype=sc.next();
	  System.out.println("Enter proof ID");
	  String Pid=sc.next();
	  System.out.println("Do you want to continue registration(yes/no)");
	  String NO=sc.next(); 
	  if(NO.equals("yes")==true)
	  {
		  list[i]=1;
		  System.out.println("Thank you for registaring, your  proof ID is "+i+"...");
		  i=i+1;
		  System.out.println("Update e-mail(yes/no)"); 
		  String k=sc.next();
		  if(k.equals("yes")==true)
		  {
			  System.out.println("Enter new Email id"); 
			  p=sc.next();
			  if(p.equals(mail)!=true)
			  {
				  System.out.println("Email updated");
				  System.out.println("your details are as follows");
				  System.out.println("Name :"+name);
				  System.out.println("address :"+address);
				  System.out.println("E-Mail ID :"+p);
				  System.out.println("contact number:"+Cn);
				  System.out.println("Proof type:"+Ptype);
				  System.out.println("Proof id:"+Pid);
			  }
			  else
			  {
				  System.out.println("Email updated");
				  System.out.println("your details are as follows");
				  System.out.println("Name :"+name);
				  System.out.println("address :"+address);
				  System.out.println("E-Mail ID :"+mail);
				  System.out.println("contact number:"+Cn);
				  System.out.println("Proof type:"+Ptype);
				  System.out.println("Proof id:"+Pid);
			  }
			  } 
			  else
			  {
				  System.out.println("Email updated");
				  System.out.println("your details are as follows");
				  System.out.println("Name :"+name);
				  System.out.println("address :"+address);
				  System.out.println("E-Mail ID :"+mail);
				  System.out.println("contact number:"+Cn);
				  System.out.println("Proof type:"+Ptype);
				  System.out.println("Proof id:"+Pid);
			  }
			  
				  
		  }
	}
  }


