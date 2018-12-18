package com.hibernateMapping;

import java.util.Set;

public class Mother {
    private int Mid;
    private String Mname;
    private Set child;
	public int getMid() {
		return Mid;
	}
	public void setMid(int mid) {
		Mid = mid;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public Set getChild() {
		return child;
	}
	public void setChild(Set child) {
		this.child = child;
	}
	
    
}
