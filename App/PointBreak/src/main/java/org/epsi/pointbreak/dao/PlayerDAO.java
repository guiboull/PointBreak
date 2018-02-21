package org.epsi.pointbreak.dao;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.Player;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class PlayerDAO implements PlayerDAOInterface{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Player findById(int id) {
		String sql = "SELECT * FROM PLAYER WHERE ID = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Player player = (Player) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(Player.class));
	    return player;
	}
	
}