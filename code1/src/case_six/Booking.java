package case_six;

import java.util.Scanner;

public class Booking 
 {
	   String name;
       String address;
       String Cn;
       String mail;
       String Ptype;
       String Pid;
       static int regID=0;
       int x=1;
       public Booking (String name,String address,String contactNumber,String email,String proofType,String proofId)
       {
		   this.name=name;
		   this.address=address;
		   this.Cn=contactNumber;
		   this.mail=email;
		   this.Ptype=proofType;
		   this.Pid=proofId;
	   }
	   void Book( String name,String address,String contactNumber,String email,String proofType,String proofId)
	   {
	        System.out.println(this.name);
	        System.out.println(this.address);
	        System.out.println(this.Cn);
	        System.out.println(this.mail);
	        System.out.println(this.Ptype);
	        System.out.println(this.Pid);	        
		    String ac;
            String cot;
		    String cable;
			String wifi;
			String laundry;
			Scanner sc= new Scanner(System.in);
			int total,b=0,c,d,e,f;
			// TODO Auto-generated method stub
				System.out.println("Booking");
				System.out.println("Please choose the service required.");
				System.out.println("AC/non-AC(AC/nAC)");
				
				ac=sc.next();
				if (ac.equals("AC")==true)
				{
					b=1000;
				}
				else 		
				{
					b=750;
				}
				
				System.out.println("Cot(Single/Double)");
				cot=sc.next();
				if (cot.equals("Single")==true)
				{
					c=0;
				}
				else 
				{
					c=350;
				}
				
				System.out.println("With cable connection/without cable connection(C/nC)");
				cable=sc.next();
				if (cable.equals("C")==true)
				{
					d=50;
				}
				else
				{
					d=0;
				}
				
				System.out.println("wifi needed or not(W/nW)");
				wifi=sc.next();
				if (wifi.equals("W")==true)
				{
					e=200;
				}
				else
				{
					e=0;
				}
				System.out.println("laundry service needed or not(L/nL)");
				laundry=sc.next();
				if (laundry.equals("L")==true)
				{
					f=100;
				}
				else 
				{
					f=0;
				}
				total=b+c+d+e+f;
				System.out.println("The total charge is Rs."+total);
				System.out.println("The services chosen are ");
				if(b==1000)
				{
				System.out.println("AC");
				}
				else 
				{
					System.out.println("non-AC");
				}
				
				if(c==0)
				{
					System.out.println("Single cot");
				}
				else {
					System.out.println("double cot");
				}
				if(d!=0)
				{
					System.out.println("Cable connection enabled");
				}
				else
				{
						System.out.println("Cable connection not enabled");
				}
				if(e!=0)
				{
					System.out.println("Wifi enabled");
				}
				else
				{
						System.out.println("Wifi not enabled");	
				}
				if(f!=0)
				{
					System.out.println("with laundry services");
				}
				else
				{
					System.out.println("without laundry services");
				}
				System.out.println("Do you want to proceed");
				String proceed=sc.next();
				if(proceed.equals("yes")==true)
				{
					//booked[x]=1;
					 System.out.println("Thank you for booking your room number is"+x);
					 x=x+1;
				}
}
}
