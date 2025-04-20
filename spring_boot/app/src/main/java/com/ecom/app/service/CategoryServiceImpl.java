package com.ecom.app.service;

import com.ecom.app.exceptions.APIException;
import com.ecom.app.exceptions.ResourceNotFoundException;
import com.ecom.app.model.Category;
import com.ecom.app.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        List<Category> allCategories = categoryRepository.findAll();
        if(allCategories.isEmpty()){
            throw new APIException("No Categories");
        }
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
        Category savedCategory = categoryRepository.findByCategoryName(category.getCategoryName());
        if(savedCategory==null){
            categoryRepository.save(category);
        }
        else {
            throw new APIException(String.format("This Category is already exist : %s",category.getCategoryName()));
        }
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Optional<Category> categoryOptional = categoryRepository.findById(categoryId);
        Category deleteCategory = categoryOptional
                .orElseThrow(()-> new ResourceNotFoundException("Category","CategoryName",categoryId));

        categoryRepository.delete(deleteCategory);
        return "category is removed with categoryId "+categoryId+" removed successfully...";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Optional<Category> savedCategoryOptional = categoryRepository.findById(categoryId);

        Category savedCategory = savedCategoryOptional
                .orElseThrow(()-> new ResourceNotFoundException("Category","CategoryName",categoryId));
        category.setCategoryId(categoryId);
        categoryRepository.save(category);
            return savedCategory;
        }

}
