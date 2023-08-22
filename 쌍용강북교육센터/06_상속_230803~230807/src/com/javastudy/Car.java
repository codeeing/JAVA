package com.javastudy;
// 230804
public class Car {
	private String name;
	private int speed;
	
	public Car(String name, int speed){
		this.name = name;
		this.speed = speed;
	}
	
	// setter
	public void setSpeed(int speed) {
		if (speed>0)
			this.speed = speed;
	}
	public void prnCar() {
		System.out.println("이름: "+name);
		System.out.println("속도: "+speed);
	}
	
}
