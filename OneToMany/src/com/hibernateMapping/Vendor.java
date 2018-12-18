package com.hibernateMapping;

import java.util.Set;

public class Vendor {
	private int Vid;
	private String Vname;
	private Set children; // to set children property
	public int getVid() {
		return Vid;
	}
	public void setVid(int vid) {
		Vid = vid;
	}
	public String getVname() {
		return Vname;
	}
	public void setVname(String vname) {
		Vname = vname;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}

}
