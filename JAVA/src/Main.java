	import java.util.Scanner;
	import java.io.BufferedInputStream;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
import java.text.ParseException;
    public class Main {

		private static int m;

		public static void main(String[] args)throws IOException, ParseException
		{	
			
		    Scanner sc=new Scanner(System.in);
			System.out.println("Menu");
			System.out.println("1.Register");
			System.out.println("2.Book");
			System.out.println("3.Check Status");
			System.out.println("4.Email");
			System.out.println("5.All Bookings");
			System.out.println("6.All Customers");
			System.out.println("7.exit");
			System.out.println("Choose your option");
			int b=sc.nextInt();
			do {
			switch(b)
			{
				case 1:
					Registration mc = new Registration();
				    mc.register();
					break;
				case 2:
					Booking bk=new Booking();
					bk.book();
					break;
				case 3:
					Booking bc=new Booking();
					bc.check();
					break;
				case 4:
					Registration rg=new Registration();
					rg.mailcheck();
					break;
				case 5:
					Booking bks=new Booking();
					bks.datechecker();
					break;
				case 6:
					Registration rn=new Registration();
					rn.view();
					break;
			}
			System.out.println("Choose your option");
			 b=sc.nextInt();
			}while(7>=b);
		}
}
