package org.epsi.pointbreak.domain;

import java.sql.Time;


public class TennisSet {
	
	private Integer id;
	
	private Integer matchId;
	private Integer firstTeamScore;
	private Integer secondTeamScore;
	private Integer winner;
	private Time timeSet;
	private Integer firstTeamSetPoint;
	private Integer secondTeamSetPoint;
	
	public TennisSet() {
		
	}

	public TennisSet(Integer id, Integer matchId, Integer firstTeamScore, Integer secondTeamScore, Integer winner,
			Time timeSet, Integer firstTeamSetPoint, Integer secondTeamSetPoint) {
		super();
		this.id = id;
		this.matchId = matchId;
		this.firstTeamScore = firstTeamScore;
		this.secondTeamScore = secondTeamScore;
		this.winner = winner;
		this.timeSet = timeSet;
		this.firstTeamSetPoint = firstTeamSetPoint;
		this.secondTeamSetPoint = secondTeamSetPoint;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Integer getFirstTeamScore() {
		return firstTeamScore;
	}

	public void setFirstTeamScore(Integer firstTeamScore) {
		this.firstTeamScore = firstTeamScore;
	}

	public Integer getSecondTeamScore() {
		return secondTeamScore;
	}

	public void setSecondTeamScore(Integer secondTeamScore) {
		this.secondTeamScore = secondTeamScore;
	}

	public Integer getWinner() {
		return winner;
	}

	public void setWinner(Integer winner) {
		this.winner = winner;
	}

	public Time getTimeSet() {
		return timeSet;
	}

	public void setTimeSet(Time timeSet) {
		this.timeSet = timeSet;
	}

	public Integer getFirstTeamSetPoint() {
		return firstTeamSetPoint;
	}

	public void setFirstTeamSetPoint(Integer firstTeamSetPoint) {
		this.firstTeamSetPoint = firstTeamSetPoint;
	}

	public Integer getSecondTeamSetPoint() {
		return secondTeamSetPoint;
	}

	public void setSecondTeamSetPoint(Integer secondTeamSetPoint) {
		this.secondTeamSetPoint = secondTeamSetPoint;
	}
	
}
