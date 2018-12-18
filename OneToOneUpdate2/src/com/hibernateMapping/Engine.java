package com.hibernateMapping;

public class Engine {
	private int EngineId;
	private String EngineName;
	private Car c;

	public int getEngineId() {
		return EngineId;
	}

	public void setEngineId(int engineId) {
		EngineId = engineId;
	}

	public String getEngineName() {
		return EngineName;
	}

	public void setEngineName(String engineName) {
		EngineName = engineName;
	}

	public Car getC() {
		return c;
	}

	public void setC(Car c) {
		this.c = c;
	}

}
