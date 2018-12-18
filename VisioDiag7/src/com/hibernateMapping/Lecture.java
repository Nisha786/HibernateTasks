package com.hibernateMapping;

public class Lecture {
	private int Lid;
	private String Lname;
	private Course parentObjects;

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

	public Course getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Course parentObjects) {
		this.parentObjects = parentObjects;
	}

}
