package com.hibernateMapping;

import java.util.Set;

public class Mobile {
	private int Mid;
	private String Mname;
	private Set Hotspots;

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

	public Set getHotspots() {
		return Hotspots;
	}

	public void setHotspots(Set hotspots) {
		Hotspots = hotspots;
	}

}
