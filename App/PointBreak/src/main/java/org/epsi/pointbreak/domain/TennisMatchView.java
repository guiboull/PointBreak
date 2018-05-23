package org.epsi.pointbreak.domain;

import java.sql.Time;
import java.util.Date;


public class TennisMatchView {
	
	private Integer id;
	
	private String tournamentName;
	private String surface;
	private String tournamentGender;
	private String tournamentRound;
	private Date matchDate;
	private Integer matchWinner;
	private String matchType;
	private String playerOneName;
	private String playerTwoName;
	private String playerThreeName;
	private String playerFourName;
	private String playerOneCountry;
	private String playerTwoCountry;
	private String playerThreeCountry;
	private String playerFourCountry;
	private Integer playerOneRank;
	private Integer playerTwoRank;
	private Integer playerThreeRank;
	private Integer playerFourRank;
	private Integer s_s1t1score;
	private Integer s_s1t2score;
	private Integer s_s2t1score;
	private Integer s_s2t2score;
	private Integer s_s3t1score;
	private Integer s_s3t2score;
	private Integer s_s4t1score;
	private Integer s_s4t2score;
	private Integer s_s5t1score;
	private Integer s_s5t2score;
	private String refereeName;
	public TennisMatchView() {
	
	}
	public TennisMatchView(Integer id, String tournamentName, String surface, String tournamentGender,
			String tournamentRound, Date matchDate, Integer matchWinner, String matchType, String playerOneName,
			String playerTwoName, String playerThreeName, String playerFourName, String playerOneCountry,
			String playerTwoCountry, String playerThreeCountry, String playerFourCountry, Integer playerOneRank,
			Integer playerTwoRank, Integer playerThreeRank, Integer playerFourRank, Integer s_s1t1score,
			Integer s_s1t2score, Integer s_s2t1score, Integer s_s2t2score, Integer s_s3t1score, Integer s_s3t2score,
			Integer s_s4t1score, Integer s_s4t2score, Integer s_s5t1score, Integer s_s5t2score, String refereeName) {
		super();
		this.id = id;
		this.tournamentName = tournamentName;
		this.surface = surface;
		this.tournamentGender = tournamentGender;
		this.tournamentRound = tournamentRound;
		this.matchDate = matchDate;
		this.matchWinner = matchWinner;
		this.matchType = matchType;
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
		this.playerThreeName = playerThreeName;
		this.playerFourName = playerFourName;
		this.playerOneCountry = playerOneCountry;
		this.playerTwoCountry = playerTwoCountry;
		this.playerThreeCountry = playerThreeCountry;
		this.playerFourCountry = playerFourCountry;
		this.playerOneRank = playerOneRank;
		this.playerTwoRank = playerTwoRank;
		this.playerThreeRank = playerThreeRank;
		this.playerFourRank = playerFourRank;
		this.s_s1t1score = s_s1t1score;
		this.s_s1t2score = s_s1t2score;
		this.s_s2t1score = s_s2t1score;
		this.s_s2t2score = s_s2t2score;
		this.s_s3t1score = s_s3t1score;
		this.s_s3t2score = s_s3t2score;
		this.s_s4t1score = s_s4t1score;
		this.s_s4t2score = s_s4t2score;
		this.s_s5t1score = s_s5t1score;
		this.s_s5t2score = s_s5t2score;
		this.refereeName = refereeName;
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
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public String getTournamentGender() {
		return tournamentGender;
	}
	public void setTournamentGender(String tournamentGender) {
		this.tournamentGender = tournamentGender;
	}
	public String getTournamentRound() {
		return tournamentRound;
	}
	public void setTournamentRound(String tournamentRound) {
		this.tournamentRound = tournamentRound;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public Integer getMatchWinner() {
		return matchWinner;
	}
	public void setMatchWinner(Integer matchWinner) {
		this.matchWinner = matchWinner;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
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
	public Integer getPlayerOneRank() {
		return playerOneRank;
	}
	public void setPlayerOneRank(Integer playerOneRank) {
		this.playerOneRank = playerOneRank;
	}
	public Integer getPlayerTwoRank() {
		return playerTwoRank;
	}
	public void setPlayerTwoRank(Integer playerTwoRank) {
		this.playerTwoRank = playerTwoRank;
	}
	public Integer getPlayerThreeRank() {
		return playerThreeRank;
	}
	public void setPlayerThreeRank(Integer playerThreeRank) {
		this.playerThreeRank = playerThreeRank;
	}
	public Integer getPlayerFourRank() {
		return playerFourRank;
	}
	public void setPlayerFourRank(Integer playerFourRank) {
		this.playerFourRank = playerFourRank;
	}
	public Integer getS_s1t1score() {
		return s_s1t1score;
	}
	public void setS_s1t1score(Integer s_s1t1score) {
		this.s_s1t1score = s_s1t1score;
	}
	public Integer getS_s1t2score() {
		return s_s1t2score;
	}
	public void setS_s1t2score(Integer s_s1t2score) {
		this.s_s1t2score = s_s1t2score;
	}
	public Integer getS_s2t1score() {
		return s_s2t1score;
	}
	public void setS_s2t1score(Integer s_s2t1score) {
		this.s_s2t1score = s_s2t1score;
	}
	public Integer getS_s2t2score() {
		return s_s2t2score;
	}
	public void setS_s2t2score(Integer s_s2t2score) {
		this.s_s2t2score = s_s2t2score;
	}
	public Integer getS_s3t1score() {
		return s_s3t1score;
	}
	public void setS_s3t1score(Integer s_s3t1score) {
		this.s_s3t1score = s_s3t1score;
	}
	public Integer getS_s3t2score() {
		return s_s3t2score;
	}
	public void setS_s3t2score(Integer s_s3t2score) {
		this.s_s3t2score = s_s3t2score;
	}
	public Integer getS_s4t1score() {
		return s_s4t1score;
	}
	public void setS_s4t1score(Integer s_s4t1score) {
		this.s_s4t1score = s_s4t1score;
	}
	public Integer getS_s4t2score() {
		return s_s4t2score;
	}
	public void setS_s4t2score(Integer s_s4t2score) {
		this.s_s4t2score = s_s4t2score;
	}
	public Integer getS_s5t1score() {
		return s_s5t1score;
	}
	public void setS_s5t1score(Integer s_s5t1score) {
		this.s_s5t1score = s_s5t1score;
	}
	public Integer getS_s5t2score() {
		return s_s5t2score;
	}
	public void setS_s5t2score(Integer s_s5t2score) {
		this.s_s5t2score = s_s5t2score;
	}
	public String getRefereeName() {
		return refereeName;
	}
	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}
}

