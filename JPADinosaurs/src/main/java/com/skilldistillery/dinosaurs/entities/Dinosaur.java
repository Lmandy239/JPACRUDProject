package com.skilldistillery.dinosaurs.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dinosaur {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		
		private String name;
		
		private String description;
		
		private String diet;
	
	
		//methods 
		public Dinosaur() {
			
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getDiet() {
			return diet;
		}


		public void setDiet(String diet) {
			this.diet = diet;
		}


		@Override
		public int hashCode() {
			return Objects.hash(description, diet, id, name);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Dinosaur other = (Dinosaur) obj;
			return Objects.equals(description, other.description) && Objects.equals(diet, other.diet) && id == other.id
					&& Objects.equals(name, other.name);
		}


		@Override
		public String toString() {
			return "Dinosaur [id=" + id + ", name=" + name + ", description=" + description + ", diet=" + diet + "]";
		}
	
	
		
	
	
}
