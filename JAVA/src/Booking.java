import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.Scanner;
public class Booking {
	String ac,cot,cable,wifi,laundry;
	public static int y=1,h=1;
	public static Date dates[]=new Date[25];
	Scanner sc=new Scanner(System.in);
	SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
	public void book() throws ParseException {
		int b,c,d,e,f,g;
		System.out.println("Booking");
		System.out.println("AC/non-AC(AC/nAC)");
		ac=sc.next();
		if (ac.equals("AC")==true)
		{
			b=1500;
		}
		else 		
		{
			b=700;
		}
		
		System.out.println("Cot(Single/Double)");
		cot=sc.next();
		if (cot.equals("Single")==true)
		{
			c=50;
		}
		else 
		{
			c=100;
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
			e=150;
		}
		else
		{
			e=0;
		}
		System.out.println("laundry service needed or not(L/nL)");
		laundry=sc.next();
		if (laundry.equals("L")==true)
		{
			f=300;
		}
		else 
		{
			f=0;
		}
		System.out.println("Enter your date of booking");	  
		String day=sc.next();
		dates[y] =formatter1.parse(day); 
		y=y+1;
		int total=b+c+d+e+f;
		System.out.println("The total charge is Rs."+total);
		System.out.println("The services chosen are ");
		if(b==1500)
		{
		System.out.println("AC");
		}
		else 
		{
			System.out.println("non-AC");
		}
		
		if(c==50)
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
		System.out.println("Do you want to proceed?(yes/no)");
		String proceed=sc.next();
		if(proceed.equals("yes")==true)
		{
		    System.out.println("Thank you for booking.Your room number is " +(y-1));
		}
	}
	public void check()
	{
		System.out.println("Enter the room number");
		int j=sc.nextInt();
		if(dates[j]!=null)
		{
			System.out.println("Room number "+j+" is not free");
		}
		else
			System.out.println("Room number "+j+"is  free");
			
	}
	public void datechecker() throws ParseException
	{
		System.out.println("Enter the start date");
		String date1=sc.next();
		 Date start=formatter1.parse(date1); 
		System.out.println("Enter the end date");
		String date2=sc.next();
		 Date end=formatter1.parse(date2); 	
		System.out.println("The bookings made from "+date1+" to"+date2+"are");
		System.out.println("Room number               Customer ID");
		for(int l=0;l<y;l++)
		{
			for(int m=1;m<=y;m++)
			{
				if(dates[m].after(start)&&(dates[m].before(end)))
				{
					 System.out.println(m+"               "+m);
					
					
				}
				else
					break;
			}	
		}
		
	
	}
}