package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class MatchActionDAO implements MatchActionDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insertMatchAction(int matchId, int actionId, int teamId) {
		String sql = "INSERT INTO matchaction(m_id, a_id, t_id) VALUES(?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, matchId, actionId, teamId);
	}
	
	

}
