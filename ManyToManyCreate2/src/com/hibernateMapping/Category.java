package com.hibernateMapping;

import java.util.Set;

public class Category {
	private int categoryId;
	private String name;
	private Set Stocks;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getStocks() {
		return Stocks;
	}

	public void setStocks(Set stocks) {
		Stocks = stocks;
	}

}
