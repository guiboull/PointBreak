package org.epsi.pointbreak.domain;

public class CurrentMatchInfo {
	
	private String p_p1name;
	private String p_p1country;
	private String p_p2name;
	private String p_p2country;
	private String p_p3name;
	private String p_p3country;
	private String p_p4name;
	private String p_p4country;
	private String t_surface;
	
	public CurrentMatchInfo() {
		
	}

	public CurrentMatchInfo(String p_p1name, String p_p1country, String p_p2name, String p_p2country, String p_p3name,
			String p_p3country, String p_p4name, String p_p4country, String t_surface) {
		super();
		this.p_p1name = p_p1name;
		this.p_p1country = p_p1country;
		this.p_p2name = p_p2name;
		this.p_p2country = p_p2country;
		this.p_p3name = p_p3name;
		this.p_p3country = p_p3country;
		this.p_p4name = p_p4name;
		this.p_p4country = p_p4country;
		this.t_surface = t_surface;
	}

	public String getP_p1name() {
		return p_p1name;
	}

	public void setP_p1name(String p_p1name) {
		this.p_p1name = p_p1name;
	}

	public String getP_p1country() {
		return p_p1country;
	}

	public void setP_p1country(String p_p1country) {
		this.p_p1country = p_p1country;
	}

	public String getP_p2name() {
		return p_p2name;
	}

	public void setP_p2name(String p_p2name) {
		this.p_p2name = p_p2name;
	}

	public String getP_p2country() {
		return p_p2country;
	}

	public void setP_p2country(String p_p2country) {
		this.p_p2country = p_p2country;
	}

	public String getP_p3name() {
		return p_p3name;
	}

	public void setP_p3name(String p_p3name) {
		this.p_p3name = p_p3name;
	}

	public String getP_p3country() {
		return p_p3country;
	}

	public void setP_p3country(String p_p3country) {
		this.p_p3country = p_p3country;
	}

	public String getP_p4name() {
		return p_p4name;
	}

	public void setP_p4name(String p_p4name) {
		this.p_p4name = p_p4name;
	}

	public String getP_p4country() {
		return p_p4country;
	}

	public void setP_p4country(String p_p4country) {
		this.p_p4country = p_p4country;
	}

	public String getT_surface() {
		return t_surface;
	}

	public void setT_surface(String t_surface) {
		this.t_surface = t_surface;
	}
}
