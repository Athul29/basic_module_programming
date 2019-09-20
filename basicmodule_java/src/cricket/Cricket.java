package cricket;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		float total=0;
		System.out.println("Enter number of bowlers");
		n=sc.nextInt();
		int list[] = new int[n];
		int list1[] = new int[n];
		float list2[] = new float[n];
		System.out.println("Enter runs conceded by bowlers");
		for(int i=0;i<n;i++)
		{
			list[i]=sc.nextInt();
		}
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<n;i++)
		{
			list1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			float m=list1[i]/6;
			list2[i]=list[i]/m;
		}
		System.out.println("Economy of the bowler is");
		for(int i=0;i<n;i++)
		{
			System.out.println(list2[i]);
		}
		for(int j=0;j<n;j++)
		{
			total=total+list2[j];
		}
		total=total/n;
		System.out.println("Overall economy of the team is" +total);
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(list2[i]<6)
			{
				count++;
			}
		}
		System.out.println("The number of bowlers eligible are " +count);
	}

}
