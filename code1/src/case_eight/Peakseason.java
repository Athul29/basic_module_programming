package case_eight;

public class Peakseason extends Booking {
	int Peakcharges;
	public int getPeakcharges() {
		return Peakcharges;
	}

	public void setPeakcharges(int peakchares) {
		Peakcharges = peakchares;
	}

	public void doubleroomBooking(int person, int total_days,double tariff,int peak,int ac)
	{
		System.out.println("Total Tariff:" +(person*total_days*tariff+peak+ac));

    }

	
	
}
