package com.ecom.app.service;

import com.ecom.app.exceptions.ResourceNotFoundException;
import com.ecom.app.model.Category;
import com.ecom.app.model.Product;
import com.ecom.app.payload.ProductDTO;
import com.ecom.app.repository.CategoryRepository;
import com.ecom.app.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ProductDTO addProduct(Product product, Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() ->new ResourceNotFoundException("Category","cateogory Id",categoryId));
        product.setCategory(category);
        double specialPrice = product.getPrice()-(product.getPrice()*(product.getDiscount()/100));
        product.setSpecialPrice(specialPrice);
        product.setImage("default.png");

        Product savedProduct =productRepository.save(product);

        return modelMapper.map(savedProduct,ProductDTO.class)   ;
    }
}
