
public class Faculty extends Employee{
	int OfficeHours;
	String Rank;
	public int getOfficeHours() {
		return OfficeHours;
	}
	public void setOfficeHours(int officeHours) {
		OfficeHours = officeHours;
	}
	public String getRank() {
		return Rank;
	}
	public void setRank(String rank) {
		Rank = rank;
	}
	@Override
	public String toString() {
		return "Faculty [ Name=" + Name + "]";
	}
	
	
}
