package com.skilldistillery.dinosaurs.data;

import java.util.List;

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

	@Override
	public Dinosaur createDinosaur(Dinosaur dino) {
		String jpql = "INSERT INTO Dinosaur (id, name, description, diet) VALUES (:id, :name, :description, :diet)";

		em.createQuery(jpql).setParameter("id", dino.getId()).setParameter("name", dino.getName())
				.setParameter("description", dino.getDescription()).setParameter("diet", dino.getDiet())
				.executeUpdate();

		return dino;
	}

	@Override
	public boolean deleteDinosaurById(int id) {
		String jpql = "DELETE FROM Dinosaur d WHERE d.id = :id";
		int deletedCount = em.createQuery(jpql)
				.setParameter("id", id)
				.executeUpdate();

		return deletedCount == 1;
	}

	@Override
	public boolean updateDinosaur(Dinosaur dino) {
		String jpl = "UPDATE Dinosaur d SET d.name = :name, d.description = :description, d.diet = :diet WHERE d.id = :id";
		
		int updateDino = em.createQuery(jpl)
		.setParameter("id", dino.getId())
		.setParameter("name", dino.getName())
		.setParameter("description", dino.getDescription())
		.setParameter("diet", dino.getDiet())
		.executeUpdate();
		
		
		return updateDino == 1;
	}

	@Override
	public List<Dinosaur> findAll() {
		String jpql = "SELECT dinosaur FROM Dinosaur dinosaur";
		List<Dinosaur> dinosaurs = em.createQuery(jpql, Dinosaur.class).getResultList();
		
		return dinosaurs;
	}
	
	

}
