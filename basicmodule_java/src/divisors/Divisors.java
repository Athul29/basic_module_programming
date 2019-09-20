package divisors;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,r,sum=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		for(r=1;r<=n/2;r++)
		{
			if(n%r==0)
			{
				sum=sum+r;
			}
		}
		//System.out.println(sum);
		if(sum==n)
		{
		    System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
	}

}
