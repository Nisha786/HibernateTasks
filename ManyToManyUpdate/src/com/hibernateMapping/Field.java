package com.hibernateMapping;

import java.util.Set;

public class Field {
	private int FieldId;
	private String FieldName;
	private Set Engineers;

	public int getFieldId() {
		return FieldId;
	}

	public void setFieldId(int fieldId) {
		FieldId = fieldId;
	}

	public String getFieldName() {
		return FieldName;
	}

	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}

	public Set getEngineers() {
		return Engineers;
	}

	public void setEngineers(Set engineers) {
		Engineers = engineers;
	}

}
