package case_eight;

public class Booking {
	int person;
	int total_days;
	String roomType;
	int month;
	double tariff;
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public int getTotal_days() {
		return total_days;
	}

	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}

	public double getTariff() {
		return tariff;
	}

	public void setTariff(double tariff) {
		this.tariff = tariff;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	
	public void doubleroomBooking(int person, int total_days,double tariff,String RoomType)
	{
		System.out.println("Total Tariff:"+person*total_days*tariff);

    }
}


