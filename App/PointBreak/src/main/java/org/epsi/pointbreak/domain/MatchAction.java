package org.epsi.pointbreak.domain;

public class MatchAction {
	
	private Integer m_id;
	private Integer t_id;
	private Integer a_id;
	
	public MatchAction() {
	
	}

	public MatchAction(Integer m_id, Integer t_id, Integer a_id) {
		super();
		this.m_id = m_id;
		this.t_id = t_id;
		this.a_id = a_id;
	}

	public Integer getM_id() {
		return m_id;
	}

	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}

	public Integer getT_id() {
		return t_id;
	}

	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}

	public Integer getA_id() {
		return a_id;
	}

	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}

}
