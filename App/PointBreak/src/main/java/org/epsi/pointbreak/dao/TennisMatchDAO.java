package org.epsi.pointbreak.dao;



import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.TennisMatch;
import org.springframework.jdbc.core.JdbcTemplate;

public class TennisMatchDAO implements TennisMatchDAOInterface{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<TennisMatch> getAllMatches() {
		String sql = "SELECT * FROM TENNISMATCH";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<TennisMatch> matchesList = new ArrayList<TennisMatch>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row: rows) {
			TennisMatch tennisMatch = new TennisMatch();
			tennisMatch.setId(Integer.parseInt(String.valueOf(row.get("ID"))));
			tennisMatch.setTournamentId(Integer.parseInt(String.valueOf(row.get("t_ID"))));
			tennisMatch.setPlayerOneId(Integer.parseInt(String.valueOf(row.get("p1_ID"))));
			if (row.get("p2_ID") == null) {
				tennisMatch.setPlayerTwoId(null);
			} else {
				tennisMatch.setPlayerTwoId(Integer.parseInt(String.valueOf(row.get("p2_ID"))));
			}
			tennisMatch.setPlayerThreeId(Integer.parseInt(String.valueOf(row.get("p3_ID"))));
			if (row.get("p4_ID") == null) {
				tennisMatch.setPlayerFourId(null);
			} else {
				tennisMatch.setPlayerFourId(Integer.parseInt(String.valueOf(row.get("p4_ID"))));
			}
			tennisMatch.setRefereeId(Integer.parseInt(String.valueOf(row.get("r_ID"))));
			try {
				tennisMatch.setDateMatch(new SimpleDateFormat("yyyyMMdd").parse(String.valueOf(row.get("DATEMATCH"))));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			tennisMatch.setBestOf(Integer.parseInt(String.valueOf(row.get("BO"))));
			tennisMatch.setRoundTournament(String.valueOf(row.get("ROUNDTOURNAMENT")));
			tennisMatch.setCourt(String.valueOf(row.get("COURT")));
			tennisMatch.setTournamentType(String.valueOf(row.get("TOURNAMENTTYPE")));
			tennisMatch.setService(Integer.parseInt(String.valueOf(row.get("SERVICE"))));
			tennisMatch.setWinner(Integer.parseInt(String.valueOf(row.get("WINNER"))));
			tennisMatch.setFirstTeamNumberOfSet(String.valueOf(row.get("t1_SCORE")));
			tennisMatch.setSecondTeamNumberOfSet(String.valueOf(row.get("t2_SCORE")));
			tennisMatch.setFirstTeamNumberOfWarnings(Integer.parseInt(String.valueOf(row.get("t1_WARNING"))));
			tennisMatch.setSecondTeamNumberOfWarnings(Integer.parseInt(String.valueOf(row.get("t2_WARNING"))));
			tennisMatch.setFirstTeamNumberOfChallenges(Integer.parseInt(String.valueOf(row.get("t1_CHALLENGE"))));
			tennisMatch.setSecondTeamNumberOfChallenges(Integer.parseInt(String.valueOf(row.get("t1_CHALLENGE"))));
			if (row.get("TIMEMATCH") == null) {
				tennisMatch.setMatchDurationTimestamp(null);
			} else {
				tennisMatch.setMatchDurationTimestamp(Time.valueOf(String.valueOf(row.get("TIMEMATCH"))));
			}
			tennisMatch.setCurrentSet(Integer.parseInt(String.valueOf(row.get("CURRENTSET"))));
			tennisMatch.setCurrentGame(Integer.parseInt(String.valueOf(row.get("CURRENTGAME"))));
			tennisMatch.setCurrentFault(Integer.parseInt(String.valueOf(row.get("CURRENTFAULT"))));
			matchesList.add(tennisMatch);
		}
		return matchesList;
	}

	@Override
	public List<TennisMatch> getMatchByRefereeIdAndByTournamentId(Integer refereeId, Integer tournamentId) {
		String sql = "SELECT * FROM TENNISMATCH WHERE r_ID = ? AND t_ID = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<TennisMatch> matchesList = new ArrayList<TennisMatch>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, refereeId, tournamentId);
		for (Map row: rows) {
			TennisMatch tennisMatch = new TennisMatch();
			tennisMatch.setId(Integer.parseInt(String.valueOf(row.get("ID"))));
			tennisMatch.setTournamentId(Integer.parseInt(String.valueOf(row.get("t_ID"))));
			tennisMatch.setPlayerOneId(Integer.parseInt(String.valueOf(row.get("p1_ID"))));
			if (row.get("p2_ID") == null) {
				tennisMatch.setPlayerTwoId(null);
			} else {
				tennisMatch.setPlayerTwoId(Integer.parseInt(String.valueOf(row.get("p2_ID"))));
			}
			tennisMatch.setPlayerThreeId(Integer.parseInt(String.valueOf(row.get("p3_ID"))));
			if (row.get("p4_ID") == null) {
				tennisMatch.setPlayerFourId(null);
			} else {
				tennisMatch.setPlayerFourId(Integer.parseInt(String.valueOf(row.get("p4_ID"))));
			}
			tennisMatch.setRefereeId(Integer.parseInt(String.valueOf(row.get("r_ID"))));
			try {
				tennisMatch.setDateMatch(new SimpleDateFormat("yyyyMMdd").parse(String.valueOf(row.get("DATEMATCH"))));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			tennisMatch.setBestOf(Integer.parseInt(String.valueOf(row.get("BO"))));
			tennisMatch.setRoundTournament(String.valueOf(row.get("ROUNDTOURNAMENT")));
			tennisMatch.setCourt(String.valueOf(row.get("COURT")));
			tennisMatch.setTournamentType(String.valueOf(row.get("TOURNAMENTTYPE")));
			tennisMatch.setService(Integer.parseInt(String.valueOf(row.get("SERVICE"))));
			tennisMatch.setWinner(Integer.parseInt(String.valueOf(row.get("WINNER"))));
			tennisMatch.setFirstTeamNumberOfSet(String.valueOf(row.get("t1_SCORE")));
			tennisMatch.setSecondTeamNumberOfSet(String.valueOf(row.get("t2_SCORE")));
			tennisMatch.setFirstTeamNumberOfWarnings(Integer.parseInt(String.valueOf(row.get("t1_WARNING"))));
			tennisMatch.setSecondTeamNumberOfWarnings(Integer.parseInt(String.valueOf(row.get("t2_WARNING"))));
			tennisMatch.setFirstTeamNumberOfChallenges(Integer.parseInt(String.valueOf(row.get("t1_CHALLENGE"))));
			tennisMatch.setSecondTeamNumberOfChallenges(Integer.parseInt(String.valueOf(row.get("t1_CHALLENGE"))));
			if (row.get("TIMEMATCH") == null) {
				tennisMatch.setMatchDurationTimestamp(null);
			} else {
				tennisMatch.setMatchDurationTimestamp(Time.valueOf(String.valueOf(row.get("TIMEMATCH"))));
			}
			tennisMatch.setCurrentSet(Integer.parseInt(String.valueOf(row.get("CURRENTSET"))));
			tennisMatch.setCurrentGame(Integer.parseInt(String.valueOf(row.get("CURRENTGAME"))));
			tennisMatch.setCurrentFault(Integer.parseInt(String.valueOf(row.get("CURRENTFAULT"))));
			matchesList.add(tennisMatch);
		}
		return matchesList;
	}
	
}
