package com.hibernateMapping;

public class StockRecord {
	private int RecordId;
	private String RecordName;
	private Stock parentObjects;

	public int getRecordId() {
		return RecordId;
	}

	public void setRecordId(int recordId) {
		RecordId = recordId;
	}

	public String getRecordName() {
		return RecordName;
	}

	public void setRecordName(String recordName) {
		RecordName = recordName;
	}

	public Stock getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Stock parentObjects) {
		this.parentObjects = parentObjects;
	}

}
