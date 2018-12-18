package com.hibernateMapping;

public class Medication {
	private int MedicationId;
	private String MedicationName;
	private Person parentObjects;

	public int getMedicationId() {
		return MedicationId;
	}

	public void setMedicationId(int medicationId) {
		MedicationId = medicationId;
	}

	public String getMedicationName() {
		return MedicationName;
	}

	public void setMedicationName(String medicationName) {
		MedicationName = medicationName;
	}

	public Person getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Person parentObjects) {
		this.parentObjects = parentObjects;
	}

}
