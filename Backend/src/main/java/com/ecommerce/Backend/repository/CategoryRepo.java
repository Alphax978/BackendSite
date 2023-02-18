package com.ecommerce.Backend.repository;

import com.ecommerce.Backend.model.Category;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

    Optional <Category> findByCategoryName(String categoryName);

   

    

}