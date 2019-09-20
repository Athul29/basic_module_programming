package student_count;
import java.util.Scanner;
public class Counter {

	public static void main(String[] args) {
		int num,i,total=0;
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		num=sc.nextInt();	
		int list[] = new int[num];
		System.out.println("Enter the marks of students");
		for(i=0;i<num;i++)
		{
			list[i]=sc.nextInt();
		}
		for(int j=0;j<num;j++)
		{
			if(list[j]<50)
			{
				total++;
			}
		}
		System.out.println("The number of students appearing for retest is "+total);
	}
	}



