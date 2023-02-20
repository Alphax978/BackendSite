package com.ecommerce.Backend.service;

import java.util.List;

import com.ecommerce.Backend.DTO.CategorySaveDTO;
import com.ecommerce.Backend.DTO.CategoryUpdateDTO;
import com.ecommerce.Backend.DTO.CategoryDTO;

public interface CategoryService {
    String addCategory(CategorySaveDTO customerSaveDTO);
 
    List<CategoryDTO> getAllCategory();
 
    String updateCategory(CategoryUpdateDTO customerUpdateDTO);
 
    boolean deleteCategory(int id);
    
}
