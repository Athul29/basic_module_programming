package Case_sev;
import java.util.Scanner;
public class Case_sev { 
	public static void main(String[] args)
			{	
			    Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number of persons");
				int a=sc.nextInt();
				System.out.println("Enter the number of days");
				int b=sc.nextInt();
				System.out.println("Enter the room type");
			    String AC=sc.next();
			    System.out.println("Enter the tarriff for a single person");
			    int c=sc.nextInt();
			    Season_tick st=new Season_tick();
			    st.getPerson(a);
			    st.getDays(b);
			    st.gettariff(c);
			    a=st.setPerson();
			    b=st.setDays();
			    c=st.settariff();
				st.book(a, b, c);
	}

}
