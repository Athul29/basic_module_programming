package case_six;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hotel {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws IOException
	{	
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
		Registration mc = new Registration();
	switch(b)
	{
			
	case 1:
		   
			mc.register();
	 }

}
}
