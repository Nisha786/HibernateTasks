package com.hibernateMapping;

public class Professor {
	private int Pid;
	private String Pname;
	private int forevenId;
	private Department parentObjects;

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	public Department getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Department parentObjects) {
		this.parentObjects = parentObjects;
	}

}
