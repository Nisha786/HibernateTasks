package com.hibernateMapping;

public class StakeHolder {
	private int ContactId;
	private String RollName;
	private Project parentObjects;

	public int getContactId() {
		return ContactId;
	}

	public void setContactId(int contactId) {
		ContactId = contactId;
	}

	public String getRollName() {
		return RollName;
	}

	public void setRollName(String rollName) {
		RollName = rollName;
	}

	public Project getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Project parentObjects) {
		this.parentObjects = parentObjects;
	}

}
