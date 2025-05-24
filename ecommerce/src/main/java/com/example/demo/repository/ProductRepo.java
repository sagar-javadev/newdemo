package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long>{
	
	Page<Product> findAllByTitleContaining(String title,Pageable pageable);

    Page<Product> findAllByLiveTrue(Pageable pageable);

}
