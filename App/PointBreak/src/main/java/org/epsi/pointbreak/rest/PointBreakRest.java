package org.epsi.pointbreak.rest;

import java.util.List;

import org.epsi.pointbreak.PointBreakApplication;
import org.epsi.pointbreak.dao.PlayerDAO;
import org.epsi.pointbreak.dao.TennisMatchDAO;
import org.epsi.pointbreak.dao.TournamentDAO;
import org.epsi.pointbreak.domain.Player;
import org.epsi.pointbreak.domain.TennisMatch;
import org.epsi.pointbreak.domain.Tournament;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value="/")
public class PointBreakRest {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	   public String getHomeMessage(){
	      return "Bienvenue sur le service ATPLive";
	   }
	
	@RequestMapping(value="/player/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Player getPlayerById(@PathVariable("id") Integer playerId) {
		PlayerDAO playerDAO = (PlayerDAO) PointBreakApplication.context.getBean("JDBCPlayerDAO");
		Player player = playerDAO.findById(playerId);
		return player;
	}
	
	@RequestMapping(value="/matchlist", method = RequestMethod.GET)
	@ResponseBody
	public List<TennisMatch> getMatches() {
		TennisMatchDAO tennisMatchDAO = (TennisMatchDAO) PointBreakApplication.context.getBean("TennisMatchDAO");
		List<TennisMatch> tennisMatchList = tennisMatchDAO.getAllMatches();
		return tennisMatchList;
	}
	
	@RequestMapping(value="/matchlist/{refereeId}/{tournamentId}", method = RequestMethod.GET)
	@ResponseBody
	public List<TennisMatch> getMatchByRefereeIdAndByTournamentId(@PathVariable("refereeId") Integer refereeId, @PathVariable("tournamentId") Integer tournamentId) {
		TennisMatchDAO tennisMatchDAO = (TennisMatchDAO) PointBreakApplication.context.getBean("TennisMatchDAO");
		List<TennisMatch> tennisMatchList = tennisMatchDAO.getMatchByRefereeIdAndByTournamentId(refereeId, tournamentId);
		return tennisMatchList;
	}
	
	@RequestMapping(value="/tournamentlist/{refereeId}", method = RequestMethod.GET)
	@ResponseBody
	public List<Tournament> getTournamentByRefereeId(@PathVariable("refereeId") Integer refereeId) {
		TournamentDAO tournamentDAO = (TournamentDAO) PointBreakApplication.context.getBean("TournamentDAO");
		List<Tournament> tournamentMatchList = tournamentDAO.getTournamentByRefereeId(refereeId);
		return tournamentMatchList;
	}
}
