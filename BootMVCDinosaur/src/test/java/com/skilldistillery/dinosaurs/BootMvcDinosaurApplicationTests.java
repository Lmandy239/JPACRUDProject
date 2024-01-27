package com.skilldistillery.dinosaurs;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    void testDinosaurById() {
        assertNotNull(dino);
        Dinosaur lizard = dino.findById(1);
        assertNotNull(lizard);
    }
}

