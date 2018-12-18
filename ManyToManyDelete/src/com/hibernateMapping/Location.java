package com.hibernateMapping;

import java.util.Set;

public class Location {
	private int Lid;
	private String Lname;
	private Set Schools;

	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public Set getSchools() {
		return Schools;
	}

	public void setSchools(Set schools) {
		Schools = schools;
	}

}
