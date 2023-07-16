package com.desafio.entities;

public class Order {

	private Integer code;
	private Double basicValue;
	private Double discount;
	
	public Order(Integer code, Double basicValue, Double discount) {
		this.code = code;
		this.basicValue = basicValue;
		this.discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getBasicValue() {
		return basicValue;
	}

	public void setBasic(Double basicValue) {
		this.basicValue = basicValue;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	
	
}