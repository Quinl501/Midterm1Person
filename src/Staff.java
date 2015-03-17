
public class Staff extends Employee {
	String Title;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	@Override
	public String toString() {
		return "Staff [Name=" + Name +"]";
	}
	
	
}
