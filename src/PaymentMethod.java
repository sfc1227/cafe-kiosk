
// PaymentMethod 클래스: 결제 방법을 나타내는 클래스
public class PaymentMethod {
	String name;
	String code;
	String type;

	public PaymentMethod(String name, String code, String type) {
		super();
		this.name = name;
		this.code = code;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
