package com.mazurak.services;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mazurak.pojo.Day;
import com.mazurak.pojo.Day.Days;
import com.mazurak.pojo.Film;
import com.mazurak.pojo.TVShow;

public class NewChannelService extends ChannelService {

	private Day day;

	public NewChannelService() {
		this.day = new Day(); // if coment will excption java.lang.NullPointerException

	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

}
