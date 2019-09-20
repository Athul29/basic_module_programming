package sort;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		int num,i;
		System.out.println("Enter the number of students");	
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		float list[] = new float[num];
		System.out.println("Enter the heights of students");	
		for(i=0;i<num;i++)
		{
			list[i]=sc.nextFloat();
		}
		System.out.println("");
		for(int j=0;j<num;j++)
		{
			for(int k=0;k<num;k++)
			{
				if(list[j]<list[k])
				{
					float temp=list[j];
					list[j]=list[k];
					list[k]=temp;
				}
			}
		}
		System.out.println("The heights in order are ");
		for(int m=0;m<num;m++)
		{
			System.out.println(list[m]);
		}
	}

}
