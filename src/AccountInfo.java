
public class AccountInfo {
	
	private String phoneNumber;
	private int point;
	
	public AccountInfo(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.point = 0;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPoint() {
		return point;
	}
	public void addPoint(int point) {
		this.point = this.point + point;
	}
	
	
	
}
