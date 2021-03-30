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

import com.skilldistillery.sports.entities.Stadium;

class StadiumTest {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Stadium stadium;

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
		stadium = em.find(Stadium.class, 1);

	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		stadium = null;
	}

	@Test
	@DisplayName("Test Stadium")
	void test1() {
		assertNotNull(stadium);
		assertEquals(1, stadium.getId());
	}


}
