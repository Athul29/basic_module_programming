package toll;

import java.util.Scanner;

public class Toll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,hcount=0,lcount=0;;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vehicles");
		num=sc.nextInt();
		int list[] = new int[num];
		System.out.println("Enter the fare collected for vehicles");
		for(i=0;i<num;i++)
		{
			list[i]=sc.nextInt();
		}
		for(int j=0;j<num;j++)
		{
			if(list[j]>50)
			{
				hcount++;
			}
			else if(list[j]<50 && list[j]>0)
			{
				lcount++;
			}
			
		}
     	System.out.println("The number of heavy vehicles is "+hcount+ " and the number of light vehicles is " +lcount);
//		
		

	}

}
