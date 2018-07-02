package org.epsi.pointbreak.dao;

import java.util.List;

import org.epsi.pointbreak.domain.Player;

public interface PlayerDAOInterface {
	
	public Player findById(int id);
	public List<Player> getAllPlayers();
	public List<Player> getAllRankedPlayers();
	public List<Player> getTopRankedPlayers();
}
