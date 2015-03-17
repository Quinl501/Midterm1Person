
public class Student extends Person{
	String Status;

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	} 

	@Override
	public String toString() {
		return "Student [ Name=" + Name + "]";
	}
	

}
