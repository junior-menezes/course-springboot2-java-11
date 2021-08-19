package online.diagnosticit.course.entities.enums;

public enum OrderStatus {
	
	WATING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	//Construtor para um Tipo Enum.
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus x : OrderStatus.values()) {
			if (x.getCode() == code) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
