package org.epsi.pointbreak.domain;

public class MatchFullStatsView {
	
	private Integer m_ID;
	private Integer t1_SERVICES;
	private Integer t2_SERVICES;
	private Integer t1_SERVICESWON;
	private Integer t2_SERVICESWON;
	private Integer t1_SERVICESWONRATE;
	private Integer t2_SERVICESWONRATE;
	private Integer t1_POINTSWONRETURN;
	private Integer t2_POINTSWONRETURN;
	private Integer t1_POINTSWON;
	private Integer t2_POINTSWON;
	private Integer t1_POINTSWONRATE;
	private Integer t2_POINTSWONRATE;
	private Integer t1_GAMEBREAK;
	private Integer t2_GAMEBREAK;
	private Integer t1_BREAKWON;
	private Integer t2_BREAKWON;
	private Integer t1_BREAKWONRATE;
	private Integer t2_BREAKWONRATE;
	private Integer t1_BREAKSAVED;
	private Integer t2_BREAKSAVED;
	private Integer t1_BREAKSAVEDRATE;
	private Integer t2_BREAKSAVEDRATE;
	private Integer t1_SETPOINT;
	private Integer t2_SETPOINT;
	private Integer t1_WARNING;
	private Integer t2_WARNING;
	private Integer t1_CHALLENGE;
	private Integer t2_CHALLENGE;
	
	public MatchFullStatsView() {
	}
	
	public MatchFullStatsView(Integer m_ID, Integer t1_SERVICES, Integer t2_SERVICES, Integer t1_SERVICESWON,
			Integer t2_SERVICESWON, Integer t1_SERVICESWONRATE, Integer t2_SERVICESWONRATE, Integer t1_POINTSWONRETURN,
			Integer t2_POINTSWONRETURN, Integer t1_POINTSWON, Integer t2_POINTSWON, Integer t1_POINTSWONRATE,
			Integer t2_POINTSWONRATE, Integer t1_GAMEBREAK, Integer t2_GAMEBREAK, Integer t1_BREAKWON,
			Integer t2_BREAKWON, Integer t1_BREAKWONRATE, Integer t2_BREAKWONRATE, Integer t1_BREAKSAVED,
			Integer t2_BREAKSAVED, Integer t1_BREAKSAVEDRATE, Integer t2_BREAKSAVEDRATE, Integer t1_SETPOINT,
			Integer t2_SETPOINT, Integer t1_WARNING, Integer t2_WARNING, Integer t1_CHALLENGE, Integer t2_CHALLENGE) {
		super();
		this.m_ID = m_ID;
		this.t1_SERVICES = t1_SERVICES;
		this.t2_SERVICES = t2_SERVICES;
		this.t1_SERVICESWON = t1_SERVICESWON;
		this.t2_SERVICESWON = t2_SERVICESWON;
		this.t1_SERVICESWONRATE = t1_SERVICESWONRATE;
		this.t2_SERVICESWONRATE = t2_SERVICESWONRATE;
		this.t1_POINTSWONRETURN = t1_POINTSWONRETURN;
		this.t2_POINTSWONRETURN = t2_POINTSWONRETURN;
		this.t1_POINTSWON = t1_POINTSWON;
		this.t2_POINTSWON = t2_POINTSWON;
		this.t1_POINTSWONRATE = t1_POINTSWONRATE;
		this.t2_POINTSWONRATE = t2_POINTSWONRATE;
		this.t1_GAMEBREAK = t1_GAMEBREAK;
		this.t2_GAMEBREAK = t2_GAMEBREAK;
		this.t1_BREAKWON = t1_BREAKWON;
		this.t2_BREAKWON = t2_BREAKWON;
		this.t1_BREAKWONRATE = t1_BREAKWONRATE;
		this.t2_BREAKWONRATE = t2_BREAKWONRATE;
		this.t1_BREAKSAVED = t1_BREAKSAVED;
		this.t2_BREAKSAVED = t2_BREAKSAVED;
		this.t1_BREAKSAVEDRATE = t1_BREAKSAVEDRATE;
		this.t2_BREAKSAVEDRATE = t2_BREAKSAVEDRATE;
		this.t1_SETPOINT = t1_SETPOINT;
		this.t2_SETPOINT = t2_SETPOINT;
		this.t1_WARNING = t1_WARNING;
		this.t2_WARNING = t2_WARNING;
		this.t1_CHALLENGE = t1_CHALLENGE;
		this.t2_CHALLENGE = t2_CHALLENGE;
	}
	
