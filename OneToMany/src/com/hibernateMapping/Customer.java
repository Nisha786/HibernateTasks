package com.hibernateMapping;

public class Customer {
 private int Cid;
 private String Cname;
 private int vendorId;  // to insert vendor id
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
public int getVendorId() {
	return vendorId;
}
public void setVendorId(int vendorId) {
	this.vendorId = vendorId;
}
 
}
