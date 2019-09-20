package angtm;
import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) {
     int var,m,count=0,sum=0,rem1;
     Scanner sc=new Scanner(System.in);
     var=sc.nextInt();
     m=var;
     int n=var;
     while(m!=0)
     {
       count++;
       m=m/10;
     }
     while(var!=0)
     {
    	 rem1=var%10;
    	sum = sum+(int)Math.pow(rem1, count);
    	var=var/10;
     }
     
     if(n==sum)
     {
    	 System.out.println("The given number is amstrong");
     
     }
     else
     {
    	 System.out.println("The given number is not amstrong");
     }
     
     

	}

}
