import java.util.ArrayList;
import java.util.List;

// Payment Ŭ����: ���� ������ ���� Ŭ����
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
			// ���� ����� ���� ���� ó�� ���� ����
			// ����: �ſ�ī�� ����, ���� ���� ��
			System.out.println("������ �Ϸ�Ǿ����ϴ�. ���� �ݾ�: " + amount);
		} else {
			System.out.println("���� ����� �������ּ���.");
		}
	}
}
