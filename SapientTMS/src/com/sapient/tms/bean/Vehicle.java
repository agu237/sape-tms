package com.sapient.tms.bean;

public class Vehicle {
	
	private int id;
	private String model;
	private int capacity;
	
	public Vehicle(int id,String model,int capacity){
		this.id=id;
		this.model=model;
		this.capacity=capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}


