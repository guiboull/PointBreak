package org.epsi.pointbreak;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class PointBreakService {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	   public String getHomeMessage(){
	      return "Bienvenue sur le service ATPLive";
	   }
	
}
