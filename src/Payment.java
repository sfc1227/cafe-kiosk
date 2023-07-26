import java.util.ArrayList;
import java.util.List;

// Payment 클래스: 결제 관리를 위한 클래스
public class Payment {
	private List<PaymentMethod> methods;
	private PaymentMethod selectedMethod;

	public Payment() {
		this.methods = new ArrayList<>();
		this.selectedMethod = null;
	}

	public void addPaymentMethod(PaymentMethod method) {
		methods.add(method);
	}

	public void removePaymentMethod(PaymentMethod method) {
		methods.remove(method);
	}

	public void selectPaymentMethod(PaymentMethod method) {
		selectedMethod = method;
	}

	public void processPayment(double amount) {
		if (selectedMethod != null) {
			// 결제 방법에 따른 결제 처리 로직 구현
			// 예시: 신용카드 결제, 현금 결제 등
			System.out.println("결제가 완료되었습니다. 결제 금액: " + amount);
		} else {
			System.out.println("결제 방법을 선택해주세요.");
		}
	}
}
