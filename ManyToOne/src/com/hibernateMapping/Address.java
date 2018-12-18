package com.hibernateMapping;

public class Address {
	private int AddrId;
	private String City;
	private Student parentObjects;

	public int getAddrId() {
		return AddrId;
	}

	public void setAddrId(int addrId) {
		AddrId = addrId;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Student getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Student parentObjects) {
		this.parentObjects = parentObjects;
	}

}
