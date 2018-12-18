package com.hibernateMapping;

public class Song {

	private int SongId;
	private String SongName;
	private int forevenId;
	private Artist parentObjects;

	public int getSongId() {
		return SongId;
	}

	public void setSongId(int songId) {
		SongId = songId;
	}

	public String getSongName() {
		return SongName;
	}

	public void setSongName(String songName) {
		SongName = songName;
	}

	public int getForevenId() {
		return forevenId;
	}

	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}

	public Artist getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Artist parentObjects) {
		this.parentObjects = parentObjects;
	}

}
