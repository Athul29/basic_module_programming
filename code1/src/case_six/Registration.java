package case_six;
import java.util.Scanner;
public class Registration {
	Scanner sc=new Scanner(System.in);
	String name;
    String address;
    String Cn;
    String mail;
    String Ptype;
    String Pid;
    static int regID=0;
    int x=1;
    int i=1;
    String NO;
		  
		        
				       /*public Registration(String name2, String address2, String cn2, String mail2, String ptype2, String pid2) {

						   this.name=name2;
						   this.address=address2;
						   this.Cn=cn2;
						   this.mail=mail2;
						   this.Ptype=ptype2;
						   this.Pid=pid2;*/
				// TODO Auto-generated constructor stub
			        //}

					public Registration() {
		// TODO Auto-generated constructor stub
	}


					public void register()
				       {
						
						
		          	         //System.out.println("Thank you for registaring, your  proof ID is "+i+"...");
					         System.out.println("Do you want to book a room(yes/no)");
					         NO=sc.next();
					         //i++;
					         Booking bc=new Booking(name, address, Cn, mail, Ptype, Pid);
					         bc.Book(name, address, Cn, mail, Ptype, Pid);
					   }
				// TODO Auto-generated constructor stub
			
		
	
	}


