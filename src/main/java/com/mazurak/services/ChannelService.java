package com.mazurak.services;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.mazurak.main.Menu;
import com.mazurak.pojo.Content;
import com.mazurak.pojo.Day;
import com.mazurak.pojo.Day.Days;
import com.mazurak.pojo.Film;
import com.mazurak.pojo.TVShow;

public abstract class ChannelService {

	private Day day; // if coment will excption java.lang.NullPointerException

	public void printChannelMenu() {

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Choose Day");
			day = createDay(scan.next());
			addContent(scan);
		}

	}

	public Day createDay(String nameOfDay) {
		System.out.println(
				"Your choise is: " + Days.valueOf(nameOfDay.toUpperCase()) + "\nPlease add Content in this day");
		System.out.println("enter please name of Content,  ratings(or type if t show),hour,minute");
		Day day = new Day();
		day.setDay(Days.valueOf(nameOfDay.toUpperCase()));
		return day;

	}

	private void addContent(Scanner scan) {

		boolean isOnGoing = true;
		while (isOnGoing) {
			String name = scan.next();
			try {
				createContent(name, scan.nextInt(), scan.nextInt(), scan.nextInt());
			} catch (InputMismatchException e) {
				createContent(name, scan.next(), scan.nextInt(), scan.nextInt());
			}
//			System.out.println("Do you want to  exit if yes enter 0 " + day.getListContent().toString());
			System.out.println("If you want to enter new day press 0 else Enter new content");
			System.out.println("If you want to enter new Channel enter 1");
			int res = scan.nextInt();
			if (res == 0) {
				isOnGoing = false;
				printChannelMenu();
//				createDay(scan.next());
			} else if (res == 1) {
				isOnGoing = false;
				Menu.printMenu();
			}
			
//			else if () {
//				System.out.println("enter please name of Content,  ratings(or type if t show),hour,minute");
//			}
		}

	}

	public void createContent(String name, int ratings, int hour, int minute) {
		Film film = new Film(name, ratings, LocalTime.of(hour, minute));
		addToList(film);
		System.out.println("you add new Film" + film.getName() + " in time " + film.getLocalTime());
	}

	public void createContent(String name, String type, int hour, int minute) {

		TVShow tvShow = new TVShow(name, type, LocalTime.of(hour, minute));
		addToList(tvShow);
		System.out.println("you add new tvShow  : " + tvShow.getName() + " in time " + tvShow.getLocalTime());
	}

	private void addToList(Content content) {
		day.getListContent().add(content);
	}

}