package com.dbg.dto;

import java.io.Serializable;

public class EvaluationDTO implements Serializable{

	private static final long serialVersionUID = 1149549932293817343L;

	private Integer points;
	
	private String name;
	
	private String title;

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
