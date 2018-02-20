package org.epsi.pointbreak.rest;

import org.epsi.pointbreak.PointBreakApplication;
import org.epsi.pointbreak.dao.JDBCPlayerDAO;
import org.epsi.pointbreak.domain.Player;
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
		JDBCPlayerDAO playerDAO = (JDBCPlayerDAO) PointBreakApplication.context.getBean("JDBCPlayerDAO");
		Player player = playerDAO.findById(playerId);
		return player;
	}
}
