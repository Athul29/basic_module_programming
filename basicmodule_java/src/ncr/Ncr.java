package ncr;

import java.util.Scanner;

public class Ncr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,k=1,j=1,l=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter the value of r");
		r=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			 k=k*i;
		}
		
		for(int i=1;i<=r;i++)
		{
			 j=j*i;
		}
		
		int m=n-r;
		for(int i=1;i<=m;i++)
		{
			l=l*i;
		}
		int b=l*j;
		int ncr=k/b;
		System.out.println("The NCR factor for given values is "+ncr);
	}

}
