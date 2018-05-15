package org.epsi.pointbreak.rest;

import java.util.List;

import org.epsi.pointbreak.PointBreakApplication;
import org.epsi.pointbreak.dao.CurrentMatchInfoDAO;
import org.epsi.pointbreak.dao.CurrentScoreStateDAO;
import org.epsi.pointbreak.dao.MatchActionDAO;
import org.epsi.pointbreak.dao.PlayerDAO;
import org.epsi.pointbreak.dao.TennisMatchDAO;
import org.epsi.pointbreak.dao.TournamentDAO;
import org.epsi.pointbreak.domain.CurrentMatchInfo;
import org.epsi.pointbreak.domain.CurrentScoreState;
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
		PlayerDAO playerDAO = (PlayerDAO) PointBreakApplication.context.getBean("PlayerDAO");
		return playerDAO.findById(playerId);
	}
	
	@RequestMapping(value="/matchlist", method = RequestMethod.GET)
	@ResponseBody
	public List<TennisMatch> getMatches() {
		TennisMatchDAO tennisMatchDAO = (TennisMatchDAO) PointBreakApplication.context.getBean("TennisMatchDAO");
		return tennisMatchDAO.getAllMatches();
	}
	
	@RequestMapping(value="/matchlist/{refereeId}/{tournamentId}", method = RequestMethod.GET)
	@ResponseBody
	public List<TennisMatch> getMatchByRefereeIdAndByTournamentId(@PathVariable("refereeId") Integer refereeId, @PathVariable("tournamentId") Integer tournamentId) {
		TennisMatchDAO tennisMatchDAO = (TennisMatchDAO) PointBreakApplication.context.getBean("TennisMatchDAO");
		return tennisMatchDAO.getMatchByRefereeIdAndByTournamentId(refereeId, tournamentId);
	}
	
	@RequestMapping(value="/tournamentlist/{refereeId}", method = RequestMethod.GET)
	@ResponseBody
	public List<Tournament> getTournamentByRefereeId(@PathVariable("refereeId") Integer refereeId) {
		TournamentDAO tournamentDAO = (TournamentDAO) PointBreakApplication.context.getBean("TournamentDAO");
		return tournamentDAO.getTournamentByRefereeId(refereeId);
	}
	
	@RequestMapping(value="/action/{matchId}/{actionId}/{teamId}", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public CurrentScoreState getCurrentScoreStateAfterAction(@PathVariable("matchId") Integer matchId, @PathVariable("actionId") Integer actionId, @PathVariable("teamId") Integer teamId) {
		//insert the match action first
		MatchActionDAO matchActionDAO = (MatchActionDAO) PointBreakApplication.context.getBean("MatchActionDAO");
		matchActionDAO.insertMatchAction(matchId, actionId, teamId); 
		//get current score
		CurrentScoreStateDAO currentScoreStateDAO = (CurrentScoreStateDAO) PointBreakApplication.context.getBean("CurrentScoreStateDAO");
		return currentScoreStateDAO.findCurrentScoreStateByMatchId(matchId);
	}
	
	@RequestMapping(value="/match/{matchId}/initialize", method = RequestMethod.GET)
	@ResponseBody
	public CurrentMatchInfo initializeCurrentMatch(@PathVariable("matchId") Integer matchId) {
		CurrentMatchInfoDAO currentMatchInfoDAO = (CurrentMatchInfoDAO) PointBreakApplication.context.getBean("CurrentMatchInfoDAO"); 
		return currentMatchInfoDAO.findCurrentMatchInfoByMatchId(matchId);
	}
}
