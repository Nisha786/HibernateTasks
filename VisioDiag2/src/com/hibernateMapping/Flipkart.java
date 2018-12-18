package com.hibernateMapping;

import java.util.Set;

public class Flipkart {
	private int Fid;
	private String Fname;
	private Set children;

	public int getFid() {
		return Fid;
	}

	public void setFid(int fid) {
		Fid = fid;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

}
