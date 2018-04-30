package com.mazurak.services;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.mazurak.pojo.Content;
import com.mazurak.pojo.Day;
import com.mazurak.pojo.Day.Days;
import com.mazurak.pojo.Film;
import com.mazurak.pojo.TVShow;

import lombok.Data;

@Data
public abstract class ChannelService {

	public abstract void printChannelMenu();

	public Day createDay(String nameOfDay) {
		System.out.println(
				"Your choise is: " + Days.valueOf(nameOfDay.toUpperCase()) + "\nPlease add Content in this day");
		System.out.println("enter please name of Content,  ratings(or type if t show),hour,minute");
		Day day = new Day();
		day.setDay(Days.valueOf(nameOfDay.toUpperCase()));
		return day;

	}

	public Content addContent(Scanner scan) {

		Content content = null;
		//String name = scan.next();
		try {
			content = createContent(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		} catch (InputMismatchException e) {
			content = createContent(scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
		}
		return content;

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

	protected void printMenu() {
		System.out.println("enter new day press 0 ");
		System.out.println("enter new Channel enter 1");
		System.out.println("enter more content enter 2");
	}
}