package com.skilldistillery.sports.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nfl_player_season")
public class NflPlayer {

	
	// FIELDS ============================================
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int number;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private int age;
	private String position;
	@Column(name = "games_played")
	private int gamesPlayed;
	@Column(name = "games_started")
	private int gamesStarted;
	@Column(name = "rushing_att")
	private Integer rushingAttempts;
	@Column(name = "rushing_yds")
	private Integer rushingYards;
	@Column(name = "rushing_td")
	private int rushingTouchdowns;
	@Column(name = "longest_rushing_att")
	private Integer longestRushingAttempt;
	@Column(name = "rushing_yards_attempt")
	private Integer rushingYardsPerAttempt;
	@Column(name = "rushing_yards_game")
	private Integer rushingYardsPerGame;
	@Column(name = "rushing_attempts_per_game")
	private Integer rushingAttemptsPerGame;
	@Column(name = "pass_tgt")
	private int passingTargets;
	private int receptions;
	@Column(name = "rec_yards")
	private Integer receptionYards;
	@Column(name = "rec_yds_per_rec")
	private Integer recivingYardsPerReception;
	@Column(name = "rec_td")
	private int recivingTouchdowns;
	@Column(name = "longest_rec")
	private Integer longestReceptions;
	@Column(name = "rec_per_game")
	private int receptionsPerGame;
	@Column(name = "rec_yds_per_game")
	private Integer receptionYardsPerGame;
	@Column(name = "catch_percent")
	private Integer catchingPercentage;
	@Column(name = "yards_per_tgt")
	private Integer yardsPerTarget;
	@Column(name = "rush_rec_touch")
	private int rushingAndRecivingTouches;
	@Column(name = "yards_from_scrimmage")
	private Integer yardsFromScrimmage;
	@Column(name = "rrtd")
	private int rushingAndRecivingTouchdowns;
	@Column(name = "fmb")
	private int fumbles;
	@Column(name = "qb_rec")
	private String qbRecord;
	@Column(name = "comp_pass")
	private int completedPasses;
	@Column(name = "att_pass")
	private int attemptedPasses;
	@Column(name = "pass_comp_percent")
	private Integer passCompletionPercentage;
	@Column(name = "pass_yds")
	private Integer passingYards;
	@Column(name = "pass_td")
	private int passingTouchdowns;
	@Column(name = "pass_td_percent")
	private Integer passingTouchdownPercentage;
	@Column(name = "inter")
	private int passingInterception;
	@Column(name = "int_percent")
	private Integer interceptionPercentage;
	@Column(name = "long_pass")
	private Integer longestPass;
	@Column(name = "yards_per_attempt")
	private Integer yardsPerAttempt;
	@Column(name = "adj_yards_per_attempt")
	private Integer adjustedYardsPerAttempt;
	@Column(name = "yards_per_pass_comp")
	private Integer yardsPerPassCompletion;
	@Column(name = "yards_per_game")
	private Integer passYardsPerGame;
	@Column(name = "qb_rating")
	private Integer quarterbackRating;
	@Column(name = "espn_qbr")
	private Integer espnQuarterbackRating;
	@Column(name = "sacks")
	private int timesSacked;
	@Column(name = "yds_lost_sacks")
	private Integer yardsLostFromSacks;
	@Column(name = "net_yds_per_attempt")
	private Integer netYardsPerPassAttempt;
	@Column(name = "adj_net_yards")
	private Integer adjustedNetYardsPerPassAttempt;
	@Column(name = "sack_percent")
	private Integer percentSacksPerPassAttempt;
	@Column(name = "comebacks")
	private int comebacksLead;	
	@Column(name = "gwd")
	private int gameWinningDrives;	
	@Column(name = "player_id")
	private int playerId;
	
