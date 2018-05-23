package org.epsi.pointbreak.domain;

import java.util.Date;

public class TennisMatchListItem {
	
	private Integer id;

	private String playerOneName;
	private String playerTwoName;
	private String playerThreeName;
	private String playerFourName;
	private String playerOneCountry;
	private String playerTwoCountry;
	private String playerThreeCountry;
	private String playerFourCountry;
	private String dateMatch;
	private Integer bestOf;
	private String roundTournament;
	private String court;
	private String tournamentType;
	
	public TennisMatchListItem() {
	
	}

	public TennisMatchListItem(Integer id, String playerOneName, String playerTwoName, String playerThreeName,
			String playerFourName, String playerOneCountry, String playerTwoCountry, String playerThreeCountry,
			String playerFourCountry, String dateMatch, Integer bestOf, String roundTournament, String court,
			String tournamentType) {
		super();
		this.id = id;
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
		this.playerThreeName = playerThreeName;
		this.playerFourName = playerFourName;
		this.playerOneCountry = playerOneCountry;
		this.playerTwoCountry = playerTwoCountry;
		this.playerThreeCountry = playerThreeCountry;
		this.playerFourCountry = playerFourCountry;
		this.dateMatch = dateMatch;
		this.bestOf = bestOf;
		this.roundTournament = roundTournament;
		this.court = court;
		this.tournamentType = tournamentType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayerOneName() {
		return playerOneName;
	}

	public void setPlayerOneName(String playerOneName) {
		this.playerOneName = playerOneName;
	}

	public String getPlayerTwoName() {
		return playerTwoName;
	}

	public void setPlayerTwoName(String playerTwoName) {
		this.playerTwoName = playerTwoName;
	}

	public String getPlayerThreeName() {
		return playerThreeName;
	}

	public void setPlayerThreeName(String playerThreeName) {
		this.playerThreeName = playerThreeName;
	}

	public String getPlayerFourName() {
		return playerFourName;
	}

	public void setPlayerFourName(String playerFourName) {
		this.playerFourName = playerFourName;
	}

	public String getPlayerOneCountry() {
		return playerOneCountry;
	}

	public void setPlayerOneCountry(String playerOneCountry) {
		this.playerOneCountry = playerOneCountry;
	}

	public String getPlayerTwoCountry() {
		return playerTwoCountry;
	}

	public void setPlayerTwoCountry(String playerTwoCountry) {
		this.playerTwoCountry = playerTwoCountry;
	}

	public String getPlayerThreeCountry() {
		return playerThreeCountry;
	}

	public void setPlayerThreeCountry(String playerThreeCountry) {
		this.playerThreeCountry = playerThreeCountry;
	}

	public String getPlayerFourCountry() {
		return playerFourCountry;
	}

	public void setPlayerFourCountry(String playerFourCountry) {
		this.playerFourCountry = playerFourCountry;
	}

	public String getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(String dateMatch) {
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

	

}
