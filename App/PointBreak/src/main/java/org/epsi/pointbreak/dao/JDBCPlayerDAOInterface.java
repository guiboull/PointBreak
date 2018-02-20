package org.epsi.pointbreak.dao;

import org.epsi.pointbreak.domain.Player;

public interface JDBCPlayerDAOInterface {
	
	public Player findById(int id);

}
