package com.hibernateMapping;

import java.util.Set;

public class Class {
	private int Cid;
	private String Cname;
	private Set Students;

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public Set getStudents() {
		return Students;
	}

	public void setStudents(Set Students) {
		this.Students = Students;
	}

}
