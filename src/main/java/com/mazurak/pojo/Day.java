package com.mazurak.pojo;

import java.util.ArrayList;
import java.util.List;

public class Day {

	public static enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	private Days day;

	private List<Content> listContent;

	public Day() {
	this.listContent = new ArrayList<Content>();

	}

	public List<Content> getListContent() {
		return listContent;
	}

	public void setListContent(List<Content> listContent) {
		this.listContent = listContent;
	}

	public Days getDay() {
		return day;
	}

	public void setDay(Days day) {
		this.day = day;
	}

}
