public class Customer {
	private String id; // Private attribute (can be accessed only within the class)
	private Alarm alarm; // Private attribute (can be accessed only within the class)

	// Constructor
	public Customer(String id) {
		this.id = id;
		this.alarm = new Alarm();
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	// Private methods to manage createTime and lastOrderTime
	private void setCreateTime() {
		// Implement code to set the create time (e.g., use System.currentTimeMillis())
	}

	private void setLastOrderTime() {
		// Implement code to set the last order time (e.g., use
		// System.currentTimeMillis())
	}

	// Other methods related to Customer class if needed

	// Inner class for Alarm
	private class Alarm {
		// Implement methods related to alarm if needed
	}
}