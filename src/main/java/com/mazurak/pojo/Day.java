package com.mazurak.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Day implements Serializable {

	private static final long serialVersionUID = 1L;

	public static enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	private Days day;

	private List<Content> listContent;

	public Day() {
		this.listContent = new ArrayList<Content>();

	}

}
