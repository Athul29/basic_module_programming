package casestudy_five;
import java.util.*;
public class bdbd
{
	 public static void main(String[] args)
	    {
		 int nxt[]=new int[2];
		 int k=0,j=0;
		 Scanner sc=new Scanner(System.in);
		 int i,m=0,flag=0;      
		  int n=sc.nextInt();
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){
		    		nxt[j]=i;
		    		j++;
		    		flag =0;
		    	}
		    	k++;
		       
		     flag=1;      
		     break;      
		    }      
		   
		   if(flag==0) 
		   { System.out.println(nxt[1]); 
		  }//end of else  
		}    
		} 
}	