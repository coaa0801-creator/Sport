package com.skilldistillery.sports.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="nfl_defense")
public class NFLDefense {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="points_scored_by_opp")
	private int totalPointsAllowed;
	@Column(name="yds_by_opp")
	private int totalYardsAllowed;
	@Column(name="opp_number_of_plays")
	private int opponentNumberOfPlays;
	@Column(name="yds_per_opp_play")
	private int yardsAllowedPerPlay;
	private int turnovers;
	@Column(name="fumbles_lost")
	private int fumblesRecovered;
	@Column(name="1st_downs")
	private int firstDownsAllowed;
	@Column(name="pass_comp")
	private int passCompletionsAllowed;
	@Column(name="pass_att")
	private int passAttemptsAllowed;
	@Column(name="passing_yds")
	private int totalPassYardsAllowed;
	@Column(name="passing_tds")
	private int totalPassTdsAllowed;
	@Column(name="ints")
	private int interceptions;
	@Column(name="net_yards_gained_per_pass_att")
	private int netYardsPerPassAttAllowed;
	@Column(name="passing_1st_downs")
	private int passingFirstDownsAllowed;
	@Column(name="rushing_att")
	private int rushingAttemptsAllowed;
	@Column(name="rushing_yds")
	private int totalRushYardsAllowed;
	@Column(name="rushing_tds")
	private int totalRushTdsAllowed;
	@Column(name="rushing_1st_downs")
	private int rushingFirstDownsAllowed;
	@Column(name="rushing_yds_per_att")
	private int rushingYardsPerAttemptAllowed;
	@Column(name="pen")
	private int totalPenaltiesAgainst;
	@Column(name="pen_yds")
	private int totalPenaltyYds;
	@Column(name="pen_1st_downs")
	private int firstDownsByPenaltyAllowed;
	@Column(name="drives")
	private int drivesAgainst;
	@Column(name="percent_of_drives_scoring")
	private int percentDrivesScoredAllowed;
	@Column(name="percent_of_drives_ending_with_turnover")
	private int percentDrivesWithTurnover;
	@Column(name="avg_starting_position")
	private String oppAvgStartPosition;
	@Column(name="avg_time_per_drive")
	private String oppAvgTimePerDrive;
	@Column(name="avg_num_plays_per_drive")
	private int oppAvgNumPlaysPerDrive;
	@Column(name="net_yds_per_drive")
	private int oppNetYardsPerDrive;
	@Column(name="avg_points_per_drive")
	private int oppAvgPointsPerDrive;
	@Column(name="team_name")
	private String teamName;	
	@OneToOne
	@JoinColumn(name = "team_id")
	private Team team;
	
	

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

	public int getTotalPointsAllowed() {
		return totalPointsAllowed;
	}

	public void setTotalPointsAllowed(int totalPointsAllowed) {
		this.totalPointsAllowed = totalPointsAllowed;
	}

	public int getTotalYardsAllowed() {
		return totalYardsAllowed;
	}

	public void setTotalYardsAllowed(int totalYardsAllowed) {
		this.totalYardsAllowed = totalYardsAllowed;
	}

	public int getOpponentNumberOfPlays() {
		return opponentNumberOfPlays;
	}

	public void setOpponentNumberOfPlays(int opponentNumberOfPlays) {
		this.opponentNumberOfPlays = opponentNumberOfPlays;
	}

	public int getYardsAllowedPerPlay() {
		return yardsAllowedPerPlay;
	}

	public void setYardsAllowedPerPlay(int yardsAllowedPerPlay) {
		this.yardsAllowedPerPlay = yardsAllowedPerPlay;
	}

	public int getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(int turnovers) {
		this.turnovers = turnovers;
	}

	public int getFumblesRecovered() {
		return fumblesRecovered;
	}

	public void setFumblesRecovered(int fumblesRecovered) {
		this.fumblesRecovered = fumblesRecovered;
	}

	public int getFirstDownsAllowed() {
		return firstDownsAllowed;
	}

	public void setFirstDownsAllowed(int firstDownsAllowed) {
		this.firstDownsAllowed = firstDownsAllowed;
	}

	public int getPassCompletionsAllowed() {
		return passCompletionsAllowed;
	}

	public void setPassCompletionsAllowed(int passCompletionsAllowed) {
		this.passCompletionsAllowed = passCompletionsAllowed;
	}

	public int getPassAttemptsAllowed() {
		return passAttemptsAllowed;
	}

	public void setPassAttemptsAllowed(int passAttemptsAllowed) {
		this.passAttemptsAllowed = passAttemptsAllowed;
	}

	public int getTotalPassYardsAllowed() {
		return totalPassYardsAllowed;
	}

	public void setTotalPassYardsAllowed(int totalPassYardsAllowed) {
		this.totalPassYardsAllowed = totalPassYardsAllowed;
	}

	public int getTotalPassTdsAllowed() {
		return totalPassTdsAllowed;
	}

	public void setTotalPassTdsAllowed(int totalPassTdsAllowed) {
		this.totalPassTdsAllowed = totalPassTdsAllowed;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public int getNetYardsPerPassAttAllowed() {
		return netYardsPerPassAttAllowed;
	}

	public void setNetYardsPerPassAttAllowed(int netYardsPerPassAttAllowed) {
		this.netYardsPerPassAttAllowed = netYardsPerPassAttAllowed;
	}

	public int getPassingFirstDownsAllowed() {
		return passingFirstDownsAllowed;
	}

	public void setPassingFirstDownsAllowed(int passingFirstDownsAllowed) {
		this.passingFirstDownsAllowed = passingFirstDownsAllowed;
	}

	public int getRushingAttemptsAllowed() {
		return rushingAttemptsAllowed;
	}

	public void setRushingAttemptsAllowed(int rushingAttemptsAllowed) {
		this.rushingAttemptsAllowed = rushingAttemptsAllowed;
	}

	public int getTotalRushYardsAllowed() {
		return totalRushYardsAllowed;
	}

	public void setTotalRushYardsAllowed(int totalRushYardsAllowed) {
		this.totalRushYardsAllowed = totalRushYardsAllowed;
	}

	public int getTotalRushTdsAllowed() {
		return totalRushTdsAllowed;
	}

	public void setTotalRushTdsAllowed(int totalRushTdsAllowed) {
		this.totalRushTdsAllowed = totalRushTdsAllowed;
	}

	public int getRushingFirstDownsAllowed() {
		return rushingFirstDownsAllowed;
	}

	public void setRushingFirstDownsAllowed(int rushingFirstDownsAllowed) {
		this.rushingFirstDownsAllowed = rushingFirstDownsAllowed;
	}

	public int getRushingYardsPerAttemptAllowed() {
		return rushingYardsPerAttemptAllowed;
	}

	public void setRushingYardsPerAttemptAllowed(int rushingYardsPerAttemptAllowed) {
		this.rushingYardsPerAttemptAllowed = rushingYardsPerAttemptAllowed;
	}

	public int getTotalPenaltiesAgainst() {
		return totalPenaltiesAgainst;
	}

	public void setTotalPenaltiesAgainst(int totalPenaltiesAgainst) {
		this.totalPenaltiesAgainst = totalPenaltiesAgainst;
	}

	public int getTotalPenaltyYds() {
		return totalPenaltyYds;
	}

	public void setTotalPenaltyYds(int totalPenaltyYds) {
		this.totalPenaltyYds = totalPenaltyYds;
	}

	public int getFirstDownsByPenaltyAllowed() {
		return firstDownsByPenaltyAllowed;
	}

	public void setFirstDownsByPenaltyAllowed(int firstDownsByPenaltyAllowed) {
		this.firstDownsByPenaltyAllowed = firstDownsByPenaltyAllowed;
	}

	public int getDrivesAgainst() {
		return drivesAgainst;
	}

	public void setDrivesAgainst(int drivesAgainst) {
		this.drivesAgainst = drivesAgainst;
	}

	public int getPercentDrivesScoredAllowed() {
		return percentDrivesScoredAllowed;
	}

	public void setPercentDrivesScoredAllowed(int percentDrivesScoredAllowed) {
		this.percentDrivesScoredAllowed = percentDrivesScoredAllowed;
	}

	public int getPercentDrivesWithTurnover() {
		return percentDrivesWithTurnover;
	}

	public void setPercentDrivesWithTurnover(int percentDrivesWithTurnover) {
		this.percentDrivesWithTurnover = percentDrivesWithTurnover;
	}

	public String getOppAvgStartPosition() {
		return oppAvgStartPosition;
	}

	public void setOppAvgStartPosition(String oppAvgStartPosition) {
		this.oppAvgStartPosition = oppAvgStartPosition;
	}

	public String getOppAvgTimePerDrive() {
		return oppAvgTimePerDrive;
	}

	public void setOppAvgTimePerDrive(String oppAvgTimePerDrive) {
		this.oppAvgTimePerDrive = oppAvgTimePerDrive;
	}

	public int getOppAvgNumPlaysPerDrive() {
		return oppAvgNumPlaysPerDrive;
	}

	public void setOppAvgNumPlaysPerDrive(int oppAvgNumPlaysPerDrive) {
		this.oppAvgNumPlaysPerDrive = oppAvgNumPlaysPerDrive;
	}

	public int getOppNetYardsPerDrive() {
		return oppNetYardsPerDrive;
	}

	public void setOppNetYardsPerDrive(int oppNetYardsPerDrive) {
		this.oppNetYardsPerDrive = oppNetYardsPerDrive;
	}

	public int getOppAvgPointsPerDrive() {
		return oppAvgPointsPerDrive;
	}

	public void setOppAvgPointsPerDrive(int oppAvgPointsPerDrive) {
		this.oppAvgPointsPerDrive = oppAvgPointsPerDrive;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	
	
	
}
