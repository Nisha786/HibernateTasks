package com.hibernateMapping;

public class Car {
	private int CarId;
	private String CarName;
	private int forevenId;
	private Owner parentObjects;

	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	public Owner getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Owner parentObjects) {
		this.parentObjects = parentObjects;
	}

}
