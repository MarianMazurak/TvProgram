package com.mazurak.pojo;

import java.time.LocalTime;

public abstract class Content {

	protected String name;
	protected LocalTime localTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	@Override
	public String toString() {
		return "Content [name=" + name + ", localTime=" + localTime + "]";
	}


	
}
