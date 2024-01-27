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
	public Dinosaur updateDinosaurById(Dinosaur dino) {

		Dinosaur existingDino = em.find(Dinosaur.class, dino.getId());

		if (existingDino != null) {
			existingDino.setName(dino.getName());
			existingDino.setDescription(dino.getDescription());
			existingDino.setDiet(dino.getDiet());

			return existingDino;
		}

		return null;
	}

}
