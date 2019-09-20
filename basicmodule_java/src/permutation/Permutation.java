package permutation;

import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		int num,k=1;
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of alphabets in your name");
		num=sc.nextInt();	
		for(int i=1;i<=num;i++)
		{
			 k=k*i;
		}
		System.out.println("The number of combinations is "+k);
	}

}
