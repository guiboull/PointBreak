package org.epsi.pointbreak.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.Player;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class PlayerDAO implements PlayerDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Player findById(int id) {
		String sql = "SELECT * FROM v_player WHERE ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Player player = (Player) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(Player.class));
	    return player;
	}
	
	@Override
	@SuppressWarnings({ "rawtypes" })
	public List<Player> getAllPlayers() {
		String sql = "SELECT * FROM v_player";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Player> playersList = new ArrayList<Player>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row: rows) {
			Player player = new Player();
			player.setP_ID(Integer.parseInt(String.valueOf(row.get("p_ID"))));
			player.setP_FIRSTNAME(String.valueOf(row.get("p_FIRSTNAME")));
			player.setP_LASTNAME(String.valueOf(row.get("p_LASTNAME")));
			player.setP_HAND(String.valueOf(row.get("p_HAND")).charAt(0));
			player.setP_BIRTHDAY((Date) row.get("p_BIRTHDATE"));
			player.setP_COUNTRY(String.valueOf(row.get("p_COUNTRY")));
			player.setRk_RANKING(Integer.parseInt(String.valueOf(row.get("rk_RANKING"))));
			player.setRk_POINTS(Integer.parseInt(String.valueOf(row.get("Rk_POINTS"))));
			playersList.add(player);
		}
		return playersList;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Player> getAllRankedPlayers() {
		String sql = "SELECT * FROM v_player WHERE rk_RANKING != 0 ORDER BY rk_RANKING";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Player> playersList = new ArrayList<Player>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row: rows) {
			Player player = new Player();
			player.setP_ID(Integer.parseInt(String.valueOf(row.get("p_ID"))));
			player.setP_FIRSTNAME(String.valueOf(row.get("p_FIRSTNAME")));
			player.setP_LASTNAME(String.valueOf(row.get("p_LASTNAME")));
			player.setP_HAND(String.valueOf(row.get("p_HAND")).charAt(0));
			player.setP_BIRTHDAY((Date) row.get("p_BIRTHDATE"));
			player.setP_COUNTRY(String.valueOf(row.get("p_COUNTRY")));
			player.setRk_RANKING(Integer.parseInt(String.valueOf(row.get("rk_RANKING"))));
			player.setRk_POINTS(Integer.parseInt(String.valueOf(row.get("Rk_POINTS"))));
			playersList.add(player);
		}
		return playersList;
	}

	@Override
	public List<Player> getTopRankedPlayers() {
		String sql = "SELECT * FROM v_player WHERE rk_RANKING != 0 ORDER BY rk_RANKING LIMIT 10";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Player> playersList = new ArrayList<Player>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row: rows) {
			Player player = new Player();
			player.setP_ID(Integer.parseInt(String.valueOf(row.get("p_ID"))));
			player.setP_FIRSTNAME(String.valueOf(row.get("p_FIRSTNAME")));
			player.setP_LASTNAME(String.valueOf(row.get("p_LASTNAME")));
			player.setP_HAND(String.valueOf(row.get("p_HAND")).charAt(0));
			player.setP_BIRTHDAY((Date) row.get("p_BIRTHDATE"));
			player.setP_COUNTRY(String.valueOf(row.get("p_COUNTRY")));
			player.setRk_RANKING(Integer.parseInt(String.valueOf(row.get("rk_RANKING"))));
			player.setRk_POINTS(Integer.parseInt(String.valueOf(row.get("Rk_POINTS"))));
			playersList.add(player);
		}
		return playersList;
	}
	

	
}