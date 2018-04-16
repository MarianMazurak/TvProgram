package com.mazurak.pojo;

import java.time.LocalTime;

public class TVShow extends Content {

	private String type;

	public TVShow(String type, String name,LocalTime localTime) {
		this.type = type;
		this.name = name;
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
