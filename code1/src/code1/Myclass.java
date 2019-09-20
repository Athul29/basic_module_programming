package code1;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Myclass {
	
	public static void main(String[] args)throws IOException
	{
	   String name;
	   String address;
	   String contactNumber;
	   String email;
	   String proofType;
	   String proofId;
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   name=br.readLine();
	   address=br.readLine();
	   contactNumber=br.readLine();
	   email=br.readLine();
	   proofType=br.readLine();
	   proofId=br.readLine();
	   //nextInt;
	   //next().charAt(0);
	   //nextFloat;
	   //nextDouble;
	   Customer mc=new Customer( name, address, contactNumber, email, proofType, proofId);
	   mc.register(name, address, contactNumber, email, proofType, proofId);
	
	   
	}

}
