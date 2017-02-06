package com.sapient.tms.bean;

public class Car extends Vehicle {
	
	int capacity;
	String model;
	
	public Car(int capacity,String model){
		this.capacity=capacity;
		this.model=model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
