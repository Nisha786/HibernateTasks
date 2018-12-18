package com.hibernateMapping;

import java.util.Set;

public class Artist {
	private int ArtistId;
	private String ArtistName;
	private Set children;

	public int getArtistId() {
		return ArtistId;
	}

	public void setArtistId(int artistId) {
		ArtistId = artistId;
	}

	public String getArtistName() {
		return ArtistName;
	}

	public void setArtistName(String artistName) {
		ArtistName = artistName;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

}
