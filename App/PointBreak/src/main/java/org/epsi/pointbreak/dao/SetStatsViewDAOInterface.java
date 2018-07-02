package org.epsi.pointbreak.dao;

import org.epsi.pointbreak.domain.SetStatsView;

public interface SetStatsViewDAOInterface {
	public SetStatsView getSetStats(int matchId, int setId);
}
