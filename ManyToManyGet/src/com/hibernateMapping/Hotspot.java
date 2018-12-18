package com.hibernateMapping;

import java.util.Set;

public class Hotspot {
	private int Hid;
	private String Hname;
	private Set Mobiles;

	public int getHid() {
		return Hid;
	}

	public void setHid(int hid) {
		Hid = hid;
	}

	public String getHname() {
		return Hname;
	}

	public void setHname(String hname) {
		Hname = hname;
	}

	public Set getMobiles() {
		return Mobiles;
	}

	public void setMobiles(Set mobiles) {
		Mobiles = mobiles;
	}

}
