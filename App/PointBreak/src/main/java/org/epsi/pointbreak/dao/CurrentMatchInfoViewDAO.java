package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.CurrentMatchInfoView;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class CurrentMatchInfoViewDAO implements CurrentMatchInfoViewDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CurrentMatchInfoView findCurrentMatchInfoByMatchId(int id) {
		String sql = "SELECT * FROM v_app_match WHERE m_ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		CurrentMatchInfoView currentMatchInfo = (CurrentMatchInfoView) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(CurrentMatchInfoView.class));
	    return currentMatchInfo;
	}

}
