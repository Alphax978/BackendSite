package com.ecommerce.Backend.service;

import com.ecommerce.Backend.repository.CategoryRepo;
import com.ecommerce.Backend.DTO.CategoryDTO;
import com.ecommerce.Backend.DTO.CategorySaveDTO;
import com.ecommerce.Backend.DTO.CategoryUpdateDTO;
import com.ecommerce.Backend.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceIMPL implements CategoryService
{
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public String addCategory(CategorySaveDTO categorySaveDTO)
    {
        Category category = new Category(

                categorySaveDTO.getCategoryname(),
                categorySaveDTO.getDescription(),
                categorySaveDTO.getImage()
        );
        categoryRepo.save(category);
        return category.getCategoryname();
    }

    @Override
    public List<CategoryDTO> getAllCategory() {
       List<Category> getcategorys = categoryRepo.findAll();
       List<CategoryDTO> categoryDTOList = new ArrayList<>();
       for(Category a:getcategorys)
       {
           CategoryDTO categoryDTO = new CategoryDTO(

                   a.getCategoryid(),
                   a.getCategoryname(),
                   a.getDescription(),
                   a.getImage()
           );
           categoryDTOList.add(categoryDTO);
       }

       return  categoryDTOList;
    }

    @Override
    public String updateCategory(CategoryUpdateDTO categoryUpdateDTO)
    {
        if (categoryRepo.existsById(categoryUpdateDTO.getCategoryid())) {
            Category category = categoryRepo.getById(categoryUpdateDTO.getCategoryid());


            category.setCategoryname(categoryUpdateDTO.getCategoryname());
            category.setDescription(categoryUpdateDTO.getDescription());
            category.setImage(categoryUpdateDTO.getImage());
            categoryRepo.save(category);
        }
            else
            {
                System.out.println("category ID do not Exist");
            }

                return null;
        }

    @Override
    public boolean deleteCategory(int id) {

        if(categoryRepo.existsById(id))
        {
            categoryRepo.deleteById(id);
        }
        else
        {
            System.out.println("category id not found");
        }

        return true;
    }
}