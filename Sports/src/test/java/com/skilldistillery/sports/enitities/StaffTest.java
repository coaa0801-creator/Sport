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

import com.skilldistillery.sports.entities.Staff;

class StaffTest {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Staff staff;

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
		staff = em.find(Staff.class, 1);

	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		staff = null;
	}

	@Test
	@DisplayName("Test Staff")
	void test1() {
		assertNotNull(staff);
		assertEquals(1, staff.getId());
		assertEquals("Zygi", staff.getFirstName());
		assertEquals("Owner", staff.getPosition());
		assertEquals(133, staff.getWin());
		
		
	}
	@Test
	@DisplayName("Test Staff Connect to Team")
	void test2() {
		assertNotNull(staff);
		assertEquals("Vikings", staff.getTeams().get(0).getNickname());
		
		
	}


}
