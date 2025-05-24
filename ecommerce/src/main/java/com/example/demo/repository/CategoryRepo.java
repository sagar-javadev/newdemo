package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Category;


public interface CategoryRepo extends JpaRepository<Category,Long> {
	
	List<Category> findAByTitleContaining(String keyword);
}
