package org.epsi.pointbreak.dao;

import org.epsi.pointbreak.domain.CurrentScoreState;

public interface CurrentScoreStateDAOInterface {
	public CurrentScoreState findCurrentScoreStateByMatchId(int id);
}
