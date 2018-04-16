package com.mazurak.pojo;

import java.time.LocalTime;

public class Film extends Content {

	private int rating;

	public Film(String name, int rating, LocalTime localTime) {
		super();
		this.rating = rating;
		this.name = name;
		this.localTime = localTime;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
