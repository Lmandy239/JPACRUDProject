package com.skilldistillery.dinosaurs.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class DinosaurTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Dinosaur dino;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("Dinosaurs");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		dino = em.find(Dinosaur.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		dino = null;
		em.close();
	}

	@Test
	void test_Dinosaur_entity_mapping() {
		assertNotNull(dino);
		assertEquals("Allosaurus", dino.getName());

	}



}
