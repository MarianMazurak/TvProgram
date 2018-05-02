package com.mazurak.services;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.mazurak.main.Menu;
import com.mazurak.pojo.Content;
import com.mazurak.pojo.Day;
import com.mazurak.pojo.Day.Days;
import com.mazurak.pojo.Film;
import com.mazurak.pojo.TVShow;

import lombok.Data;

@Data
public abstract class ChannelService {

	public abstract void printChannelMenu();

	public Day createDay(Scanner scan) {
		System.out.println("Choose Day");
		String nameOfDay = scan.next();
		System.out.println(
				"Your choise is: " + Days.valueOf(nameOfDay.toUpperCase()) + "\nPlease add Content in this day");
		System.out.println("enter please name of Content,  ratings(or type if t show),hour,minute");
		Day day = new Day();
		day.setDay(Days.valueOf(nameOfDay.toUpperCase()));
		return day;

	}

	public Content addContent(Scanner scan) {

		String name = scan.next();
		int rating = 0;
		String type = null;
		try {
			rating = scan.nextInt();
		} catch (InputMismatchException e) {
			type = scan.next();
		}
		int hour = scan.nextInt();
		int min = scan.nextInt();
		if (type == null) {
			return createContent(name, type, hour, min);
		} else {
			return createContent(name, rating, hour, min);
		}
	}

	public Content createContent(String name, int ratings, int hour, int minute) {
		Film film = new Film(name, ratings, LocalTime.of(hour, minute));
		System.out.println("you added new Film" + film.getName() + " on time " + film.getLocalTime());
		return film;
	}

	public Content createContent(String name, String type, int hour, int minute) {
		TVShow tvShow = new TVShow(name, type, LocalTime.of(hour, minute));
		System.out.println("you added new tvShow  : " + tvShow.getName() + " on time " + tvShow.getLocalTime());
		return tvShow;
	}

	public void printMenu() {
		System.out.println("enter new day press 0 ");
		System.out.println("enter new Channel enter 1");
		System.out.println("enter more content enter 2");
	}

	protected void addCreatedContentToListAndPrintMenu(Scanner scan, Day day) {
		Content content = addContent(scan);
		day.getListContent().add(content);
		printMenu();
	}

	protected void bicycleForMethds(Scanner scan, Day day, boolean isOnGoing, List<Day> days) {
		while (isOnGoing) {
			int res = scan.nextInt();
			if (res == 0) {
				days.add(day);
				day = createDay(scan);
				addCreatedContentToListAndPrintMenu(scan, day);
			} else if (res == 1) {
				Menu.printMainMenu();
			} else if (res == 2) {
				addCreatedContentToListAndPrintMenu(scan, day);
			}
		}

	}

}