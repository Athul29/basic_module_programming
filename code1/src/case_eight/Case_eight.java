package case_eight;

import java.util.Scanner;

public class Case_eight {
	
	public static void main(String[] args)
	
	{
		int person;
		int total_days;
		String roomType;
		int discount=0;
		int month;
		double tariff;
		int peak=0;
		int ac=0;
	    Peakseason bs=new Peakseason();
		Scanner sc=new Scanner(System.in);
		System.out.println("Booking");
		System.out.println("The number of persons");
		person=sc.nextInt();
		System.out.println("Enter the number of days");
		total_days=sc.nextInt();
		System.out.println("Enter the room type (AC/nAC)");
		roomType=sc.next();
		if(roomType.equals("AC")==true)
		{
			bs.achgs=500;
			ac=bs.achgs;
			
		}
		else
		{
			bs.achgs=250;
			ac=bs.achgs;
		}
		System.out.println("Enter the month");
		month=sc.nextInt();
		if(month==4 || month==5 ||  month==6 || month==9 ||month==11||month==12 )
		{
			 System.out.println("Enter the peak charges");
			 peak=sc.nextInt();	
		}
		if(month==1 || month==2 ||  month==3 || month==7 ||month==8 || month==10)
		{
			System.out.println("Enter the discount");
			discount=sc.nextInt();
		}
		
		System.out.println("Enter the tariff for a single person");
		tariff=sc.nextFloat();
		
	    bs.setPerson(person);
	    int a=bs.getPerson();
	    bs.setTotal_days(total_days);
	    int b=bs.getTotal_days();
	    bs.setTariff(tariff);
	    double c=bs.getTariff();
	    bs.setMonth(month);
	    int d=bs.getMonth();
	    bs.setPeakcharges(peak);
	    int x=bs.getPeakcharges();
	    bs.setRoomType(roomType);
	    String e=bs.getRoomType();   
	    Leanseason ls=new Leanseason();
	    ls.setDiscount(discount);
	    int f=ls.getDiscount() ;   
	    		if((d>=1&&d<=3)||(d>=7&&d<=10))
	    		{
	    		  ls.doubleroomBooking(a, b, c, f,ac);
	    		}
	    		else
	    		{
	    		   bs.doubleroomBooking(a, b, c, x,ac);
	    		}

	}

}
