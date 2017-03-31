package com.dbg.dto;



import java.io.Serializable;

public class FilmDTO implements Serializable{

	
	private static final long serialVersionUID = 7226912973564608905L;

	private String title;
	private Integer year;
	public FilmDTO() {
		super();
	}
	
	public FilmDTO(String title, Integer year) {
		super();
		this.title=title;
		this.year=year;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	
	

	
}
