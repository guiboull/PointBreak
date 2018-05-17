package org.epsi.pointbreak.domain;

import java.sql.Time;
import java.util.Date;


public class TennisMatch {
	
	private Integer id;

	private Integer tournamentId;
	private Integer playerOneId;
	private Integer playerTwoId;
	private Integer playerThreeId;
	private Integer playerFourId;
	private Integer refereeId;
	private Date dateMatch;
	private Integer bestOf;
	private String roundTournament;
	private String court;
	private String tournamentType;
	private Integer service;
	private Integer winner;
	private Integer firstTeamNumberOfSet;
	private Integer secondTeamNumberOfSet;
	private Integer firstTeamNumberOfWarnings;
	private Integer secondTeamNumberOfWarnings;
	private Integer firstTeamNumberOfChallenges;
	private Integer secondTeamNumberOfChallenges;
	private Time matchDurationTimestamp;
	private Integer currentSet;
	private Integer currentGame;
	private Integer currentFault;
	
	public TennisMatch() {
	
	}

	public TennisMatch(Integer id, Integer tournamentId, Integer playerOneId, Integer playerTwoId,
			Integer playerThreeId, Integer playerFourId, Integer refereeId, Date dateMatch, Integer bestOf,
			String roundTournament, String court, String tournamentType, Integer service, Integer winner,
			Integer firstTeamNumberOfSet, Integer secondTeamNumberOfSet, Integer firstTeamNumberOfWarnings,
			Integer secondTeamNumberOfWarnings, Integer firstTeamNumberOfChallenges,
			Integer secondTeamNumberOfChallenges, Time matchDurationTimestamp, Integer currentSet, Integer currentGame,
			Integer currentFault) {
		super();
		this.id = id;
		this.tournamentId = tournamentId;
		this.playerOneId = playerOneId;
		this.playerTwoId = playerTwoId;
		this.playerThreeId = playerThreeId;
		this.playerFourId = playerFourId;
		this.refereeId = refereeId;
		this.dateMatch = dateMatch;
		this.bestOf = bestOf;
		this.roundTournament = roundTournament;
		this.court = court;
		this.tournamentType = tournamentType;
		this.service = service;
		this.winner = winner;
		this.firstTeamNumberOfSet = firstTeamNumberOfSet;
		this.secondTeamNumberOfSet = secondTeamNumberOfSet;
		this.firstTeamNumberOfWarnings = firstTeamNumberOfWarnings;
		this.secondTeamNumberOfWarnings = secondTeamNumberOfWarnings;
		this.firstTeamNumberOfChallenges = firstTeamNumberOfChallenges;
		this.secondTeamNumberOfChallenges = secondTeamNumberOfChallenges;
		this.matchDurationTimestamp = matchDurationTimestamp;
		this.currentSet = currentSet;
		this.currentGame = currentGame;
		this.currentFault = currentFault;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(Integer tournamentId) {
		this.tournamentId = tournamentId;
	}

	public Integer getPlayerOneId() {
		return playerOneId;
	}

	public void setPlayerOneId(Integer playerOneId) {
		this.playerOneId = playerOneId;
	}

	public Integer getPlayerTwoId() {
		return playerTwoId;
	}

	public void setPlayerTwoId(Integer playerTwoId) {
		this.playerTwoId = playerTwoId;
	}

	public Integer getPlayerThreeId() {
		return playerThreeId;
	}

	public void setPlayerThreeId(Integer playerThreeId) {
		this.playerThreeId = playerThreeId;
	}

	public Integer getPlayerFourId() {
		return playerFourId;
	}

	public void setPlayerFourId(Integer playerFourId) {
		this.playerFourId = playerFourId;
	}

	public Integer getRefereeId() {
		return refereeId;
	}

	public void setRefereeId(Integer refereeId) {
		this.refereeId = refereeId;
	}

	public Date getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(Date dateMatch) {
		this.dateMatch = dateMatch;
	}

	public Integer getBestOf() {
		return bestOf;
	}

	public void setBestOf(Integer bestOf) {
		this.bestOf = bestOf;
	}

	public String getRoundTournament() {
		return roundTournament;
	}

	public void setRoundTournament(String roundTournament) {
		this.roundTournament = roundTournament;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public String getTournamentType() {
		return tournamentType;
	}

	public void setTournamentType(String tournamentType) {
		this.tournamentType = tournamentType;
	}

	public Integer getService() {
		return service;
	}

	public void setService(Integer service) {
		this.service = service;
	}

	public Integer getWinner() {
		return winner;
	}

	public void setWinner(Integer winner) {
		this.winner = winner;
	}

	public Integer getFirstTeamNumberOfSet() {
		return firstTeamNumberOfSet;
	}

	public void setFirstTeamNumberOfSet(Integer firstTeamNumberOfSet) {
		this.firstTeamNumberOfSet = firstTeamNumberOfSet;
	}

	public Integer getSecondTeamNumberOfSet() {
		return secondTeamNumberOfSet;
	}

	public void setSecondTeamNumberOfSet(Integer secondTeamNumberOfSet) {
		this.secondTeamNumberOfSet = secondTeamNumberOfSet;
	}

	public Integer getFirstTeamNumberOfWarnings() {
		return firstTeamNumberOfWarnings;
	}

	public void setFirstTeamNumberOfWarnings(Integer firstTeamNumberOfWarnings) {
		this.firstTeamNumberOfWarnings = firstTeamNumberOfWarnings;
	}

	public Integer getSecondTeamNumberOfWarnings() {
		return secondTeamNumberOfWarnings;
	}

	public void setSecondTeamNumberOfWarnings(Integer secondTeamNumberOfWarnings) {
		this.secondTeamNumberOfWarnings = secondTeamNumberOfWarnings;
	}

	public Integer getFirstTeamNumberOfChallenges() {
		return firstTeamNumberOfChallenges;
	}

	public void setFirstTeamNumberOfChallenges(Integer firstTeamNumberOfChallenges) {
		this.firstTeamNumberOfChallenges = firstTeamNumberOfChallenges;
	}

	public Integer getSecondTeamNumberOfChallenges() {
		return secondTeamNumberOfChallenges;
	}

	public void setSecondTeamNumberOfChallenges(Integer secondTeamNumberOfChallenges) {
		this.secondTeamNumberOfChallenges = secondTeamNumberOfChallenges;
	}

	public Time getMatchDurationTimestamp() {
		return matchDurationTimestamp;
	}

	public void setMatchDurationTimestamp(Time matchDurationTimestamp) {
		this.matchDurationTimestamp = matchDurationTimestamp;
	}

	public Integer getCurrentSet() {
		return currentSet;
	}

	public void setCurrentSet(Integer currentSet) {
		this.currentSet = currentSet;
	}

	public Integer getCurrentGame() {
		return currentGame;
	}

	public void setCurrentGame(Integer currentGame) {
		this.currentGame = currentGame;
	}

	public Integer getCurrentFault() {
		return currentFault;
	}

	public void setCurrentFault(Integer currentFault) {
		this.currentFault = currentFault;
	}

}
