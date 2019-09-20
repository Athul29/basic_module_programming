package auction;

import java.util.Scanner;

public class Auction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of application");
		num=sc.nextInt();	
		int list[] = new int[num];
		System.out.println("Enter the  of amount (in crores)");
		for(int i=0;i<num;i++)
		{
			list[i]=sc.nextInt();
		}
		int max =list[0];
		for(int i=0;i<num;i++)
		{
		   if(max<list[i])
		   {
			   max=list[i];
		   }
		}
		System.out.println("The winning bid is "+max+" crores");

	}

}
