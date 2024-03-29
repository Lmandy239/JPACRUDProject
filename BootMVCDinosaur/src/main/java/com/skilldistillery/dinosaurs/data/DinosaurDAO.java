package com.skilldistillery.dinosaurs.data;

import java.util.List;

import com.skilldistillery.dinosaurs.entities.Dinosaur;

public interface DinosaurDAO {
	Dinosaur findById(int id);
	Dinosaur createDinosaur(Dinosaur dino);	
	boolean deleteDinosaurById(int id);
	boolean updateDinosaur(Dinosaur dino);
	List<Dinosaur> findAll();

}
