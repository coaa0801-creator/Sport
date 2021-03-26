package com.skilldistillery.sports.enitities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.sports.entities.Team;

class TeamTest {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Team team;

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
		team = em.find(Team.class, 1);

	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		team = null;
	}

	@Test
	@DisplayName("Test Team Nickname Entity")
	void test1() {
		assertNotNull(team);
		assertEquals("Vikings", team.getNickname());
	}
	@DisplayName("Test Team Win Entity")
	void test2() {
		assertNotNull(team);
		assertEquals(7, team.getWin());
	}

}