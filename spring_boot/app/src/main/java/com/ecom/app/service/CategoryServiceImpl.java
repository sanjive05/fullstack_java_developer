package com.ecom.app.service;

import com.ecom.app.exceptions.APIException;
import com.ecom.app.exceptions.ResourceNotFoundException;
import com.ecom.app.model.Category;
import com.ecom.app.payload.CategoryDTO;
import com.ecom.app.payload.CategoryResponse;
import com.ecom.app.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) {
        Sort sortByAndOrder = sortOrder.equalsIgnoreCase("asc")? Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNumber,pageSize,sortByAndOrder);

        Page<Category> page = categoryRepository.findAll(pageable);

        List<Category> allCategories = page.getContent();
        if(allCategories.isEmpty()){
            throw new APIException("No Categories");
        }
        List<CategoryDTO> categoryDTOS = allCategories.stream()
                .map(category -> modelMapper.map(category,CategoryDTO.class))
                .toList();
        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setContent(categoryDTOS);
        categoryResponse.setPageNumber(pageable.getPageNumber());
        categoryResponse.setPageSize(pageable.getPageSize());
        categoryResponse.setTotalElements(page.getTotalElements());
        categoryResponse.setTotalPages(page.getTotalPages());
        categoryResponse.setLastPage(page.isLast());
        return categoryResponse;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = modelMapper.map(categoryDTO,Category.class);
        Category savedCategory = categoryRepository.findByCategoryName(category.getCategoryName());
        if(savedCategory==null){
            CategoryDTO categoryDTO1 = modelMapper.map(categoryRepository.save(category),CategoryDTO.class);
            return categoryDTO1;
        }
        else {
            throw  new APIException(String.format("This Category is already exist : %s",categoryDTO.getCategoryName()));
        }
    }

    @Override
    public CategoryDTO deleteCategory(Long categoryId) {
        Optional<Category> categoryOptional = categoryRepository.findById(categoryId);
        Category deleteCategory = categoryOptional
                .orElseThrow(()-> new ResourceNotFoundException("Category","CategoryName",categoryId));
        categoryRepository.delete(deleteCategory);
        CategoryDTO categoryDTO = modelMapper.map(deleteCategory,CategoryDTO.class);
        return categoryDTO;
    }

    @Override
    public CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId) {
        Category savedCategory = categoryRepository.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException("Category","CategoryName",categoryId));
        Category category = modelMapper.map(categoryDTO,Category.class);
            category.setCategoryId(categoryId);
            savedCategory = categoryRepository.save(category);
            return modelMapper.map(savedCategory,CategoryDTO.class);
        }

}
