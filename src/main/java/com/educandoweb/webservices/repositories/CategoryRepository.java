package com.educandoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
