package com.skilldistillery.dinosaurs.data;

import com.skilldistillery.dinosaurs.entities.Dinosaur;

public interface DinosaurDAO {
	Dinosaur findById(int id);
	Dinosaur createDinosaur(Dinosaur dino);	
	boolean deleteDinosaurById(int id);
	Dinosaur updateDinosaurById(Dinosaur dino);
}
