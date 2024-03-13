package com.kh.chap05_assist2.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {
	
//	객체를 직렬화 할 수 있는 Serializable
//	객체 입출력 스트림에서 사용되어질 객체는 반드시 Serializable을 구현해야 한다.
//	하지 않으면 'java.io.NotSerializableException' 에러 발생함
	
	// serialVersionUId : 클래스별 식별번호(고유번호)
	private static final long serialVersionUId = 1L;
	
	
	// transient : 객체 입출력시 해당값은 전송하지 않게 하는 예약어
	private String number;
	private String name;
	private transient int price;
	
	
	public Phone() {
		
	}


	public Phone(String number, String name, int price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Phone [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
