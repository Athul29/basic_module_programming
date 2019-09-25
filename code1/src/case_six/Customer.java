package case_six;
public class Customer {
	   String name;
	   String address;
	   String contactNumber;
	   String email;
	   String proofType;
	   String proofId;
	   static int regID=0;
	   public Customer (String name,String address,String contactNumber,String email,String proofType,String proofId)
	   {
		   this.name=name;
		   this.address=address;
		   this.contactNumber=contactNumber;
		   this.email=email;
		   this.proofType=proofType;
		   this.proofId=proofId;
	   }
	   void register( String name,String address,String contactNumber,String email,String proofType,String proofId)
	   {
	        System.out.println(this.name);
	        System.out.println(this.address);
	        System.out.println(this.contactNumber);
	        System.out.println(this.email);
	        System.out.println(this.proofType);
	        System.out.println(this.proofId);
	        System.out.println("Thankz for registration.your id is"+regID);
	        
	   }
}
