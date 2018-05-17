package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.CurrentMatchInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class CurrentMatchInfoDAO implements CurrentMatchInfoDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CurrentMatchInfo findCurrentMatchInfoByMatchId(int id) {
		String sql = "SELECT * FROM v_app_match WHERE m_ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		CurrentMatchInfo currentMatchInfo = (CurrentMatchInfo) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(CurrentMatchInfo.class));
	    return currentMatchInfo;
	}

}
