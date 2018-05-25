package com.mazurak.pojo;

import java.time.LocalTime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TVShow extends Content {

	private static final long serialVersionUID = 1L;

	private String type;

	public TVShow(String name, String type, LocalTime localTime) {
		this.name = name;
		this.type = type;
		this.localTime = localTime;
	}

}
