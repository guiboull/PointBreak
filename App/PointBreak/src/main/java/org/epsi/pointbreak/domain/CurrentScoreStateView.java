package org.epsi.pointbreak.domain;

public class CurrentScoreStateView {
	
	private Integer m_t1score;
	private Integer m_t2score;
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
	private Integer m_service;
	
	public CurrentScoreStateView() {
		
	}

	public CurrentScoreStateView(Integer m_t1score, Integer m_t2score, Integer s_s1t1score, Integer s_s1t2score,
			Integer s_s2t1score, Integer s_s2t2score, Integer s_s3t1score, Integer s_s3t2score, Integer s_s4t1score,
			Integer s_s4t2score, Integer s_s5t1score, Integer s_s5t2score, Integer m_service) {
		super();
		this.m_t1score = m_t1score;
		this.m_t2score = m_t2score;
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
		this.m_service = m_service;
	}

	public Integer getM_t1score() {
		return m_t1score;
	}

	public void setM_t1score(Integer m_t1score) {
		this.m_t1score = m_t1score;
	}

	public Integer getM_t2score() {
		return m_t2score;
	}

	public void setM_t2score(Integer m_t2score) {
		this.m_t2score = m_t2score;
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

	public Integer getM_service() {
		return m_service;
	}

	public void setM_service(Integer m_service) {
		this.m_service = m_service;
	}
	
}
