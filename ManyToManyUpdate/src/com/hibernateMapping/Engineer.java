package com.hibernateMapping;

import java.util.Set;

public class Engineer {
	private int EngineerId;
	private String EngineerName;
	private Set Fields;

	public int getEngineerId() {
		return EngineerId;
	}

	public void setEngineerId(int engineerId) {
		EngineerId = engineerId;
	}

	public String getEngineerName() {
		return EngineerName;
	}

	public void setEngineerName(String engineerName) {
		EngineerName = engineerName;
	}

	public Set getFields() {
		return Fields;
	}

	public void setFields(Set fields) {
		Fields = fields;
	}

}
