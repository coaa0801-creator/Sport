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

import com.skilldistillery.sports.entities.NflPlayer;
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
	
	@Test
	@DisplayName("Test Team Win Entity")
	void test2() {
		assertNotNull(team);
		assertEquals(7, team.getWin());
	}
	
	@Test
	@DisplayName("Test Team Connect to Player")
	void test3() {
		assertNotNull(team);
		Team team = em.find(Team.class, 1);
		assertNotNull(team.getNflPlayers());
		assertEquals(15, team.getNflPlayers().size());
		assertEquals("Dalvin", team.getNflPlayers().get(0).getFirstName());
	}
	
	@Test
	@DisplayName("Test Team Connect to Coach")
	void test4() {
		assertNotNull(team);
		Team team = em.find(Team.class, 1);
		assertNotNull(team.getCoaches());
		assertEquals(4, team.getCoaches().size());
		assertEquals("Mike", team.getCoaches().get(0).getFirstName());
	}
	
	@Test
	@DisplayName("Test Team Connect to Staff")
	void test5() {
		assertNotNull(team);
		Team team = em.find(Team.class, 1);
		assertNotNull(team.getStaffList());
		assertEquals(2, team.getStaffList().size());
		assertEquals("Rick", team.getStaffList().get(1).getFirstName());
	}
	
	@Test
	@DisplayName("Test Team Connect to Stadium")
	void test6() {
		assertNotNull(team);
		Team team = em.find(Team.class, 1);
		assertNotNull(team.getStadiums());
		assertEquals(1, team.getStadiums().size());
		assertEquals("U.S. Bank Stadium", team.getStadiums().get(0).getName());
	}
	
	@Test
	@DisplayName("Test Team Connect to Defense")
	void test7() {
		assertNotNull(team);
		Team team = em.find(Team.class, 1);
		assertNotNull(team.getDefense());
		assertEquals(15, team.getDefense().getInterceptions());
	}

}