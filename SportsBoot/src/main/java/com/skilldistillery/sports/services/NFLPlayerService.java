package com.skilldistillery.sports.services;


import com.skilldistillery.sports.entities.NflPlayer;

public interface NFLPlayerService {

	public NflPlayer findById(Integer id);
	
//	public NflPlayer createNflPlayer(String firstName, String lastName, Integer playerId, NflPlayer nflPlayer) ;
}
