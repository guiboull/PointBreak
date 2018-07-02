package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.MatchFullStatsView;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MatchFullStatsViewDAO implements MatchFullStatsViewDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MatchFullStatsView findMatchStatsById(int id) {
		String sql = "SELECT * FROM v_match_stats WHERE m_ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		MatchFullStatsView matchFullStatsView = (MatchFullStatsView) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(MatchFullStatsView.class));
	    return matchFullStatsView;
	}

}
