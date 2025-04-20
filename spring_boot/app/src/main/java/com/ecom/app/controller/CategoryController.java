package com.ecom.app.controller;

import com.ecom.app.model.Category;
import com.ecom.app.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/public/categories")
    public ResponseEntity<List> getAllCategories(){
        return new ResponseEntity<>(categoryService.getAllCategories(),HttpStatus.OK);
    }
    @PostMapping("/api/public/categories")
    public ResponseEntity<String> createCategory(@Valid @RequestBody Category category){
        categoryService.createCategory(category);
        return  new ResponseEntity<>("Category Added Successfully!!!",HttpStatus.CREATED);
    }
    @DeleteMapping("/api/admin/categories/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId){
        String message = categoryService.deleteCategory(categoryId);
        return new ResponseEntity<>(message,HttpStatus.OK);

    }

    @PutMapping("/api/public/categories/{categoryId}")
    public ResponseEntity<String> updateCategory(@Valid @RequestBody Category category,@PathVariable Long categoryId){
            categoryService.updateCategory(category,categoryId);
            return new ResponseEntity<>("Category  Updated...",HttpStatus.OK);


    }

}
