package com.nationwide.myrestaurant.Entity;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

interface PizzaRepo extends JpaRepository<Pizza, Integer>{
		public ArrayList<Pizza>findAll();	
}