	// Getters AND Setters =============================

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public int getGamesStarted() {
		return gamesStarted;
	}
	public void setGamesStarted(int gamesStarted) {
		this.gamesStarted = gamesStarted;
	}
	public Integer getRushingAttempts() {
		return rushingAttempts;
	}
	public void setRushingAttempts(Integer rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
	}
	public Integer getRushingYards() {
		return rushingYards;
	}
	public void setRushingYards(Integer rushingYards) {
		this.rushingYards = rushingYards;
	}
	public int getRushingTouchdowns() {
		return rushingTouchdowns;
	}
	public void setRushingTouchdowns(int rushingTouchdowns) {
		this.rushingTouchdowns = rushingTouchdowns;
	}
	public Integer getLongestRushingAttempt() {
		return longestRushingAttempt;
	}
	public void setLongestRushingAttempt(Integer longestRushingAttempt) {
		this.longestRushingAttempt = longestRushingAttempt;
	}
	public Integer getRushingYardsPerAttempt() {
		return rushingYardsPerAttempt;
	}
	public void setRushingYardsPerAttempt(Integer rushingYardsPerAttempt) {
		this.rushingYardsPerAttempt = rushingYardsPerAttempt;
	}
	public Integer getRushingYardsPerGame() {
		return rushingYardsPerGame;
	}
	public void setRushingYardsPerGame(Integer rushingYardsPerGame) {
		this.rushingYardsPerGame = rushingYardsPerGame;
	}
	public Integer getRushingAttemptsPerGame() {
		return rushingAttemptsPerGame;
	}
	public void setRushingAttemptsPerGame(Integer rushingAttemptsPerGame) {
		this.rushingAttemptsPerGame = rushingAttemptsPerGame;
	}
	public int getPassingTargets() {
		return passingTargets;
	}
	public void setPassingTargets(int passingTargets) {
		this.passingTargets = passingTargets;
	}
	public int getReceptions() {
		return receptions;
	}
	public void setReceptions(int receptions) {
		this.receptions = receptions;
	}
	public Integer getReceptionYards() {
		return receptionYards;
	}
	public void setReceptionYards(Integer receptionYards) {
		this.receptionYards = receptionYards;
	}
	public Integer getRecivingYardsPerReception() {
		return recivingYardsPerReception;
	}
	public void setRecivingYardsPerReception(Integer recivingYardsPerReception) {
		this.recivingYardsPerReception = recivingYardsPerReception;
	}
	public int getRecivingTouchdowns() {
		return recivingTouchdowns;
	}
	public void setRecivingTouchdowns(int recivingTouchdowns) {
		this.recivingTouchdowns = recivingTouchdowns;
	}
	public Integer getLongestReceptions() {
		return longestReceptions;
	}
	public void setLongestReceptions(Integer longestReceptions) {
		this.longestReceptions = longestReceptions;
	}
	public int getReceptionsPerGame() {
		return receptionsPerGame;
	}
	public void setReceptionsPerGame(int receptionsPerGame) {
		this.receptionsPerGame = receptionsPerGame;
	}
	public Integer getReceptionYardsPerGame() {
		return receptionYardsPerGame;
	}
	public void setReceptionYardsPerGame(Integer receptionYardsPerGame) {
		this.receptionYardsPerGame = receptionYardsPerGame;
	}
	public Integer getCatchingPercentage() {
		return catchingPercentage;
	}
	public void setCatchingPercentage(Integer catchingPercentage) {
		this.catchingPercentage = catchingPercentage;
	}
	public Integer getYardsPerTarget() {
		return yardsPerTarget;
	}
	public void setYardsPerTarget(Integer yardsPerTarget) {
		this.yardsPerTarget = yardsPerTarget;
	}
	public int getRushingAndRecivingTouches() {
		return rushingAndRecivingTouches;
	}
	public void setRushingAndRecivingTouches(int rushingAndRecivingTouches) {
		this.rushingAndRecivingTouches = rushingAndRecivingTouches;
	}
	public Integer getYardsFromScrimmage() {
		return yardsFromScrimmage;
	}
	public void setYardsFromScrimmage(Integer yardsFromScrimmage) {
		this.yardsFromScrimmage = yardsFromScrimmage;
	}
	public int getRushingAndRecivingTouchdowns() {
		return rushingAndRecivingTouchdowns;
	}
	public void setRushingAndRecivingTouchdowns(int rushingAndRecivingTouchdowns) {
		this.rushingAndRecivingTouchdowns = rushingAndRecivingTouchdowns;
	}
	public int getFumbles() {
		return fumbles;
	}
	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}
	public String getQbRecord() {
		return qbRecord;
	}
	public void setQbRecord(String qbRecord) {
		this.qbRecord = qbRecord;
	}
	public int getCompletedPasses() {
		return completedPasses;
	}
	public void setCompletedPasses(int completedPasses) {
		this.completedPasses = completedPasses;
	}
	public int getAttemptedPasses() {
		return attemptedPasses;
	}
	public void setAttemptedPasses(int attemptedPasses) {
		this.attemptedPasses = attemptedPasses;
	}
	public Integer getPassCompletionPercentage() {
		return passCompletionPercentage;
	}
	public void setPassCompletionPercentage(Integer passCompletionPercentage) {
		this.passCompletionPercentage = passCompletionPercentage;
	}
	public Integer getPassingYards() {
		return passingYards;
	}
	public void setPassingYards(Integer passingYards) {
		this.passingYards = passingYards;
	}
	public int getPassingTouchdowns() {
		return passingTouchdowns;
	}
	public void setPassingTouchdowns(int passingTouchdowns) {
		this.passingTouchdowns = passingTouchdowns;
	}
	public Integer getPassingTouchdownPercentage() {
		return passingTouchdownPercentage;
	}
	public void setPassingTouchdownPercentage(Integer passingTouchdownPercentage) {
		this.passingTouchdownPercentage = passingTouchdownPercentage;
	}
	public int getPassingInterception() {
		return passingInterception;
	}
	public void setPassingInterception(int passingInterception) {
		this.passingInterception = passingInterception;
	}
	public Integer getInterceptionPercentage() {
		return interceptionPercentage;
	}
	public void setInterceptionPercentage(Integer interceptionPercentage) {
		this.interceptionPercentage = interceptionPercentage;
	}
	public Integer getLongestPass() {
		return longestPass;
	}
	public void setLongestPass(Integer longestPass) {
		this.longestPass = longestPass;
	}
	public Integer getYardsPerAttempt() {
		return yardsPerAttempt;
	}
	public void setYardsPerAttempt(Integer yardsPerAttempt) {
		this.yardsPerAttempt = yardsPerAttempt;
	}
	public Integer getAdjustedYardsPerAttempt() {
		return adjustedYardsPerAttempt;
	}
	public void setAdjustedYardsPerAttempt(Integer adjustedYardsPerAttempt) {
		this.adjustedYardsPerAttempt = adjustedYardsPerAttempt;
	}
	public Integer getYardsPerPassCompletion() {
		return yardsPerPassCompletion;
	}
	public void setYardsPerPassCompletion(Integer yardsPerPassCompletion) {
		this.yardsPerPassCompletion = yardsPerPassCompletion;
	}
	public Integer getPassYardsPerGame() {
		return passYardsPerGame;
	}
	public void setPassYardsPerGame(Integer passYardsPerGame) {
		this.passYardsPerGame = passYardsPerGame;
	}
	public Integer getQuarterbackRating() {
		return quarterbackRating;
	}
	public void setQuarterbackRating(Integer quarterbackRating) {
		this.quarterbackRating = quarterbackRating;
	}
	public Integer getEspnQuarterbackRating() {
		return espnQuarterbackRating;
	}
	public void setEspnQuarterbackRating(Integer espnQuarterbackRating) {
		this.espnQuarterbackRating = espnQuarterbackRating;
	}
	public int getTimesSacked() {
		return timesSacked;
	}
	public void setTimesSacked(int timesSacked) {
		this.timesSacked = timesSacked;
	}
	public Integer getYardsLostFromSacks() {
		return yardsLostFromSacks;
	}
	public void setYardsLostFromSacks(Integer yardsLostFromSacks) {
		this.yardsLostFromSacks = yardsLostFromSacks;
	}
	public Integer getNetYardsPerPassAttempt() {
		return netYardsPerPassAttempt;
	}
	public void setNetYardsPerPassAttempt(Integer netYardsPerPassAttempt) {
		this.netYardsPerPassAttempt = netYardsPerPassAttempt;
	}
	public Integer getAdjustedNetYardsPerPassAttempt() {
		return adjustedNetYardsPerPassAttempt;
	}
	public void setAdjustedNetYardsPerPassAttempt(Integer adjustedNetYardsPerPassAttempt) {
		this.adjustedNetYardsPerPassAttempt = adjustedNetYardsPerPassAttempt;
	}
	public Integer getPercentSacksPerPassAttempt() {
		return percentSacksPerPassAttempt;
	}
	public void setPercentSacksPerPassAttempt(Integer percentSacksPerPassAttempt) {
		this.percentSacksPerPassAttempt = percentSacksPerPassAttempt;
	}
	public int getComebacksLead() {
		return comebacksLead;
	}
	public void setComebacksLead(int comebacksLead) {
		this.comebacksLead = comebacksLead;
	}
	public int getGameWinningDrives() {
		return gameWinningDrives;
	}
	public void setGameWinningDrives(int gameWinningDrives) {
		this.gameWinningDrives = gameWinningDrives;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	// CONSTRUCTORS ======================================

	public NflPlayer() {
		super();
	}
	
	public NflPlayer(int id, int number, String firstName, String lastName, int age, String position, int gamesPlayed,
			int gamesStarted, Integer rushingAttempts, Integer rushingYards, int rushingTouchdowns,
			Integer longestRushingAttempt, Integer rushingYardsPerAttempt, Integer rushingYardsPerGame,
			Integer rushingAttemptsPerGame, int passingTargets, int receptions, Integer receptionYards,
			Integer recivingYardsPerReception, int recivingTouchdowns, Integer longestReceptions, int receptionsPerGame,
			Integer receptionYardsPerGame, Integer catchingPercentage, Integer yardsPerTarget,
			int rushingAndRecivingTouches, Integer yardsFromScrimmage, int rushingAndRecivingTouchdowns, int fumbles,
			String qbRecord, int completedPasses, int attemptedPasses, Integer passCompletionPercentage,
			Integer passingYards, int passingTouchdowns,
			Integer passingTouchdownPercentage, int passingInterception, Integer interceptionPercentage,
			Integer longestPass, Integer yardsPerAttempt, Integer adjustedYardsPerAttempt,
			Integer yardsPerPassCompletion, Integer passYardsPerGame, Integer quarterbackRating,
			Integer espnQuarterbackRating, int timesSacked, Integer yardsLostFromSacks, Integer netYardsPerPassAttempt,
			Integer adjustedNetYardsPerPassAttempt, Integer percentSacksPerPassAttempt, int comebacksLead,
			int gameWinningDrives, int playerId) {
		super();
		this.id = id;
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.position = position;
		this.gamesPlayed = gamesPlayed;
		this.gamesStarted = gamesStarted;
		this.rushingAttempts = rushingAttempts;
		this.rushingYards = rushingYards;
		this.rushingTouchdowns = rushingTouchdowns;
		this.longestRushingAttempt = longestRushingAttempt;
		this.rushingYardsPerAttempt = rushingYardsPerAttempt;
		this.rushingYardsPerGame = rushingYardsPerGame;
		this.rushingAttemptsPerGame = rushingAttemptsPerGame;
		this.passingTargets = passingTargets;
		this.receptions = receptions;
		this.receptionYards = receptionYards;
		this.recivingYardsPerReception = recivingYardsPerReception;
		this.recivingTouchdowns = recivingTouchdowns;
		this.longestReceptions = longestReceptions;
		this.receptionsPerGame = receptionsPerGame;
		this.receptionYardsPerGame = receptionYardsPerGame;
		this.catchingPercentage = catchingPercentage;
		this.yardsPerTarget = yardsPerTarget;
		this.rushingAndRecivingTouches = rushingAndRecivingTouches;
		this.yardsFromScrimmage = yardsFromScrimmage;
		this.rushingAndRecivingTouchdowns = rushingAndRecivingTouchdowns;
		this.fumbles = fumbles;
		this.qbRecord = qbRecord;
		this.completedPasses = completedPasses;
		this.attemptedPasses = attemptedPasses;
		this.passCompletionPercentage = passCompletionPercentage;
		this.passingYards = passingYards;
		this.passingTouchdowns = passingTouchdowns;
		this.passingTouchdownPercentage = passingTouchdownPercentage;
		this.passingInterception = passingInterception;
		this.interceptionPercentage = interceptionPercentage;
		this.longestPass = longestPass;
		this.yardsPerAttempt = yardsPerAttempt;
		this.adjustedYardsPerAttempt = adjustedYardsPerAttempt;
		this.yardsPerPassCompletion = yardsPerPassCompletion;
		this.passYardsPerGame = passYardsPerGame;
		this.quarterbackRating = quarterbackRating;
		this.espnQuarterbackRating = espnQuarterbackRating;
		this.timesSacked = timesSacked;
		this.yardsLostFromSacks = yardsLostFromSacks;
		this.netYardsPerPassAttempt = netYardsPerPassAttempt;
		this.adjustedNetYardsPerPassAttempt = adjustedNetYardsPerPassAttempt;
		this.percentSacksPerPassAttempt = percentSacksPerPassAttempt;
		this.comebacksLead = comebacksLead;
		this.gameWinningDrives = gameWinningDrives;
		this.playerId = playerId;
	}
	
	// ToString =============================

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NflPlayer [id=").append(id).append("]");
		return builder.toString();
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
		NflPlayer other = (NflPlayer) obj;
		if (id != other.id)
			return false;
		return true;
	}	
	
}
