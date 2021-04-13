package com.skilldistillery.sports.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.sports.entities.NflPlayer;
import com.skilldistillery.sports.services.NFLPlayerService;

@CrossOrigin({"*", "http://localhost:4205"})
@RequestMapping("api")
@RestController
public class NFLPlayerController {
	@Autowired
	private NFLPlayerService svc;

		@GetMapping("ping")
		public String ping() {
			return "pong!";
		}


		@GetMapping("nflPlayers/{id}")
		public NflPlayer findById(@PathVariable Integer id, HttpServletResponse response) {
			NflPlayer nflPLayer = svc.findById(id);
			if (nflPLayer == null) {
				response.setStatus(404);
			}
			return nflPLayer;
		}

	
}
