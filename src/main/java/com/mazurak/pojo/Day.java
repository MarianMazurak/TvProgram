package com.mazurak.pojo;

import java.util.ArrayList;
import java.util.List;

public class Day {

	public static enum Days {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}

	private Days day;
	private List<Film> films;
	private List<TVShow> tvShows;

	public Day() {
		this.films = new ArrayList<Film>();
		this.tvShows = new ArrayList<TVShow>();
	}

	public Days getDay() {
		return day;
	}

	public void setDay(Days day) {
		this.day = day;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public List<TVShow> getTvShows() {
		return tvShows;
	}

	public void setTvShows(List<TVShow> tvShows) {
		this.tvShows = tvShows;
	}

}
