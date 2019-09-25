import java.util.Date;
import java.util.Scanner;

public class Registration {
		String name;
		String address;
		String Cn;
		String Ptype;
		String Pid,NO;
		public static String[] arr=new String[25];
		public String[] mail=new String[25];
		public static Date dates1[]=new Date[25];
		public static int i=1;
		Scanner sc=new Scanner(System.in);
	public void register() {
		
		// TODO Auto-generated method stub
		System.out.println("Registration");
		System.out.println("Enter your name");
		arr[i]=sc.next();
		System.out.println(arr[i]);
		System.out.println("Enter your address ");
		address=sc.next();
		System.out.println("Enter your contact number");
		Cn=sc.next();
		System.out.println("E-Mail ID");
		mail[i]=sc.next();
		System.out.println("Enter proof type");
		Ptype=sc.next();
		System.out.println("Enter proof ID");
		Pid=sc.next(); 
		System.out.println("Thank you for registering.Your id is "+i);
		Booking ck=new Booking();
		System.out.println("Do you have to continue registration(yes/no)");
		NO=sc.next();
		if(NO.equals("yes")==true)
		{
			i++;
			register();
		}
		dates1[ck.y]=ck.dates[ck.y];
	}
	public void mailcheck()
	{
		
		System.out.println("Enter the customer ID");
		int k=sc.nextInt();
	    if(arr[k]!= null)
	    {
	    	System.out.println("Enter the new mail ID");
	    	mail[k]=sc.next();
	    	System.out.println("Email updated");
	    }
	}
	public void view()
	{
		System.out.println("The registered  customer are");
		for(int v=0;v<i;v++)
		{

			System.out.println(i);
			System.out.println(arr[i]);
		}
	}


}
