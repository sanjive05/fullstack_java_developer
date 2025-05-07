package com.ecom.app.service;

import com.ecom.app.model.Product;
import com.ecom.app.payload.ProductDTO;

public interface ProductService {
    ProductDTO addProduct(Product product, Long categoryId);
}
