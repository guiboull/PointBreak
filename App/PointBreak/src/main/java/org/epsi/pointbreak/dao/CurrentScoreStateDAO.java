package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.CurrentScoreState;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class CurrentScoreStateDAO implements CurrentScoreStateDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CurrentScoreState findCurrentScoreStateByMatchId(int id) {
		String sql = "SELECT * FROM v_app_score WHERE m_ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		CurrentScoreState currentScoreState = (CurrentScoreState) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(CurrentScoreState.class));
	    return currentScoreState;
	}
	
}
