package com.skilldistillery.dinosaurs.data;

import org.springframework.stereotype.Service;

import com.skilldistillery.dinosaurs.entities.Dinosaur;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class DinosaurDAOImpl implements DinosaurDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Dinosaur findById(int id) {

		Dinosaur dino = em.find(Dinosaur.class, id);

		return dino;
	}

}
