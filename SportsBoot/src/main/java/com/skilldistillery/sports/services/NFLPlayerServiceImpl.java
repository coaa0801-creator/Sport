package com.skilldistillery.sports.services;

import java.util.List;
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
	public List<NflPlayer> getAllNflPlayers() {
		return repo.findAll();	}
	
	@Override
	public NflPlayer findById(Integer id) {
		Optional<NflPlayer> nflPLayerOpt = repo.findById(id);
		NflPlayer nflPlayer = null;
		if (nflPLayerOpt.isPresent()) {
			nflPlayer = nflPLayerOpt.get();
		}
		return nflPlayer;
	}
	
	@Override
	public NflPlayer addNflPlayer(String firstName, String lastName, Integer playerId, NflPlayer nflPlayer) {
		repo.saveAndFlush(nflPlayer);
		return nflPlayer;
	}
	
	@Override
	public boolean remove(Integer id) {
		boolean deleted = false;
		Optional<NflPlayer> nflPlayerToDelete = repo.findById(id);
		NflPlayer nflPlayer = null;
		if (nflPlayerToDelete.isPresent()) {
			nflPlayer = nflPlayerToDelete.get();
			nflPlayer.setEnabled(false);
			repo.saveAndFlush(nflPlayer);
			deleted = true;
		}
		return deleted;
	}

	

}
