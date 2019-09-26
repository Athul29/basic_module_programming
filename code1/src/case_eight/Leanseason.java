package case_eight;

public class Leanseason extends Booking {
	
	int discount;
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public void doubleroomBooking(int person, int total_days,double tariff,int discount,int ac)
	{
		System.out.println("Total Tariff:" +(person*total_days*tariff-discount+ac));

    }

}
