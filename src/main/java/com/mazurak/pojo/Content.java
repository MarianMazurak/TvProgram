package com.mazurak.pojo;

import java.io.Serializable;
import java.time.LocalTime;

import lombok.Data;

@Data
public abstract class Content implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	protected String name;
	protected LocalTime localTime;

	
	
}
