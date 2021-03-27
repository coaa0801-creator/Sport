package com.skilldistillery.sports.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coach_season")
public class Coach {
	
	// FIELDS ============================================
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String position;
	private int win;
	private int loss;
	private int tie;
	@Column(name = "playoff_win")
	private Integer playoffWin;
	@Column(name = "playoff_loss")
	private Integer playoffLoss;
	@Column(name = "coach_id")
	private int coachId;
	
	// Getters AND Setters =============================

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public int getTie() {
		return tie;
	}
	public void setTie(int tie) {
		this.tie = tie;
	}
	public Integer getPlayoffWin() {
		return playoffWin;
	}
	public void setPlayoffWin(Integer playoffWin) {
		this.playoffWin = playoffWin;
	}
	public Integer getPlayoffLoss() {
		return playoffLoss;
	}
	public void setPlayoffLoss(Integer playoffLoss) {
		this.playoffLoss = playoffLoss;
	}
	public int getCoachId() {
		return coachId;
	}
	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}
	
	// CONSTRUCTORS ======================================

	public Coach() {
		super();
	}
	public Coach(int id, String firstName, String lastName, String position, int win, int loss, int tie,
			Integer playoffWin, Integer playoffLoss, int coachId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.win = win;
		this.loss = loss;
		this.tie = tie;
		this.playoffWin = playoffWin;
		this.playoffLoss = playoffLoss;
		this.coachId = coachId;
	}
	
	// ToString =============================

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coach [id=").append(id).append("]");
		return builder.toString();
	}
	
	// Hashcode AND Equals =============================

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
		Coach other = (Coach) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
