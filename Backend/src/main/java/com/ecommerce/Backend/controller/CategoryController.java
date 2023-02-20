package com.ecommerce.Backend.controller;

import com.ecommerce.Backend.DTO.CategoryDTO;
import com.ecommerce.Backend.DTO.CategorySaveDTO;
import com.ecommerce.Backend.DTO.CategoryUpdateDTO;
import com.ecommerce.Backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/category")
public class CategoryController
{
    @Autowired
    private CategoryService categoryService;

    @PostMapping(path = "/save")

    public String saveCategory(@RequestBody CategorySaveDTO categorySaveDTO)
    {
        String id = categoryService.addCategory(categorySaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllCategory")
    public List<CategoryDTO> getAllCategory()
    {
       List<CategoryDTO>allCategorys = categoryService.getAllCategory();
       return allCategorys;
    }

    @PutMapping(path = "/update")

    public String updateCategory(@RequestBody CategoryUpdateDTO CategoryUpdateDTO)
    {
        String id = categoryService.updateCategory(CategoryUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deleteCategory/{id}")
    public String deleteCategory(@PathVariable(value = "id") int id)
    {
        boolean deleteCategory = categoryService.deleteCategory(id);
        return "deleted";
    }

}