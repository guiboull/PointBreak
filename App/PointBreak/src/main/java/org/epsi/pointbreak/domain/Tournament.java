package org.epsi.pointbreak.domain;

import java.util.Date;

public class Tournament {
	
	private Integer id;
	private String tournamentName;
	private String surfaceType;
	private Character gender;
	private Integer numberOfPlayersInvolved;
	private Date tournamentStartingDate;
	private Date tournamentEndingDate;
	
	public Tournament() {
	
	}

	public Tournament(Integer id, String tournamentName, String surfaceType, Character gender,
			Integer numberOfPlayersInvolved, Date tournamentStartingDate, Date tournamentEndingDate) {
		super();
		this.id = id;
		this.tournamentName = tournamentName;
		this.surfaceType = surfaceType;
		this.gender = gender;
		this.numberOfPlayersInvolved = numberOfPlayersInvolved;
		this.tournamentStartingDate = tournamentStartingDate;
		this.tournamentEndingDate = tournamentEndingDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getSurfaceType() {
		return surfaceType;
	}

	public void setSurfaceType(String surfaceType) {
		this.surfaceType = surfaceType;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Integer getNumberOfPlayersInvolved() {
		return numberOfPlayersInvolved;
	}

	public void setNumberOfPlayersInvolved(Integer numberOfPlayersInvolved) {
		this.numberOfPlayersInvolved = numberOfPlayersInvolved;
	}

	public Date getTournamentStartingDate() {
		return tournamentStartingDate;
	}

	public void setTournamentStartingDate(Date tournamentStartingDate) {
		this.tournamentStartingDate = tournamentStartingDate;
	}

	public Date getTournamentEndingDate() {
		return tournamentEndingDate;
	}

	public void setTournamentEndingDate(Date tournamentEndingDate) {
		this.tournamentEndingDate = tournamentEndingDate;
	}
	
	
}
