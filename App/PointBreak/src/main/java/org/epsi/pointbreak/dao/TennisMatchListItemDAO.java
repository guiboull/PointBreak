package org.epsi.pointbreak.dao;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.TennisMatchListItem;
import org.springframework.jdbc.core.JdbcTemplate;

public class TennisMatchListItemDAO implements TennisMatchListItemDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "rawtypes" })
	public List<TennisMatchListItem> getAllMatches() {
		String sql = "SELECT * FROM tennismatch";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<TennisMatchListItem> matchesList = new ArrayList<TennisMatchListItem>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row: rows) {
			TennisMatchListItem tennisMatch = new TennisMatchListItem();
			tennisMatch.setId(Integer.parseInt(String.valueOf(row.get("m_ID"))));
			tennisMatch.setPlayerOneName(String.valueOf(row.get("p_P1NAME")));
			tennisMatch.setPlayerTwoName(String.valueOf(row.get("p_P2NAME")));
			tennisMatch.setPlayerThreeName(String.valueOf(row.get("p_P3NAME")));
			tennisMatch.setPlayerFourName(String.valueOf(row.get("p_P4NAME")));
			tennisMatch.setPlayerOneCountry(String.valueOf(row.get("p_P1COUNTRY")));
			tennisMatch.setPlayerTwoCountry(String.valueOf(row.get("p_P2COUNTRY")));
			tennisMatch.setPlayerThreeCountry(String.valueOf(row.get("p_P3COUNTRY")));
			tennisMatch.setPlayerFourCountry(String.valueOf(row.get("p_P4COUNTRY")));
			tennisMatch.setDateMatch(String.valueOf(row.get("m_DATE")));
			tennisMatch.setBestOf(Integer.parseInt(String.valueOf(row.get("m_BO"))));
			tennisMatch.setRoundTournament(String.valueOf(row.get("m_ROUNDTOURNAMENT")));
			tennisMatch.setCourt(String.valueOf(row.get("m_COURT")));
			tennisMatch.setTournamentType(String.valueOf(row.get("m_TOURNAMENTTYPE")));
			matchesList.add(tennisMatch);
		}
		return matchesList;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<TennisMatchListItem> getMatchByRefereeIdAndByTournamentId(Integer refereeId, Integer tournamentId) {
		String sql = "SELECT * FROM v_app_match_list WHERE r_ID = ? AND t_ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<TennisMatchListItem> matchesList = new ArrayList<TennisMatchListItem>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, refereeId, tournamentId);
		for (Map row: rows) {
			TennisMatchListItem tennisMatch = new TennisMatchListItem();
			tennisMatch.setId(Integer.parseInt(String.valueOf(row.get("m_ID"))));
			tennisMatch.setPlayerOneName(String.valueOf(row.get("p_P1NAME")));
			tennisMatch.setPlayerTwoName(String.valueOf(row.get("p_P2NAME")));
			tennisMatch.setPlayerThreeName(String.valueOf(row.get("p_P3NAME")));
			tennisMatch.setPlayerFourName(String.valueOf(row.get("p_P4NAME")));
			tennisMatch.setPlayerOneCountry(String.valueOf(row.get("p_P1COUNTRY")));
			tennisMatch.setPlayerTwoCountry(String.valueOf(row.get("p_P2COUNTRY")));
			tennisMatch.setPlayerThreeCountry(String.valueOf(row.get("p_P3COUNTRY")));
			tennisMatch.setPlayerFourCountry(String.valueOf(row.get("p_P4COUNTRY")));
			tennisMatch.setDateMatch(String.valueOf(row.get("m_DATE")));
			tennisMatch.setBestOf(Integer.parseInt(String.valueOf(row.get("m_BO"))));
			tennisMatch.setRoundTournament(String.valueOf(row.get("m_ROUNDTOURNAMENT")));
			tennisMatch.setCourt(String.valueOf(row.get("m_COURT")));
			tennisMatch.setTournamentType(String.valueOf(row.get("m_TOURNAMENTTYPE")));
			matchesList.add(tennisMatch);
		}
		return matchesList;
	}
	
}
