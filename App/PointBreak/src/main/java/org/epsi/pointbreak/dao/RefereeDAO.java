package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.Referee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class RefereeDAO implements RefereeDAOInterface{
private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Referee findByLogin(String login) {
		String sql = "SELECT * FROM referee WHERE LOGIN = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Referee referee = (Referee) jdbcTemplate.queryForObject(sql, new Object[] { login }, new BeanPropertyRowMapper(Referee.class));
	    return referee;
	}
}
