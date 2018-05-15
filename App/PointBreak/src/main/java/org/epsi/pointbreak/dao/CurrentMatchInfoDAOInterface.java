package org.epsi.pointbreak.dao;

import org.epsi.pointbreak.domain.CurrentMatchInfo;

public interface CurrentMatchInfoDAOInterface {
	public CurrentMatchInfo findCurrentMatchInfoByMatchId(int id);
}
