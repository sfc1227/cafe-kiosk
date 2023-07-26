import java.util.Scanner;

public class Kiosk {
	private Customer customer;
	private Language lang;
	private Payment payment;
	private MenuItem[] menu;
	private Alarm alarm;

	// Constructor
	public Kiosk() {
		this.customer = null;
		this.lang = new Language();
		this.payment = null;
		this.menu = null;
		this.alarm = new Alarm();
	}

	public void showAllMenus() {
		// Implement code to display all available menus
	}

	public void displayPayMethod() {
		// Implement code to display payment methods
	}

	public void choosePayMethod() {
		// Implement code to choose a payment method
	}

	public void pay() {
		// Implement code for the payment process
	}

	public void displaySignUpWindow() {
		// Implement code to display the sign-up window
	}

	public void changeLang(String code) {
		this.lang.setLanguageCode(code);
		// Implement code to change the language
	}

	public void selectMenu(int customerId) {
		// Implement code to allow the customer to select a menu
	}

	public void addMemberAccount(Customer customer) {
		this.customer = customer;
		// Implement code to add a member account
	}

	public void sendSignUpMessage() {
		// Implement code to send a sign-up message
	}

	public boolean checkAccount(String phoneNumber) {
		// Implement code to check if an account exists for the given phone number
		return false;
	}

	// Inner class for Language
	private class Language {
		private String languageCode;

		public Language() {
			this.languageCode = "en"; // Default language code is English
		}

		public void setLanguageCode(String code) {
			// Implement code to set the language code
		}

		// Implement other methods related to language if needed
	}

	// Inner class for Alarm
	private class Alarm {
		// Implement methods related to alarm if needed
	}

	// Inner class for Customer
	private class Customer {
		// Implement properties and methods related to customer if needed
	}

	// Inner class for Payment
	private class Payment {
		// Implement properties and methods related to payment if needed
	}

	// Inner class for MenuItem
	private class MenuItem {
		// Implement properties and methods related to menu items if needed
	}

	// Main method to run the Kiosk application
	public static void main(String[] args) {
		Kiosk kiosk = new Kiosk();
		Scanner scanner = new Scanner(System.in);

		// Implement the main logic of the Kiosk application here
		System.out.println("Hello");
		scanner.close();
	}
}
