package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	// Necessário instanciar para garantir que o objeto será iniciado.
	private ScorePK id = new ScorePK();
	
	private Double value;
	
	public Score() {
		
	}

	// Método para associar um filme a um score
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	// Método para associar um usuário a um score
	public void setUSer(User user) {
		id.setUser(user);
	}
	
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
