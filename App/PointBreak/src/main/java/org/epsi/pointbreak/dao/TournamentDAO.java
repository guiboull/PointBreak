package org.epsi.pointbreak.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.epsi.pointbreak.domain.Surface;
import org.epsi.pointbreak.domain.Tournament;
import org.springframework.jdbc.core.JdbcTemplate;

public class TournamentDAO implements TournamentDAOInterface{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Tournament> getTournamentByRefereeId(int refereeId) {
		String sql = "SELECT TOURNAMENT.* FROM TOURNAMENT "
				+    "INNER JOIN TENNISMATCH ON TOURNAMENT.ID = TENNISMATCH.t_ID "
				+    "AND TENNISMATCH.r_ID = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Tournament> tournamentList = new ArrayList<Tournament>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, refereeId);
		for (Map row: rows) {
			Tournament tournament = new Tournament();
			tournament.setId(Integer.parseInt(String.valueOf(row.get("ID"))));
			tournament.setTournamentName(String.valueOf(row.get("NAME")));
			tournament.setSurfaceType(Surface.getSurfaceType(String.valueOf(row.get("s_ID")).charAt(0)));
			tournament.setGender(String.valueOf(row.get("GENDER")).charAt(0));
			tournament.setNumberOfPlayersInvolved(Integer.parseInt(String.valueOf(row.get("DRAWSIZE"))));
			try {
				tournament.setTournamentStartingDate(new SimpleDateFormat("yyyyMMdd").parse(String.valueOf(row.get("DATESTART"))));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				tournament.setTournamentEndingDate(new SimpleDateFormat("yyyyMMdd").parse(String.valueOf(row.get("DATEEND"))));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tournamentList.add(tournament);
		}
		return tournamentList;
	}

}
