package com.quiz.model;

import java.io.Serializable;
import java.time.LocalTime;

import org.apache.tomcat.jni.Time;

public class ModelDate implements Serializable {

	private static final long serialVersionUID = 1916816501172252708L;
	
	private String time;
	private String timezone;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
}
