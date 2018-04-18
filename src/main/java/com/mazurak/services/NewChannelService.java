package com.mazurak.services;

import com.mazurak.pojo.Day;

public class NewChannelService extends ChannelService {

	private Day day;

	public NewChannelService() {
		this.day = day; // new Day(); // if coment will excption java.lang.NullPointerException

	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

}
