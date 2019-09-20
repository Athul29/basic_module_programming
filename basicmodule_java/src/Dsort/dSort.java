package Dsort;
import java.util.Scanner;
public class dSort {

	public static void main(String[] args) {
		int num,i;
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		num=sc.nextInt();
		int list[] = new int[num];
		System.out.println("Enter marks of students");
		for(i=0;i<num;i++)
		{
			list[i]=sc.nextInt();
		}
		for(int j=0;j<num;j++)
		{
			for(int k=0;k<num;k++)
			{
				if(list[j]>list[k])
				{
					int temp=list[j];
					list[j]=list[k];
					list[k]=temp;
				}
			}
		}
		System.out.println("The priority of marks is");
		for(int m=0;m<num;m++)
		{
			System.out.println(list[m]);
		}
	}

}

