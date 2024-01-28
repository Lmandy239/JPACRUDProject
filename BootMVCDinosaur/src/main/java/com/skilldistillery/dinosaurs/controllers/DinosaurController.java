package com.skilldistillery.dinosaurs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.dinosaurs.data.DinosaurDAO;
import com.skilldistillery.dinosaurs.entities.Dinosaur;

@Controller
public class DinosaurController {

	@Autowired
	private DinosaurDAO dinoDAO;

	@RequestMapping({ "", "/", "home.do" })
	public String index(Model model) {
		return "index";
	}

	
	@PostMapping(path = "findall.do")
	public String findAll(Model model) {
	    List<Dinosaur> dinosaurs = dinoDAO.findAll();
	    model.addAttribute("dinosaurs", dinosaurs);
	    return "list";
	}

	
	@PostMapping(path = "getDinosaur.do", params = "id")
	public String getDinosaurById(@RequestParam("id") int id, Model model) {
		Dinosaur dino = dinoDAO.findById(id);
		String viewDino = "show";
		model.addAttribute("dinosaur", dino);

		return viewDino;

	}

	@PostMapping(path = "createDino.do")
	public String createDino(@ModelAttribute Dinosaur dino, Model model) {
		Dinosaur newDino = dinoDAO.createDinosaur(dino);
		model.addAttribute("dinosaur", newDino);
		return "show";
	}

	@PostMapping(path = "deleteDino.do")
	public String deleteDino(@RequestParam("id") int id, Model model) {
		boolean deleteDinoResult = dinoDAO.deleteDinosaurById(id);

		if (deleteDinoResult) {
			return "confirmation";
		} else {
			return "error";
		}
	}
	@PostMapping(path = "updateDino.do")
	public String updateDino(@ModelAttribute Dinosaur dino, Model model) {
		boolean updateDino = dinoDAO.updateDinosaur(dino);
	if(updateDino) {
		return "confirmation";
	}else {
		return "error";
	}
	}

}
