package com.skilldistillery.dinosaurs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skilldistillery.dinosaurs.data.DinosaurDAOImpl;
import com.skilldistillery.dinosaurs.entities.Dinosaur;

@SpringBootTest
class BootMvcDinosaurApplicationTests {

    @Autowired
    private DinosaurDAOImpl dino;

    @Test
    void findAllDinosaurs() {
    	assertNotNull(dino);
    	List<Dinosaur> dinos = dino.findAll();
    	assertNotNull(dinos);
    }
    
    @Test
    void testDinosaurById() {
        assertNotNull(dino);
        Dinosaur lizard = dino.findById(1);
        assertNotNull(lizard);
    }
    
    @Test
    void testCreateDinosaur() {
    	   Dinosaur createdDino = new Dinosaur();
    	   createdDino.setId(5);
    	   createdDino.setName("Ranger");
    	   createdDino.setDescription("Killer");
    	   createdDino.setDiet("souls");
    	   
    	   dino.createDinosaur(createdDino);

    	   assertNotNull(dino);
           assertNotNull(createdDino);
           assertNotNull(createdDino.getId());
           assertEquals("Ranger", createdDino.getName());
           assertEquals("Killer", createdDino.getDescription());
           assertEquals("souls", createdDino.getDiet());
   
    }
    
    
    @Test
    void testUpdateDino() {
    	
    	Dinosaur updatelizard = new Dinosaur();
    	updatelizard.setId(5);
    	updatelizard.setName("Sylviasaurus");
    	updatelizard.setDescription("Mean");
    	updatelizard.setDiet("Vegetable");
    	dino.updateDinosaur(updatelizard);
    	
    	assertNotNull(dino);
    	assertNotNull(updatelizard);
    	assertNotNull(updatelizard.getId());
        assertEquals("Sylviasaurus", updatelizard.getName());
        assertEquals("Mean", updatelizard.getDescription());
        assertEquals("Vegetable", updatelizard.getDiet());
    }
    
    @Test
    void testDeleteDino() {
    	assertNotNull(dino);
    	boolean lizard = dino.deleteDinosaurById(5);
    	assertNotNull(lizard);
    }
}

