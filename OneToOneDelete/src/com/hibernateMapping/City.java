package com.hibernateMapping;

public class City {
	private int CityId;
	private String CityName;
	private State s;

	public int getCityId() {
		return CityId;
	}

	public void setCityId(int cityId) {
		CityId = cityId;
	}

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}

	public State getS() {
		return s;
	}

	public void setS(State s) {
		this.s = s;
	}

}
