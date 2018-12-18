package com.hibernateMapping;

import java.util.Set;

public class Director {
	private int DirectorId;
	private String DirectorName;
	private Set children;

	public int getDirectorId() {
		return DirectorId;
	}

	public void setDirectorId(int directorId) {
		DirectorId = directorId;
	}

	public String getDirectorName() {
		return DirectorName;
	}

	public void setDirectorName(String directorName) {
		DirectorName = directorName;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

}
