package com.dbg.model.evaluation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dbg.model.film.Film;
import com.dbg.model.user.User;

@Entity
@Table(name="evaluation")
public class Evaluation implements Serializable{

	private static final long serialVersionUID = 4061191158351890911L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable=false)
	private Integer points;

	@OneToOne
	private Film film;
	
	@OneToOne
	private User user;
	
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Evaluation() {
		super();
	}
	
	public Evaluation(Integer id, Integer points,Film film,User user) {
		super();
		this.id=id;
		this.points=points;
		this.film=film;
		this.user=user;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
}
