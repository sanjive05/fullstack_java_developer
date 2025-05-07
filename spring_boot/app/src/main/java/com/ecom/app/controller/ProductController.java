package com.ecom.app.controller;

import com.ecom.app.model.Product;
import com.ecom.app.payload.ProductDTO;
import com.ecom.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/admin/categories/{categoryId}/product")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody  Product product, @PathVariable Long categoryId){
         ProductDTO productDTO = productService.addProduct(product,categoryId);
         return new ResponseEntity<>(productDTO, HttpStatus.CREATED);

    }
}
