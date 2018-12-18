package com.hibernateMapping;

public class Switch {
	private int Sid;
	private String Sname;
	private int forevenId;
	private ElectronicComponent parentObjects;

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

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	public ElectronicComponent getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(ElectronicComponent parentObjects) {
		this.parentObjects = parentObjects;
	}

}
