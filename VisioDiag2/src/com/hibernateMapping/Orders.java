package com.hibernateMapping;

public class Orders {

	private int Oid;
	private String Oname;
	private int forevenId;

	public int getOid() {
		return Oid;
	}

	public void setOid(int oid) {
		Oid = oid;
	}

	public String getOname() {
		return Oname;
	}

	public void setOname(String oname) {
		Oname = oname;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

}
