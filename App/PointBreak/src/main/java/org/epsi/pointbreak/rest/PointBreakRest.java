package org.epsi.pointbreak.rest;

import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.epsi.pointbreak.PointBreakApplication;
import org.epsi.pointbreak.dao.CurrentMatchInfoViewDAO;
import org.epsi.pointbreak.dao.CurrentScoreStateViewDAO;
import org.epsi.pointbreak.dao.MatchActionDAO;
import org.epsi.pointbreak.dao.PlayerDAO;
import org.epsi.pointbreak.dao.RefereeDAO;
import org.epsi.pointbreak.dao.TennisMatchListItemDAO;
import org.epsi.pointbreak.dao.TournamentDAO;
import org.epsi.pointbreak.domain.CurrentMatchInfoView;
import org.epsi.pointbreak.domain.CurrentScoreStateView;
import org.epsi.pointbreak.domain.Player;
import org.epsi.pointbreak.domain.Referee;
import org.epsi.pointbreak.domain.TennisMatchListItem;
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
	public List<TennisMatchListItem> getMatches() {
		TennisMatchListItemDAO tennisMatchDAO = (TennisMatchListItemDAO) PointBreakApplication.context.getBean("TennisMatchDAO");
		return tennisMatchDAO.getAllMatches();
	}
	
	@RequestMapping(value="/matchlist/{refereeId}/{tournamentId}", method = RequestMethod.GET)
	@ResponseBody
	public List<TennisMatchListItem> getMatchByRefereeIdAndByTournamentId(@PathVariable("refereeId") Integer refereeId, @PathVariable("tournamentId") Integer tournamentId) {
		TennisMatchListItemDAO tennisMatchDAO = (TennisMatchListItemDAO) PointBreakApplication.context.getBean("TennisMatchDAO");
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
	public CurrentScoreStateView getCurrentScoreStateAfterAction(@PathVariable("matchId") Integer matchId, @PathVariable("actionId") Integer actionId, @PathVariable("teamId") Integer teamId) {
		//insert the match action first
		MatchActionDAO matchActionDAO = (MatchActionDAO) PointBreakApplication.context.getBean("MatchActionDAO");
		matchActionDAO.insertMatchAction(matchId, actionId, teamId); 
		//get current score
		CurrentScoreStateViewDAO currentScoreStateDAO = (CurrentScoreStateViewDAO) PointBreakApplication.context.getBean("CurrentScoreStateDAO");
		return currentScoreStateDAO.findCurrentScoreStateByMatchId(matchId);
	}
	
	@RequestMapping(value="/match/{matchId}/initialize", method = RequestMethod.GET)
	@ResponseBody
	public CurrentMatchInfoView initializeCurrentMatch(@PathVariable("matchId") Integer matchId) {
		CurrentMatchInfoViewDAO currentMatchInfoDAO = (CurrentMatchInfoViewDAO) PointBreakApplication.context.getBean("CurrentMatchInfoDAO"); 
		return currentMatchInfoDAO.findCurrentMatchInfoByMatchId(matchId);
	}
	
	
	@RequestMapping(value="/process/{login}/{password}", method = RequestMethod.GET)
	@ResponseBody
	public Integer getReferee(@PathVariable("login") String login, @PathVariable("password") String password ) {
		RefereeDAO refereeDAO = (RefereeDAO) PointBreakApplication.context.getBean("RefereeDAO");
		Referee referee =  refereeDAO.findByLogin(login);
		byte[] output = null;
		String key ="testtesttesttest";
		try {
			java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();
			SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, skey);
			output = cipher.doFinal(decoder.decode(password));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		String passwordFromFront = new String(output);
		
		if(referee.getPassword().equals(passwordFromFront)) {
			return referee.getId();
		}
		
		return new Integer(0);
	}
}
