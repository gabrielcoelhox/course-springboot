package com.example.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	//Converter valor númerico para enumerado
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {         //Se o código for igual, irá retornar
				return value;
			}
		} //Se não existir o código
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
