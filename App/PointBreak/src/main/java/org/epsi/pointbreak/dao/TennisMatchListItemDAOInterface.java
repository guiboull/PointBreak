package org.epsi.pointbreak.dao;

import java.util.List;

import org.epsi.pointbreak.domain.TennisMatchListItem;

public interface TennisMatchListItemDAOInterface {
	
	public List<TennisMatchListItem> getAllMatches();
	public List<TennisMatchListItem> getMatchByRefereeIdAndByTournamentId(Integer refereeId, Integer tournamentId);
	
}
