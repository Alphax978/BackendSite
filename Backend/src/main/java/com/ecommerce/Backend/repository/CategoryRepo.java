package com.ecommerce.Backend.repository;
import com.ecommerce.Backend.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {
}