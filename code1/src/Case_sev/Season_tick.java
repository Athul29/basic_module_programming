package Case_sev;
import java.util.Scanner;
public class Season_tick extends Booking {
	int person;
	int days;
	int tariif;
	Scanner sc=new Scanner(System.in);
	void getPerson(int psn)
	{
		this.person=psn;
	}
	void getDays(int dys)
	{
	  this.days=dys;	
	}
	 void gettariff(int tar)
	{
	    this.tariif=tar;	
	}
	 int setPerson()
	 {
		 return this.person;
	 }
	 int setDays()
	 {
		return this.days ;
	 }
	 int settariff()
	 {
		 return this.tariif;
	 }
}
