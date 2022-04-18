package com.skilldistillery.jparedrocks.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RedRocksTest {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private RedRocks redrocks;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPARedRocks");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		redrocks = em.find(RedRocks.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		redrocks = null;
	}

	@Test
	void test_RedRocks_entity_mapping() {
		assertNotNull(redrocks);
		assertEquals("Subtronics", redrocks.getName());
	}

}
