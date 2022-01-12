package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ScorePK implements Serializable{
	
	private static final long serialVersionUID = 1L;

	// A chave composta exige a implementação do Serializable
	// Configurando a chave estrangeira
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	// Configurando a chave estrangeira
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public ScorePK() {

	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
