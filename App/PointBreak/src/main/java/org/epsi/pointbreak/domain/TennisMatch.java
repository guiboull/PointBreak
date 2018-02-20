package org.epsi.pointbreak.domain;

import java.sql.Time;
import java.util.Date;


public class TennisMatch {
	
	private Long id;
	
	private Long tournamentId;
	private Long playerOneId;
	private Long playerTwoId;
	private Long playerThreeId;
	private Long playerFourId;
	private Long refereeId;
	private Date dateMatch;
	private Integer bestOf;
	private String roundTournament;
	private String court;
	private String tournamentType;
	private Character service;
	private String firstTeamNumberOfSet;
	private String secondTeamNumberOfSet;
	private Integer firstTeamNumberOfWarnings;
	private Integer secondTeamNumberOfWarnings;
	private Integer firstTeamNumberOfChallenges;
	private Integer secondTeamNumberOfChallenges;
	private Time matchDurationTimestamp;
	private Integer currentSet;
	private Integer currentMatch;
	private Integer currentFault;
	
	protected TennisMatch() {
	
	}

	public TennisMatch(Long id, Long tournamentId, Long playerOneId, Long playerTwoId, Long playerThreeId,
			Long playerFourId, Long refereeId, Date dateMatch, Integer bestOf, String roundTournament, String court,
			String tournamentType, Character service, String firstTeamNumberOfSet, String secondTeamNumberOfSet,
			Integer firstTeamNumberOfWarnings, Integer secondTeamNumberOfWarnings, Integer firstTeamNumberOfChallenges,
			Integer secondTeamNumberOfChallenges, Time matchDurationTimestamp, Integer currentSet, Integer currentMatch,
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
		this.firstTeamNumberOfSet = firstTeamNumberOfSet;
		this.secondTeamNumberOfSet = secondTeamNumberOfSet;
		this.firstTeamNumberOfWarnings = firstTeamNumberOfWarnings;
		this.secondTeamNumberOfWarnings = secondTeamNumberOfWarnings;
		this.firstTeamNumberOfChallenges = firstTeamNumberOfChallenges;
		this.secondTeamNumberOfChallenges = secondTeamNumberOfChallenges;
		this.matchDurationTimestamp = matchDurationTimestamp;
		this.currentSet = currentSet;
		this.currentMatch = currentMatch;
		this.currentFault = currentFault;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(Long tournamentId) {
		this.tournamentId = tournamentId;
	}

	public Long getPlayerOneId() {
		return playerOneId;
	}

	public void setPlayerOneId(Long playerOneId) {
		this.playerOneId = playerOneId;
	}

	public Long getPlayerTwoId() {
		return playerTwoId;
	}

	public void setPlayerTwoId(Long playerTwoId) {
		this.playerTwoId = playerTwoId;
	}

	public Long getPlayerThreeId() {
		return playerThreeId;
	}

	public void setPlayerThreeId(Long playerThreeId) {
		this.playerThreeId = playerThreeId;
	}

	public Long getPlayerFourId() {
		return playerFourId;
	}

	public void setPlayerFourId(Long playerFourId) {
		this.playerFourId = playerFourId;
	}

	public Long getRefereeId() {
		return refereeId;
	}

	public void setRefereeId(Long refereeId) {
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

	public Character getService() {
		return service;
	}

	public void setService(Character service) {
		this.service = service;
	}

	public String getFirstTeamNumberOfSet() {
		return firstTeamNumberOfSet;
	}

	public void setFirstTeamNumberOfSet(String firstTeamNumberOfSet) {
		this.firstTeamNumberOfSet = firstTeamNumberOfSet;
	}

	public String getSecondTeamNumberOfSet() {
		return secondTeamNumberOfSet;
	}

	public void setSecondTeamNumberOfSet(String secondTeamNumberOfSet) {
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

	public Integer getCurrentMatch() {
		return currentMatch;
	}

	public void setCurrentMatch(Integer currentMatch) {
		this.currentMatch = currentMatch;
	}

	public Integer getCurrentFault() {
		return currentFault;
	}

	public void setCurrentFault(Integer currentFault) {
		this.currentFault = currentFault;
	}
	
	
}
