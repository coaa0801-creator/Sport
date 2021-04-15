package com.skilldistillery.sports.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.sports.entities.NflPlayer;
import com.skilldistillery.sports.repositories.NFLPlayerRepository;

@Service
public class NFLPlayerServiceImpl implements NFLPlayerService{
	
	@Autowired
	private NFLPlayerRepository repo;
	
	@Override
	public NflPlayer findById(Integer id) {
		Optional<NflPlayer> nflPLayerOpt = repo.findById(id);
		NflPlayer nflPlayer = null;
		if (nflPLayerOpt.isPresent()) {
			nflPlayer = nflPLayerOpt.get();
		}
		System.out.println("########################" + nflPlayer);
		return nflPlayer;
	}
	
//	@Override
//	public NflPlayer createNflPlayer(String firstName, String lastName, Integer playerId, NflPlayer nflPlayer) {
//		repo.saveAndFlush(nflPlayer);
//		return nflPlayer;
//	}

}
