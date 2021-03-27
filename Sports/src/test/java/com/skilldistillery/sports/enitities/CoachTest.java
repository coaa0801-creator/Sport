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

import com.skilldistillery.sports.entities.Coach;

class CoachTest {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Coach coach;

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
		coach = em.find(Coach.class, 1);

	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		coach = null;
	}

	@Test
	@DisplayName("Test Coach First Name")
	void test1() {
		assertNotNull(coach);
		assertEquals("Mike", coach.getFirstName());
	}
	@DisplayName("Test Coach Win Record")
	void test2() {
		assertNotNull(coach);
		assertEquals(64, coach.getWin());
	}

}
