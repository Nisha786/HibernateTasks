package com.hibernateMapping;

import java.util.Set;

public class Student {
	private int Sid;
	private String Sname;
	private Set Classes;

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

	public Set getClasses() {
		return Classes;
	}

	public void setClasses(Set classes) {
		Classes = classes;
	}

}
