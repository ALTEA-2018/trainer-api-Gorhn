package com.miage.altea.tp.trainer.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue
	private int id;
	private int pokedexId; 
	private int level; 

	public Pokemon() { }

	public Pokemon(int pokedexId, int level) {
		this.pokedexId = pokedexId;
		this.level = level;
	}
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public int getPokedexId() { return pokedexId; }
	public void setPokedexId(int pokedexId) { this.pokedexId = pokedexId; }
	public int getLevel() { return level; }
	public void setLevel(int level) { this.level = level; }

}


