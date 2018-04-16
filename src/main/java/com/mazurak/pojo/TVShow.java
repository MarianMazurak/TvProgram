package com.mazurak.pojo;

import java.time.LocalTime;

public class TVShow extends Content {

	private String type;

	public TVShow(String name, String type, LocalTime localTime) {
		this.name = name;
		this.type = type;
		this.localTime = localTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TVShow [type=" + type + "]";
	}

}
