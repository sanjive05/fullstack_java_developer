package com.ecom.app.service;

import com.ecom.app.model.Category;
import com.ecom.app.payload.CategoryDTO;
import com.ecom.app.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse getAllCategories();
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO,Long categoryId);
}
