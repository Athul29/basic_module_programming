package leap;
import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		int num;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		num=sc.nextInt();	
		if(num %400==0)
		{
			System.out.println("It is a leap year");
		}
		else if(num %100==0)
		{
			System.out.println("It is not a leap year");
			
		}
	}

}
