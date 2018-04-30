package com.mazurak.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mazurak.main.Menu;
import com.mazurak.pojo.Content;
import com.mazurak.pojo.Day;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor()
public class NewChannelService extends ChannelService {

	private List<Day> days  = new ArrayList<>();

	public void printChannelMenu() {

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Choose Day");
			Day day = createDay(scan.next());
			Content content = addContent(scan);
			day.getListContent().add(content);
			printMenu();
			boolean isOnGoing = true;
			int res = scan.nextInt();
			while (isOnGoing) {

				if (res == 0) {
					days.add(day);
					day = createDay(scan.next());
					content = addContent(scan);
					day.getListContent().add(content);
					printMenu();
				} else if (res == 1) {
					Menu.printMainMenu();
				} else if (res == 2) {
					content = addContent(scan);
					day.getListContent().add(content);
					printMenu();
				}
			}
		}

	}

}
