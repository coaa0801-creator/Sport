package com.skilldistillery.sports.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	
	// FIELDS ============================================
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String nickname;
	private int win;
	private int loss;
	private int tie;
	@Column(name = "playoff_win")
	private Integer playoffWin;
	@Column(name = "playoff_loss")
	private Integer playoffLoss;
	private Integer superbowl;
	private Integer year;
	private String league;
	@Column(name = "team_id")
	private int teamId;

	// Getters AND Setters =============================
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	public int getPlayoffWin() {
		return playoffWin;
	}
	public void setPlayoffWin(int playoffWin) {
		this.playoffWin = playoffWin;
	}
	public int getPlayoffLoss() {
		return playoffLoss;
	}
	public void setPlayoffLoss(int playoffLoss) {
		this.playoffLoss = playoffLoss;
	}
	public int getSuperbowl() {
		return superbowl;
	}
	public void setSuperbowl(int superbowl) {
		this.superbowl = superbowl;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	// CONSTRUCTORS ======================================

	public Team(int id, String name, String nickname, int win, int loss, int tie, int playoffWin, int playoffLoss,
			int superbowl, int year, String league, int teamId) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.win = win;
		this.loss = loss;
		this.tie = tie;
		this.playoffWin = playoffWin;
		this.playoffLoss = playoffLoss;
		this.superbowl = superbowl;
		this.year = year;
		this.league = league;
		this.teamId = teamId;
	}
	public Team() {
		super();
	}
	
	// ToString =============================

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	// Hashcode AND Equals =============================

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + "]";
	}


}
