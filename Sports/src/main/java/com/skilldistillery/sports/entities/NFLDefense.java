package com.skilldistillery.sports.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nfl_defense")
public class NFLDefense {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;

	public NFLDefense() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
}
