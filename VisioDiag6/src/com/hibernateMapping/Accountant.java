package com.hibernateMapping;

public class Accountant {
	private int AccountantId;
	private String AccountantName;
	private Account parentObjects;

	public int getAccountantId() {
		return AccountantId;
	}

	public void setAccountantId(int accountantId) {
		AccountantId = accountantId;
	}

	public String getAccountantName() {
		return AccountantName;
	}

	public void setAccountantName(String accountantName) {
		AccountantName = accountantName;
	}

	public Account getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Account parentObjects) {
		this.parentObjects = parentObjects;
	}

}
