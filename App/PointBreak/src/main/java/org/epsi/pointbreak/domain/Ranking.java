package org.epsi.pointbreak.domain;

import java.util.Date;


public class Ranking {
	
	private Integer id;
	
	private Integer rankingNumber;
	private Integer rankingPoints;
	private Date rankingDate;
	
	protected Ranking() {
		
	}

	public Ranking(Integer id, Integer rankingNumber, Integer rankingPoints, Date rankingDate) {
		super();
		this.id = id;
		this.rankingNumber = rankingNumber;
		this.rankingPoints = rankingPoints;
		this.rankingDate = rankingDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRankingNumber() {
		return rankingNumber;
	}

	public void setRankingNumber(Integer rankingNumber) {
		this.rankingNumber = rankingNumber;
	}

	public Integer getRankingPoints() {
		return rankingPoints;
	}

	public void setRankingPoints(Integer rankingPoints) {
		this.rankingPoints = rankingPoints;
	}

	public Date getRankingDate() {
		return rankingDate;
	}

	public void setRankingDate(Date rankingDate) {
		this.rankingDate = rankingDate;
	}	

}
