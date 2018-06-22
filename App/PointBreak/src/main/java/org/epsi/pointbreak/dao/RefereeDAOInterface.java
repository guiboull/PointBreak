package org.epsi.pointbreak.dao;

import org.epsi.pointbreak.domain.Referee;

public interface RefereeDAOInterface {
	
	public Referee findByLogin(String login);

}
