package limit;

import java.util.Scanner;

public class Limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,total=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		if(num < 0)
		{
			System.out.println("Enter a number");
			num=sc.nextInt();
		}
		int list[] = new int[num];
		for(int j=1;j<=num;j++)
		{
			total=total+j;
		}
		System.out.println("The sum is "+total);
	}

}
