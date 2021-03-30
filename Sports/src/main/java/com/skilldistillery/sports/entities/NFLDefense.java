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

	@Override
	public String toString() {
		return "NFLDefense [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NFLDefense other = (NFLDefense) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
}
