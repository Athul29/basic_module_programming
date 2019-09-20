package gold;

import java.util.Scanner;

public class Gold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		int num=sc.nextInt();
		int b=num/5;
		
		num=b+num+b/5;
		System.out.println("The number of sculptors can be made is "+num);

	}

}
