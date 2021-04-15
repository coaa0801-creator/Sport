package com.skilldistillery.sports.services;


import java.util.List;

import com.skilldistillery.sports.entities.NflPlayer;

public interface NFLPlayerService {

	List<NflPlayer> getAllNflPlayers();
	
	public NflPlayer findById(Integer id);
	
	
//	public NflPlayer createNflPlayer(String firstName, String lastName, Integer playerId, NflPlayer nflPlayer) ;
}
