package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.SetStatsView;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SetStatsViewDAO implements SetStatsViewDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public SetStatsView getSetStats(int matchId, int setId) {
		String sql = "SELECT * FROM v_set_stats WHERE m_ID = ? AND s_ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		SetStatsView setStats = (SetStatsView) jdbcTemplate.queryForObject(sql, new Object[] { matchId, setId }, new BeanPropertyRowMapper(SetStatsView.class));
	    return setStats;
	}
}
