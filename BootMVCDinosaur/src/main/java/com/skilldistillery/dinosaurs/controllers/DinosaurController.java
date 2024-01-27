package com.skilldistillery.dinosaurs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.dinosaurs.data.DinosaurDAO;

@Controller
public class DinosaurController {

	@Autowired
	private DinosaurDAO dinoDAO;
	
	@RequestMapping({"", "/", "home.do"})
	public String index(Model model) {
		return "index";
	}
	
//	@RequestMapping(path="getDinosaur.do", params="id")
//	public String getDinosaurById(@RequestParam("id") int id, Model model) {
//		Dinosaur dino = dinoDAO.findById(id);
//		
//		model.addAttribute("dinosaur", dino);
//		
//		return
//		
//
//	}
	
	
	
}
