package org.epsi.pointbreak.dao;

import org.epsi.pointbreak.domain.CurrentMatchInfoView;

public interface CurrentMatchInfoViewDAOInterface {
	public CurrentMatchInfoView findCurrentMatchInfoByMatchId(int id);
}
