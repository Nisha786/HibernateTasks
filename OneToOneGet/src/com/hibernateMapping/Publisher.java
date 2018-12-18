package com.hibernateMapping;

public class Publisher {
	private int PublisherId;
	private String PublisherName;
	private Book b;

	public int getPublisherId() {
		return PublisherId;
	}

	public void setPublisherId(int publisherId) {
		PublisherId = publisherId;
	}

	public String getPublisherName() {
		return PublisherName;
	}

	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

}
