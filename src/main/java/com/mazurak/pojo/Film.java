package com.mazurak.pojo;

import java.time.LocalTime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Film extends Content {

	private static final long serialVersionUID = 1L;
	private int rating;

	public Film(String name, int rating, LocalTime localTime) {
		super();
		this.rating = rating;
		this.name = name;
		this.localTime = localTime;
	}

}
