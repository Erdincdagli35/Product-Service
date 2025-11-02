package com.edsoft.order_service.service;

import com.edsoft.order_service.model.Product;
import com.edsoft.order_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> listAll() {
        List<Product> products = productRepository.findAll();
        return products;
    }

}
