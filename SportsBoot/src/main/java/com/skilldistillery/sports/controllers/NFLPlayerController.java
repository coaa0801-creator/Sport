package com.skilldistillery.sports.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.sports.entities.NflPlayer;
import com.skilldistillery.sports.services.NFLPlayerService;

@CrossOrigin({"*", "http://localhost:8088"})
@RequestMapping("api")
@RestController
public class NFLPlayerController {
	@Autowired
	private NFLPlayerService svc;

//		@GetMapping("ping")
//		public String ping() {
//			return "pong!";
//		}


		@GetMapping("nflPlayers/{id}")
		public NflPlayer findById(@PathVariable Integer id, HttpServletResponse response) {
			System.out.println("######################## IN CONT 33");
			NflPlayer nflPLayer = svc.findById(id);
			System.out.println("######################## IN CONT" + nflPLayer);
			if (nflPLayer == null) {
				response.setStatus(404);
			}
			return nflPLayer;
		}
		
//		@PostMapping("nflPlayer")
//		public NflPlayer create(@RequestBody NflPlayer nflPlayer, HttpServletRequest req, HttpServletResponse res) {
//			nflPlayer = svc.createNflPlayer(nflPlayer.getFirstName(), nflPlayer.getLastName(), nflPlayer.getPlayerId(), nflPlayer);
//			try {
//				if(nflPlayer == null) {
//					res.setStatus(404);
//				} else {
//					res.setStatus(201);
//					StringBuffer url = req.getRequestURL();
//					url.append("/").append(nflPlayer.getId());
//					res.setHeader("Location", url.toString());
//				}
//			} catch (Exception e) {
//				res.setStatus(400);
//				e.printStackTrace();
//				nflPlayer = null;
//			}
//			return nflPlayer;
//		}

	
}
