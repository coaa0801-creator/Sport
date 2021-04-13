package com.skilldistillery.sports.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.sports.entities.NflPlayer;

public interface NFLPlayerRepository extends JpaRepository <NflPlayer, Integer>{
}
