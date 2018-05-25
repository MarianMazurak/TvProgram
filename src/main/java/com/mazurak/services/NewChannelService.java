package com.mazurak.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mazurak.pojo.Day;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor()
public class NewChannelService extends ChannelService {
	private List<Day> days = new ArrayList<>();

	public void printChannelMenu() {

		try (Scanner scan = new Scanner(System.in)) {

			Day day = createDay(scan);
			addCreatedContentToListAndPrintMenu(scan, day);
			boolean isOnGoing = true;

			bicycleForMethods(scan, day, isOnGoing,days);
		}

	}


}
