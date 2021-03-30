package com.skilldistillery.sports.enitities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.sports.entities.NflPlayer;

class NflPlayerTest {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private NflPlayer nflPlayer;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("sportsPU");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		nflPlayer = em.find(NflPlayer.class, 3);

	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		nflPlayer = null;
	}

	@Test
	@DisplayName("Test Player TD Run Number")
	void test1() {
		assertNotNull(nflPlayer);
		assertEquals(1, nflPlayer.getRushingTouchdowns());
	}
	@DisplayName("Test PLayer Pass Number")
	void test2() {
		assertNotNull(nflPlayer);
		assertEquals(516, nflPlayer.getAttemptedPasses());
	}


}
