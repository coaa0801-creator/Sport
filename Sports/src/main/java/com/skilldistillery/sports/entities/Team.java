package com.skilldistillery.sports.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	
	@ManyToMany(mappedBy=("teams"))
	private List<NflPlayer> nflPlayers;
	@ManyToMany(mappedBy=("teams"))
	private List<Coach> coaches;
	@ManyToMany(mappedBy=("teams"))
	private List<Staff> staffList;
	@ManyToMany(mappedBy=("teams"))
	private List<Stadium> Stadiums;
	@OneToOne(mappedBy = "team")
	@PrimaryKeyJoinColumn	
	private NFLDefense defense;
	
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
	public Integer getSuperbowl() {
		return superbowl;
	}
	public void setSuperbowl(Integer superbowl) {
		this.superbowl = superbowl;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
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
	public List<NflPlayer> getNflPlayers() {
		return nflPlayers;
	}
	public void setNflPlayers(List<NflPlayer> nflPlayers) {
		this.nflPlayers = nflPlayers;
	}
	public List<Coach> getCoaches() {
		return coaches;
	}
	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}
	public List<Staff> getStaffList() {
		return staffList;
	}
	public void setStaffList(List<Staff> staffList) {
		this.staffList = staffList;
	}
	public List<Stadium> getStadiums() {
		return Stadiums;
	}
	public void setStadiums(List<Stadium> stadiums) {
		Stadiums = stadiums;
	}
	public NFLDefense getDefense() {
		return defense;
	}
	public void setDefense(NFLDefense defense) {
		this.defense = defense;
	}
	
	// CONSTRUCTORS ======================================


	public Team() {
		super();
	}
	
	// ToString =============================

	public Team(int id, String name, String nickname, int win, int loss, int tie, Integer playoffWin,
			Integer playoffLoss, Integer superbowl, Integer year, String league, int teamId, List<NflPlayer> nflPlayers,
			List<Coach> coaches, List<Staff> staffList, List<Stadium> stadiums, NFLDefense defense) {
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
		this.nflPlayers = nflPlayers;
		this.coaches = coaches;
		this.staffList = staffList;
		Stadiums = stadiums;
		this.defense = defense;
	}
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
