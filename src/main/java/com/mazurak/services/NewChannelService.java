package com.mazurak.services;

import java.util.ArrayList;
import java.util.List;

import com.mazurak.pojo.Day;

public class NewChannelService extends ChannelService {

	private List<Day> days;

	public NewChannelService() {
		this.days = new ArrayList<>();

	}

	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}

	

}
