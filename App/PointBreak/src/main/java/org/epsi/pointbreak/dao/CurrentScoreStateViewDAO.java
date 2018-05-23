package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.CurrentScoreStateView;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class CurrentScoreStateViewDAO implements CurrentScoreStateViewDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CurrentScoreStateView findCurrentScoreStateByMatchId(int id) {
		String sql = "SELECT * FROM v_app_score WHERE m_ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		CurrentScoreStateView currentScoreState = (CurrentScoreStateView) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(CurrentScoreStateView.class));
	    return currentScoreState;
	}
	
}