	public Integer getM_ID() {
		return m_ID;
	}
	public void setM_ID(Integer m_ID) {
		this.m_ID = m_ID;
	}
	public Integer getT1_SERVICES() {
		return t1_SERVICES;
	}
	public void setT1_SERVICES(Integer t1_SERVICES) {
		this.t1_SERVICES = t1_SERVICES;
	}
	public Integer getT2_SERVICES() {
		return t2_SERVICES;
	}
	public void setT2_SERVICES(Integer t2_SERVICES) {
		this.t2_SERVICES = t2_SERVICES;
	}
	public Integer getT1_SERVICESWON() {
		return t1_SERVICESWON;
	}
	public void setT1_SERVICESWON(Integer t1_SERVICESWON) {
		this.t1_SERVICESWON = t1_SERVICESWON;
	}
	public Integer getT2_SERVICESWON() {
		return t2_SERVICESWON;
	}
	public void setT2_SERVICESWON(Integer t2_SERVICESWON) {
		this.t2_SERVICESWON = t2_SERVICESWON;
	}
	public Integer getT1_SERVICESWONRATE() {
		return t1_SERVICESWONRATE;
	}
	public void setT1_SERVICESWONRATE(Integer t1_SERVICESWONRATE) {
		this.t1_SERVICESWONRATE = t1_SERVICESWONRATE;
	}
	public Integer getT2_SERVICESWONRATE() {
		return t2_SERVICESWONRATE;
	}
	public void setT2_SERVICESWONRATE(Integer t2_SERVICESWONRATE) {
		this.t2_SERVICESWONRATE = t2_SERVICESWONRATE;
	}
	public Integer getT1_POINTSWONRETURN() {
		return t1_POINTSWONRETURN;
	}
	public void setT1_POINTSWONRETURN(Integer t1_POINTSWONRETURN) {
		this.t1_POINTSWONRETURN = t1_POINTSWONRETURN;
	}
	public Integer getT2_POINTSWONRETURN() {
		return t2_POINTSWONRETURN;
	}
	public void setT2_POINTSWONRETURN(Integer t2_POINTSWONRETURN) {
		this.t2_POINTSWONRETURN = t2_POINTSWONRETURN;
	}
	public Integer getT1_POINTSWON() {
		return t1_POINTSWON;
	}
	public void setT1_POINTSWON(Integer t1_POINTSWON) {
		this.t1_POINTSWON = t1_POINTSWON;
	}
	public Integer getT2_POINTSWON() {
		return t2_POINTSWON;
	}
	public void setT2_POINTSWON(Integer t2_POINTSWON) {
		this.t2_POINTSWON = t2_POINTSWON;
	}
	public Integer getT1_POINTSWONRATE() {
		return t1_POINTSWONRATE;
	}
	public void setT1_POINTSWONRATE(Integer t1_POINTSWONRATE) {
		this.t1_POINTSWONRATE = t1_POINTSWONRATE;
	}
	public Integer getT2_POINTSWONRATE() {
		return t2_POINTSWONRATE;
	}
	public void setT2_POINTSWONRATE(Integer t2_POINTSWONRATE) {
		this.t2_POINTSWONRATE = t2_POINTSWONRATE;
	}
	public Integer getT1_GAMEBREAK() {
		return t1_GAMEBREAK;
	}
	public void setT1_GAMEBREAK(Integer t1_GAMEBREAK) {
		this.t1_GAMEBREAK = t1_GAMEBREAK;
	}
	public Integer getT2_GAMEBREAK() {
		return t2_GAMEBREAK;
	}
	public void setT2_GAMEBREAK(Integer t2_GAMEBREAK) {
		this.t2_GAMEBREAK = t2_GAMEBREAK;
	}
	public Integer getT1_BREAKWON() {
		return t1_BREAKWON;
	}
	public void setT1_BREAKWON(Integer t1_BREAKWON) {
		this.t1_BREAKWON = t1_BREAKWON;
	}
	public Integer getT2_BREAKWON() {
		return t2_BREAKWON;
	}
	public void setT2_BREAKWON(Integer t2_BREAKWON) {
		this.t2_BREAKWON = t2_BREAKWON;
	}
	public Integer getT1_BREAKWONRATE() {
		return t1_BREAKWONRATE;
	}
	public void setT1_BREAKWONRATE(Integer t1_BREAKWONRATE) {
		this.t1_BREAKWONRATE = t1_BREAKWONRATE;
	}
	public Integer getT2_BREAKWONRATE() {
		return t2_BREAKWONRATE;
	}
	public void setT2_BREAKWONRATE(Integer t2_BREAKWONRATE) {
		this.t2_BREAKWONRATE = t2_BREAKWONRATE;
	}
	public Integer getT1_BREAKSAVED() {
		return t1_BREAKSAVED;
	}
	public void setT1_BREAKSAVED(Integer t1_BREAKSAVED) {
		this.t1_BREAKSAVED = t1_BREAKSAVED;
	}
	public Integer getT2_BREAKSAVED() {
		return t2_BREAKSAVED;
	}
	public void setT2_BREAKSAVED(Integer t2_BREAKSAVED) {
		this.t2_BREAKSAVED = t2_BREAKSAVED;
	}
	public Integer getT1_BREAKSAVEDRATE() {
		return t1_BREAKSAVEDRATE;
	}
	public void setT1_BREAKSAVEDRATE(Integer t1_BREAKSAVEDRATE) {
		this.t1_BREAKSAVEDRATE = t1_BREAKSAVEDRATE;
	}
	public Integer getT2_BREAKSAVEDRATE() {
		return t2_BREAKSAVEDRATE;
	}
	public void setT2_BREAKSAVEDRATE(Integer t2_BREAKSAVEDRATE) {
		this.t2_BREAKSAVEDRATE = t2_BREAKSAVEDRATE;
	}
	public Integer getT1_SETPOINT() {
		return t1_SETPOINT;
	}
	public void setT1_SETPOINT(Integer t1_SETPOINT) {
		this.t1_SETPOINT = t1_SETPOINT;
	}
	public Integer getT2_SETPOINT() {
		return t2_SETPOINT;
	}
	public void setT2_SETPOINT(Integer t2_SETPOINT) {
		this.t2_SETPOINT = t2_SETPOINT;
	}
	public Integer getT1_WARNING() {
		return t1_WARNING;
	}
	public void setT1_WARNING(Integer t1_WARNING) {
		this.t1_WARNING = t1_WARNING;
	}
	public Integer getT2_WARNING() {
		return t2_WARNING;
	}
	public void setT2_WARNING(Integer t2_WARNING) {
		this.t2_WARNING = t2_WARNING;
	}
	public Integer getT1_CHALLENGE() {
		return t1_CHALLENGE;
	}
	public void setT1_CHALLENGE(Integer t1_CHALLENGE) {
		this.t1_CHALLENGE = t1_CHALLENGE;
	}
	public Integer getT2_CHALLENGE() {
		return t2_CHALLENGE;
	}
	public void setT2_CHALLENGE(Integer t2_CHALLENGE) {
		this.t2_CHALLENGE = t2_CHALLENGE;
	}
	
}
