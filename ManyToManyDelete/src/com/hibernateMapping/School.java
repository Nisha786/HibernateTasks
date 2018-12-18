package com.hibernateMapping;

import java.util.Set;

public class School {
	private int Sid;
	private String Sname;
	private Set Locations;

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public Set getLocations() {
		return Locations;
	}

	public void setLocations(Set locations) {
		Locations = locations;
	}

}
