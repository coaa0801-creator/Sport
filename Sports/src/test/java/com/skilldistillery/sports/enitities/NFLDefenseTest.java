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

import com.skilldistillery.sports.entities.NFLDefense;

class NFLDefenseTest {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private NFLDefense defense;

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
		defense = em.find(NFLDefense.class, 1);

	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		defense = null;
	}

	@Test
	@DisplayName("Test Defense")
	void test1() {
		assertNotNull(defense);
		assertEquals(1, defense.getId());
		assertEquals(15, defense.getInterceptions());
		assertEquals(366, defense.getFirstDownsAllowed());
		assertEquals("Vikings", defense.getTeamName());
		
	}

	@Test
	@DisplayName("Test Defense Connect to Team")
	void test2() {
		assertNotNull(defense);
		assertEquals("Vikings", defense.getTeam().getNickname());
		
		
	}

}
