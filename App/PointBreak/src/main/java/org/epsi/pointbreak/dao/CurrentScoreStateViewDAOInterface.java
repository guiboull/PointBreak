package org.epsi.pointbreak.dao;

import org.epsi.pointbreak.domain.CurrentScoreStateView;

public interface CurrentScoreStateViewDAOInterface {
	public CurrentScoreStateView findCurrentScoreStateByMatchId(int id);
}
