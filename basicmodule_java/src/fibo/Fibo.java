package fibo;
import java.util.Scanner;
public class Fibo {
	public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number" );
	num=sc.nextInt();	
	num=num+3;
	int list[] = new int[num];
	list[0]=0;
	list[1]=1;
	for(int j=2;j<num;j++)
	{
		list[j]=list[j-1]+list[j-2];
	}
	System.out.println("The fibonacci series is" );
	for(int m=0;m<num;m++)
	{
		System.out.println(list[m]);
	}
	
}

}
