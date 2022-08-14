package test;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Car {
	
	//instance variable
	private String model;
	private Double speed;

	//instance methods
	
	public boolean start() {
		return true;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public void accelerate() {
		speed +=10;
		
	}
	public void changeInt(int i) {
		i = i + 10;
	}
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.model = "VMw";
		car1.speed = 10.0 ;
		car2.model = "Maruthi";
		car2.speed =20.4;
		System.out.println(car1.model);
		System.out.println(car2.model);
		int count = 100;
		car1.changeInt(count);
		System.out.println(count);
	}
}
