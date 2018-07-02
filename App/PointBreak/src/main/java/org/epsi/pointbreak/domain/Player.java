package org.epsi.pointbreak.domain;

import java.util.Date;


public class Player {
	
	private Integer p_ID;
	private String p_FIRSTNAME;
	private String p_LASTNAME;
	private Character p_HAND;
	private Date p_BIRTHDAY;
	private String p_COUNTRY;
	private Integer rk_RANKING;
	private Integer rk_POINTS;
	
	public Player() {
	}

	public Player(Integer p_ID, String p_FIRSTNAME, String p_LASTNAME, Character p_HAND, Date p_BIRTHDAY,
			String p_COUNTRY, Integer rk_RANKING, Integer rk_POINTS) {
		super();
		this.p_ID = p_ID;
		this.p_FIRSTNAME = p_FIRSTNAME;
		this.p_LASTNAME = p_LASTNAME;
		this.p_HAND = p_HAND;
		this.p_BIRTHDAY = p_BIRTHDAY;
		this.p_COUNTRY = p_COUNTRY;
		this.rk_RANKING = rk_RANKING;
		this.rk_POINTS = rk_POINTS;
	}

	public Integer getP_ID() {
		return p_ID;
	}

	public void setP_ID(Integer p_ID) {
		this.p_ID = p_ID;
	}

	public String getP_FIRSTNAME() {
		return p_FIRSTNAME;
	}

	public void setP_FIRSTNAME(String p_FIRSTNAME) {
		this.p_FIRSTNAME = p_FIRSTNAME;
	}

	public String getP_LASTNAME() {
		return p_LASTNAME;
	}

	public void setP_LASTNAME(String p_LASTNAME) {
		this.p_LASTNAME = p_LASTNAME;
	}

	public Character getP_HAND() {
		return p_HAND;
	}

	public void setP_HAND(Character p_HAND) {
		this.p_HAND = p_HAND;
	}

	public Date getP_BIRTHDAY() {
		return p_BIRTHDAY;
	}

	public void setP_BIRTHDAY(Date p_BIRTHDAY) {
		this.p_BIRTHDAY = p_BIRTHDAY;
	}

	public String getP_COUNTRY() {
		return p_COUNTRY;
	}

	public void setP_COUNTRY(String p_COUNTRY) {
		this.p_COUNTRY = p_COUNTRY;
	}

	public Integer getRk_RANKING() {
		return rk_RANKING;
	}

	public void setRk_RANKING(Integer rk_RANKING) {
		this.rk_RANKING = rk_RANKING;
	}

	public Integer getRk_POINTS() {
		return rk_POINTS;
	}

	public void setRk_POINTS(Integer rk_POINTS) {
		this.rk_POINTS = rk_POINTS;
	}
}
