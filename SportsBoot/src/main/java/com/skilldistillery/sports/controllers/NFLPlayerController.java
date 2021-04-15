package com.skilldistillery.sports.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.sports.entities.NflPlayer;
import com.skilldistillery.sports.services.NFLPlayerService;

@CrossOrigin({ "*", "http://localhost:8088" })
@RequestMapping("api")
@RestController
public class NFLPlayerController {
	@Autowired
	private NFLPlayerService svc;


	@GetMapping("nflPlayers")
	public List<NflPlayer> getAllNflPlayers() {
		return svc.getAllNflPlayers();
	}

	@GetMapping("nflPlayers/{id}")
	public NflPlayer findById(@PathVariable Integer id, HttpServletResponse response) {
		NflPlayer nflPLayer = svc.findById(id);
		if (nflPLayer == null) {
			response.setStatus(404);
		}
		return nflPLayer;
	}

		@PostMapping("nflPlayers")
		public NflPlayer create(@RequestBody NflPlayer nflPlayer, String firstName, String lastName, Integer playerId, HttpServletRequest req, HttpServletResponse res) {
			nflPlayer = svc.addNflPlayer(firstName, lastName, playerId, nflPlayer);
			try {
				if(nflPlayer == null) {
					res.setStatus(404);
				} else {
					res.setStatus(201);
					StringBuffer url = req.getRequestURL();
					url.append("/").append(nflPlayer.getId());
					res.setHeader("Location", url.toString());
				}
			} catch (Exception e) {
				res.setStatus(400);
				e.printStackTrace();
				nflPlayer = null;
			}
			return nflPlayer;
		}
		
		@DeleteMapping("nflPlayers/{id}")
		public void destroy(HttpServletRequest req, HttpServletResponse res, @PathVariable int id) {
			try {
				boolean deleted = svc.remove(id);
				if(deleted) {
					res.setStatus(204);
				}
				else {
					res.setStatus(404);
				}
			} catch (Exception e) {
				res.setStatus(400);
				e.printStackTrace();
			}
		}

}
