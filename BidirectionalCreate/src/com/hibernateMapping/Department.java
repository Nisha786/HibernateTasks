package com.hibernateMapping;

import java.util.Set;

public class Department {
	private int Did;
	private String Dname;
	private Set Professor;

	public int getDid() {
		return Did;
	}

	public void setDid(int did) {
		Did = did;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public Set getProfessor() {
		return Professor;
	}

	public void setProfessor(Set professor) {
		Professor = professor;
	}

}
