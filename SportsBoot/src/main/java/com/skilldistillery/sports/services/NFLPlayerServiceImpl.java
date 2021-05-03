package com.skilldistillery.sports.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.sports.entities.NflPlayer;
import com.skilldistillery.sports.repositories.NFLPlayerRepository;

@Service
public class NFLPlayerServiceImpl implements NFLPlayerService {

	@Autowired
	private NFLPlayerRepository repo;

	@Override
	public List<NflPlayer> getAllNflPlayers() {
		return repo.findAll();
	}

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
	public NflPlayer updateNflPlayer(Integer id, NflPlayer nflPlayer) {
		Optional<NflPlayer> nflPLayerOpt = repo.findById(id);
		NflPlayer updateNflPlayer = null;
		if (nflPLayerOpt.isPresent()) {
			updateNflPlayer = nflPLayerOpt.get();
//			Need to fix!!!!
			if (nflPlayer.getNumber() != 0) {
				updateNflPlayer.setNumber(nflPlayer.getNumber());
			}
			if (nflPlayer.getFirstName() != null) {
				updateNflPlayer.setFirstName(nflPlayer.getFirstName());
			}

			if (nflPlayer.getLastName() != null) {
				updateNflPlayer.setLastName(nflPlayer.getLastName());
			}
//			Need to fix!!!!
			if (nflPlayer.getAge() != 0) {
				updateNflPlayer.setAge(nflPlayer.getAge());
			}

			if (nflPlayer.getPosition() != null) {
				updateNflPlayer.setPosition(nflPlayer.getPosition());
			}
//			Need to fix!!!!
			if (nflPlayer.getGamesPlayed() != 25) {
				updateNflPlayer.setGamesPlayed(nflPlayer.getGamesPlayed());
			}
//			Need to fix!!!!
			if (nflPlayer.getGamesStarted() != 25) {
				updateNflPlayer.setGamesStarted(nflPlayer.getGamesStarted());
			}

			if (nflPlayer.getRushingAttempts() != null) {
				updateNflPlayer.setRushingAttempts(nflPlayer.getRushingAttempts());
			}

			if (nflPlayer.getRushingYards() != null) {
				updateNflPlayer.setRushingYards(nflPlayer.getRushingYards());
			}
//			Need to fix!!!!
			if (nflPlayer.getRushingTouchdowns() != 0) {
				updateNflPlayer.setRushingTouchdowns(nflPlayer.getRushingTouchdowns());
			}

			if (nflPlayer.getLongestRushingAttempt() != null) {
				updateNflPlayer.setLongestRushingAttempt(nflPlayer.getLongestRushingAttempt());
			}

			if (nflPlayer.getRushingYardsPerAttempt() != null) {
				updateNflPlayer.setRushingYardsPerAttempt(nflPlayer.getRushingYardsPerAttempt());
			}

			if (nflPlayer.getRushingYardsPerGame() != null) {
				updateNflPlayer.setRushingYardsPerGame(nflPlayer.getRushingYardsPerGame());
			}

			if (nflPlayer.getRushingAttemptsPerGame() != null) {
				updateNflPlayer.setRushingAttemptsPerGame(nflPlayer.getRushingAttemptsPerGame());
			}
//			Need to fix!!!!
			if (nflPlayer.getPassingTargets() != 0) {
				updateNflPlayer.setPassingTargets(nflPlayer.getPassingTargets());
			}
//			Need to fix!!!!
			if (nflPlayer.getReceptions() != 0) {
				updateNflPlayer.setReceptions(nflPlayer.getReceptions());
			}

			if (nflPlayer.getReceptionYards() != null) {
				updateNflPlayer.setReceptionYards(nflPlayer.getReceptionYards());
			}

			if (nflPlayer.getRecivingYardsPerReception() != null) {
				updateNflPlayer.setRecivingYardsPerReception(nflPlayer.getRecivingYardsPerReception());
			}
//			Need to fix!!!!
			if (nflPlayer.getRecivingTouchdowns() != 0) {
				updateNflPlayer.setRecivingTouchdowns(nflPlayer.getRecivingTouchdowns());
			}

			if (nflPlayer.getLongestReceptions() != null) {
				updateNflPlayer.setLongestReceptions(nflPlayer.getLongestReceptions());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}

			if (nflPlayer.getPrvEventPosts() != null) {
				updateNflPlayer.setPrvEventPosts(nflPlayer.getPrvEventPosts());
			}

			if (nflPlayer.getPrvEventComments() != null) {
				updateNflPlayer.setPrvEventComments(nflPlayer.getPrvEventComments());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}

			if (nflPlayer.getPrvEventPosts() != null) {
				updateNflPlayer.setPrvEventPosts(nflPlayer.getPrvEventPosts());
			}

			if (nflPlayer.getPrvEventComments() != null) {
				updateNflPlayer.setPrvEventComments(nflPlayer.getPrvEventComments());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}
			
			if (nflPlayer.getPrvEventPosts() != null) {
				updateNflPlayer.setPrvEventPosts(nflPlayer.getPrvEventPosts());
			}

			if (nflPlayer.getPrvEventComments() != null) {
				updateNflPlayer.setPrvEventComments(nflPlayer.getPrvEventComments());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}
			
			if (nflPlayer.getPrvEventPosts() != null) {
				updateNflPlayer.setPrvEventPosts(nflPlayer.getPrvEventPosts());
			}

			if (nflPlayer.getPrvEventComments() != null) {
				updateNflPlayer.setPrvEventComments(nflPlayer.getPrvEventComments());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}
			
			if (nflPlayer.getPrvEventPosts() != null) {
				updateNflPlayer.setPrvEventPosts(nflPlayer.getPrvEventPosts());
			}

			if (nflPlayer.getPrvEventComments() != null) {
				updateNflPlayer.setPrvEventComments(nflPlayer.getPrvEventComments());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}
			
			if (nflPlayer.getPrvEventPosts() != null) {
				updateNflPlayer.setPrvEventPosts(nflPlayer.getPrvEventPosts());
			}

			if (nflPlayer.getPrvEventComments() != null) {
				updateNflPlayer.setPrvEventComments(nflPlayer.getPrvEventComments());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}
			
			if (nflPlayer.getPrvEventPosts() != null) {
				updateNflPlayer.setPrvEventPosts(nflPlayer.getPrvEventPosts());
			}

			if (nflPlayer.getPrvEventComments() != null) {
				updateNflPlayer.setPrvEventComments(nflPlayer.getPrvEventComments());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}
			
			if (nflPlayer.getPrvEventPosts() != null) {
				updateNflPlayer.setPrvEventPosts(nflPlayer.getPrvEventPosts());
			}

			if (nflPlayer.getPrvEventComments() != null) {
				updateNflPlayer.setPrvEventComments(nflPlayer.getPrvEventComments());
			}

			if (nflPlayer.getPrvEvents() != null) {
				updateNflPlayer.setPrvEvents(nflPlayer.getPrvEvents());
			}

			if (nflPlayer.getPayments() != null) {
				updateNflPlayer.setPayments(nflPlayer.getPayments());
			}

			repo.flush();
		}
		return updateNflPlayer;
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
