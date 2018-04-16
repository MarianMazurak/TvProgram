package com.mazurak.services;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.mazurak.pojo.Content;
import com.mazurak.pojo.Day;
import com.mazurak.pojo.Day.Days;
import com.mazurak.pojo.Film;
import com.mazurak.pojo.TVShow;

public abstract class ChannelService {

	private Day day;

	public void printChannelMenu() {

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Choose Day");
			chooseDay(scan.next());
			addContent(scan);
		}

	}

	public Day chooseDay(String nameOfDay) {
		System.out.println(
				"Your choise is: " + Days.valueOf(nameOfDay.toUpperCase()) + "\nPlease add Content in this day");
		System.out.println("enter please name of film,  ratings,hour,minute");
		return new Day();

	}

	public void createContent(String name, Integer ratings, int hour, int minute) {
		Film film = new Film(name, ratings, LocalTime.of(hour, minute));
		addToList(film);
		System.out.println("you add new Film" + film.getName() + " in time " + film.getLocalTime());
	}

	public void createContent(String name, String type, int hour, int minute) {

		TVShow tvShow = new TVShow(name, type, LocalTime.of(hour, minute));
		addToList(tvShow);
		System.out.println("you add new Film" + " in time " + tvShow.getLocalTime());
	}

	private void addToList(Content content) {
		day.getListContent().add(content);
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
			System.out.println("Do you watn exit if yes enter 0 ");
			if (scan.nextInt() == 0) {
				isOnGoing = false;
			}
		}

	}

}