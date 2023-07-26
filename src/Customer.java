public class Customer {
	private int id; // Private attribute (can be accessed only within the class)
	private Alarm alarm; // Private attribute (can be accessed only within the class)

	// Constructor
	public Customer(int id) {
		this.id = id;
		this.alarm = new Alarm();
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public String inputPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int digit = random.nextInt(10); // 0부터 9까지의 랜덤한 숫자 생성
            phoneNumber.append(digit);
        }
        phoneNumber.append("-");

        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            phoneNumber.append(digit);
        }
        phoneNumber.append("-");

        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            phoneNumber.append(digit);
        }

        return phoneNumber.toString();
    	
	}

	// Private methods to manage createTime and lastOrderTime
	private void setCreateTime() {
		// Implement code to set the create time (e.g., use System.currentTimeMillis())
	}

	private void setLastOrderTime() {
		// Implement code to set the last order time (e.g., use
		// System.currentTimeMillis())
	}
}
