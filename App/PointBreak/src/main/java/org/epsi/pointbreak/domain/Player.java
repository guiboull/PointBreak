package org.epsi.pointbreak.domain;

import java.util.Date;


public class Player {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private char hand;
	private Date birthdate;
	private String country;
	
	protected Player() {
	}
	
	public Player(Integer id, String firstName, String lastName, char hand, Date birthdate, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hand = hand;
		this.birthdate = birthdate;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getHand() {
		return hand;
	}

	public void setHand(char hand) {
		this.hand = hand;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
