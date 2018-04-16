package com.mazurak.services;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mazurak.pojo.Day;
import com.mazurak.pojo.Day.Days;
import com.mazurak.pojo.Film;
import com.mazurak.pojo.TVShow;

public class NewChannelService implements ChannelService {

	private Day day;
	// private List<Film> listOfFilms;
	// private List<TVShow> listTVShow;
	// private LocalTime localTime;
	// private Scanner scan = new Scanner(System.in);

	public NewChannelService() {
		this.day = new Day(); // if coment will excption java.lang.NullPointerException
		// this.listOfFilms = new ArrayList<Film>();
		// this.listTVShow = new ArrayList<TVShow>();
	}

	public void printChannelMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose Day");
		chooseDay(scan.nextLine());
		createNewFilm(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextInt());
	}

	public Day chooseDay(String nameOfDay) {
		System.out.println(
				"Your choise is: " + Days.valueOf(nameOfDay.toUpperCase()) + "\nPlease add Content in this day");
		System.out.println("enter please name of film,  ratings,hour,minute");
		return new Day();

	}

	public void createNewFilm(String name, int ratings, int hour, int minute) {

		Film film = new Film(name, ratings, LocalTime.of(hour, minute));
		day.getFilms().add(film);
		System.out.println("you add new Film" + film.getName() + " in time " + film.getLocalTime());
	}

	// public List<Film> getListOfFilms() {
	// return listOfFilms;
	// }
	//
	// public void setListOfFilms(List<Film> listOfFilms) {
	// this.listOfFilms = listOfFilms;
	// }
	//
	// public List<TVShow> getListTVShow() {
	// return listTVShow;
	// }
	//
	// public void setListTVShow(List<TVShow> listTVShow) {
	// this.listTVShow = listTVShow;
	// }

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

}
