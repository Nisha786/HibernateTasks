package com.hibernateMapping;

public class Person {
	private int PersonId;
	private String PersonName;
	private Passport p;

	public int getPersonId() {
		return PersonId;
	}

	public void setPersonId(int personId) {
		PersonId = personId;
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public Passport getP() {
		return p;
	}

	public void setP(Passport p) {
		this.p = p;
	}

}
