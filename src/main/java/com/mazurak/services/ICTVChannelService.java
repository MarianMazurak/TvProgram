package com.mazurak.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mazurak.pojo.Day;

public class ICTVChannelService extends ChannelService {

	private List<Day> days = new ArrayList<>();

	public void printChannelMenu() {

		try (Scanner scan = new Scanner(System.in)) {

			Day day = createDay(scan);
			addCreatedContentToListAndPrintMenu(scan, day);
			boolean isOnGoing = true;

			bicycleForMethods(scan, day, isOnGoing, days);
		}

	}

}
