package com.example.api.services;

import com.example.api.models.ProductModel;
import com.example.api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductModel> getAllProductsService() {
        return productRepository.findAll();
    }

    public ProductModel saveProductService(ProductModel productModel) {
        return productRepository.save(productModel);
    }
}
