package com.mazurak.main;

import java.util.Scanner;

import com.mazurak.services.ChannelService;
import com.mazurak.services.ICTVChannelService;
import com.mazurak.services.InterChannelService;
import com.mazurak.services.NewChannelService;

public class Menu {

	public static void main(String[] args) {
		// List<Content> c = new ArrayList<>();
		// Film film = new Film("film", 24 ,LocalTime.of(12, 45));
		// c.add(film);
		// System.out.println(c);
		printMenu();
	}

	public static void printMenu() {
		try (Scanner scan = new Scanner(System.in)) {

			System.out.println(" Enter \n 1 : New Channel \n 2 : ICTV \n 3 : Inter Channel ");
			int res = scan.nextInt();
			returnService(res);
			ChannelService channelService = returnService(res);
			channelService.printChannelMenu();

		}
	}

	public static ChannelService returnService(int i) {

		switch (i) {
		case 1: {
			return new NewChannelService();
		}
		case 2: {
			return new ICTVChannelService();
		}
		case 3: {
			return new InterChannelService();
		}
		default:
			System.out.println("Incorect");
			break;
		}
		return null;

	}
}
