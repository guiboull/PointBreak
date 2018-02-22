package org.epsi.pointbreak.dao;

import org.epsi.pointbreak.domain.Tournament;
import java.util.List;

public interface TournamentDAOInterface {
	
	public List<Tournament> getTournamentByRefereeId(int refereeId);

}
