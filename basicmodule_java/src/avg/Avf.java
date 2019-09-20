package avg;
import java.util.Scanner;
public class Avf {

	public static void main(String[] args) {
		int num,i,total=0;
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		num=sc.nextInt();	
		int list[] = new int[num];
		System.out.println("Enter the marks of student");
		for(i=0;i<num;i++)
		{
			list[i]=sc.nextInt();
		}
		for(int j=0;j<num;j++)
		{
			total=total+list[j];
		}
		num=total/num;
		System.out.println("The avarage is "+num);
	}
	}



