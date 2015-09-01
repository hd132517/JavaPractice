package org.dimigo.abstractclass;

public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
	}
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "의 전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay(){
		
	}
	
	public void useSpecialFunction(SmartPhone phone){
		if (this instanceof IPhone) {
			((IPhone) this).useAirDrop();
		} else if (this instanceof Galaxy) {
			((Galaxy) this).useWirelessCharging();
		}
	}
	public String toString(){
		return String.format("모델명 : %s, 제조사: %s, 가격 : %,d원", model, company, price);
	}
}
