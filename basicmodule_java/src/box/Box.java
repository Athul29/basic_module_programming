package box;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		num=sc.nextInt();	
		int list[] = new int[num];
		System.out.println("Enter the number of fouls made by each player");
		for(int i=0;i<num;i++)
		{
			list[i]=sc.nextInt();
		}
		int min =list[0];
		for(int i=0;i<num;i++)
		{
		   if(min>list[i])
		   {
			   min=list[i];
		   }
		}
		for( j=0;j<num;j++)
		{
		   if(min==list[j])
		   {
			   int k=j+1;
			   System.out.println("The eligible player is player no:"+k+"("+min+"fouls)");
			   break;
		   }
		}

		
	}

}
