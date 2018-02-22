package org.epsi.pointbreak.domain;

import java.sql.Time;

public class TennisGame {
	
	private Integer id;
	
	private Integer setId;
	private Integer matchId;
	private Integer service;
	private Time timeGame;
	private Integer winner;
	private Integer firstTeamNumberOfAces;
	private Integer secondTeamNumberOfAces;
	private Integer firstTeamNumberOfLets;
	private Integer secondTeamNumberOfLets;
	private Integer firstTeamNumberOfFaults;
	private Integer secondTeamNumberOfFaults;
	private Integer firstTeamNumberOfDoubleFaults;
	private Integer secondTeamNumberOfDoubleFaults;
	private Integer firstTeamNumberOfPointScored;
	private Integer secondTeamNumberOfPointScored;
	private Integer firstTeamScore;
	private Integer secondTeamScore;
	private Integer firstTeamNumberOfGameBreak;
	private Integer secondTeamNumberOfGameBreak;
	
	public TennisGame() {
	
	}

	public TennisGame(Integer id, Integer setId, Integer matchId, Integer service, Time timeGame, Integer winner,
			Integer firstTeamNumberOfAces, Integer secondTeamNumberOfAces, Integer firstTeamNumberOfLets,
			Integer secondTeamNumberOfLets, Integer firstTeamNumberOfFaults, Integer secondTeamNumberOfFaults,
			Integer firstTeamNumberOfDoubleFaults, Integer secondTeamNumberOfDoubleFaults,
			Integer firstTeamNumberOfPointScored, Integer secondTeamNumberOfPointScored, Integer firstTeamScore,
			Integer secondTeamScore, Integer firstTeamNumberOfGameBreak, Integer secondTeamNumberOfGameBreak) {
		super();
		this.id = id;
		this.setId = setId;
		this.matchId = matchId;
		this.service = service;
		this.timeGame = timeGame;
		this.winner = winner;
		this.firstTeamNumberOfAces = firstTeamNumberOfAces;
		this.secondTeamNumberOfAces = secondTeamNumberOfAces;
		this.firstTeamNumberOfLets = firstTeamNumberOfLets;
		this.secondTeamNumberOfLets = secondTeamNumberOfLets;
		this.firstTeamNumberOfFaults = firstTeamNumberOfFaults;
		this.secondTeamNumberOfFaults = secondTeamNumberOfFaults;
		this.firstTeamNumberOfDoubleFaults = firstTeamNumberOfDoubleFaults;
		this.secondTeamNumberOfDoubleFaults = secondTeamNumberOfDoubleFaults;
		this.firstTeamNumberOfPointScored = firstTeamNumberOfPointScored;
		this.secondTeamNumberOfPointScored = secondTeamNumberOfPointScored;
		this.firstTeamScore = firstTeamScore;
		this.secondTeamScore = secondTeamScore;
		this.firstTeamNumberOfGameBreak = firstTeamNumberOfGameBreak;
		this.secondTeamNumberOfGameBreak = secondTeamNumberOfGameBreak;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Integer getService() {
		return service;
	}

	public void setService(Integer service) {
		this.service = service;
	}

	public Time getTimeGame() {
		return timeGame;
	}

	public void setTimeGame(Time timeGame) {
		this.timeGame = timeGame;
	}

	public Integer getWinner() {
		return winner;
	}

	public void setWinner(Integer winner) {
		this.winner = winner;
	}

	public Integer getFirstTeamNumberOfAces() {
		return firstTeamNumberOfAces;
	}

	public void setFirstTeamNumberOfAces(Integer firstTeamNumberOfAces) {
		this.firstTeamNumberOfAces = firstTeamNumberOfAces;
	}

	public Integer getSecondTeamNumberOfAces() {
		return secondTeamNumberOfAces;
	}

	public void setSecondTeamNumberOfAces(Integer secondTeamNumberOfAces) {
		this.secondTeamNumberOfAces = secondTeamNumberOfAces;
	}

	public Integer getFirstTeamNumberOfLets() {
		return firstTeamNumberOfLets;
	}

	public void setFirstTeamNumberOfLets(Integer firstTeamNumberOfLets) {
		this.firstTeamNumberOfLets = firstTeamNumberOfLets;
	}

	public Integer getSecondTeamNumberOfLets() {
		return secondTeamNumberOfLets;
	}

	public void setSecondTeamNumberOfLets(Integer secondTeamNumberOfLets) {
		this.secondTeamNumberOfLets = secondTeamNumberOfLets;
	}

	public Integer getFirstTeamNumberOfFaults() {
		return firstTeamNumberOfFaults;
	}

	public void setFirstTeamNumberOfFaults(Integer firstTeamNumberOfFaults) {
		this.firstTeamNumberOfFaults = firstTeamNumberOfFaults;
	}

	public Integer getSecondTeamNumberOfFaults() {
		return secondTeamNumberOfFaults;
	}

	public void setSecondTeamNumberOfFaults(Integer secondTeamNumberOfFaults) {
		this.secondTeamNumberOfFaults = secondTeamNumberOfFaults;
	}

	public Integer getFirstTeamNumberOfDoubleFaults() {
		return firstTeamNumberOfDoubleFaults;
	}

	public void setFirstTeamNumberOfDoubleFaults(Integer firstTeamNumberOfDoubleFaults) {
		this.firstTeamNumberOfDoubleFaults = firstTeamNumberOfDoubleFaults;
	}

	public Integer getSecondTeamNumberOfDoubleFaults() {
		return secondTeamNumberOfDoubleFaults;
	}

	public void setSecondTeamNumberOfDoubleFaults(Integer secondTeamNumberOfDoubleFaults) {
		this.secondTeamNumberOfDoubleFaults = secondTeamNumberOfDoubleFaults;
	}

	public Integer getFirstTeamNumberOfPointScored() {
		return firstTeamNumberOfPointScored;
	}

	public void setFirstTeamNumberOfPointScored(Integer firstTeamNumberOfPointScored) {
		this.firstTeamNumberOfPointScored = firstTeamNumberOfPointScored;
	}

	public Integer getSecondTeamNumberOfPointScored() {
		return secondTeamNumberOfPointScored;
	}

	public void setSecondTeamNumberOfPointScored(Integer secondTeamNumberOfPointScored) {
		this.secondTeamNumberOfPointScored = secondTeamNumberOfPointScored;
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

	public Integer getFirstTeamNumberOfGameBreak() {
		return firstTeamNumberOfGameBreak;
	}

	public void setFirstTeamNumberOfGameBreak(Integer firstTeamNumberOfGameBreak) {
		this.firstTeamNumberOfGameBreak = firstTeamNumberOfGameBreak;
	}

	public Integer getSecondTeamNumberOfGameBreak() {
		return secondTeamNumberOfGameBreak;
	}

	public void setSecondTeamNumberOfGameBreak(Integer secondTeamNumberOfGameBreak) {
		this.secondTeamNumberOfGameBreak = secondTeamNumberOfGameBreak;
	}
	
}
