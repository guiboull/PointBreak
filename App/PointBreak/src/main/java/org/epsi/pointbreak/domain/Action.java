package org.epsi.pointbreak.domain;

public enum Action {
	
	ACE(1, "Ace"),
	LET(2, "Let"),
	FAULT(3, "Fault"),
	POINTWON(4, "Point won"),
	WARNING(50, "Warning"),
	MEDIC(60, "Medic"),
	CHALLENGE(70, "Challenge"),
	FIRSTSERVICE(91, "First service"),
	SECONDSERVICE(92, "Second service"),
	STARTMATCH(96, "Start match"),
	PAUSEMATCH(97, "Pause match"),
	UNPAUSEMATCH(98, "Unpause match"),
	ENDMATCH(99, "End match");
	
	private Integer dbNumber;
	private String actionType;
	
	private Action(Integer dbNumber, String actionType) {
		this.dbNumber = dbNumber;
		this.actionType = actionType;
	}

	public Integer getDbNumber() {
		return dbNumber;
	}

	public String getActionType() {
		return actionType;
	}
	
}
