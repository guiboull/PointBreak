package org.epsi.pointbreak.dao;

import java.util.List;

import org.epsi.pointbreak.domain.TennisMatch;

public interface TennisMatchDAOInterface {
	
	public List<TennisMatch> getAllMatches();
	public List<TennisMatch> getMatchByRefereeIdAndByTournamentId(Integer refereeId, Integer tournamentId);
	
}
