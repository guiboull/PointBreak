package org.epsi.pointbreak.domain;

import java.util.Date;

public class MatchAction {
	
	private Integer id;
	private Date matchDate;
	private Integer setId;
	private Integer gameId;
	private Action actionType;
	private Integer tournamentId;
	
	public MatchAction() {
	
	}

	public MatchAction(Integer id, Date matchDate, Integer setId, Integer gameId, Action actionType,
			Integer tournamentId) {
		super();
		this.id = id;
		this.matchDate = matchDate;
		this.setId = setId;
		this.gameId = gameId;
		this.actionType = actionType;
		this.tournamentId = tournamentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}

	public Integer getGameId() {
		return gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public Action getActionType() {
		return actionType;
	}

	public void setActionType(Action actionType) {
		this.actionType = actionType;
	}

	public Integer getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(Integer tournamentId) {
		this.tournamentId = tournamentId;
	}
	
}
