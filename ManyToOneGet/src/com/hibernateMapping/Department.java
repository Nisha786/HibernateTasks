package com.hibernateMapping;

public class Department {
	private int DepartmentId;
	private String DepartmentName;
	private Company parentObjects;

	public int getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public Company getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Company parentObjects) {
		this.parentObjects = parentObjects;
	}

}
