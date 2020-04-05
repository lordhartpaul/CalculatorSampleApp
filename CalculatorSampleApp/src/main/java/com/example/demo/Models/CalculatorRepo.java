package com.example.demo.Models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Calculator;

@Repository
public interface CalculatorRepo extends JpaRepository<Calculator, Integer>{
	
	

}
