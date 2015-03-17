
public class Person {
	String Name;
	String Address;
	long PhoneNum;
	String Email;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + "]";
	}
	
	
	
	
}
