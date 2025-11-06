package com.edsoft.order_service.controller;

import com.edsoft.order_service.model.Product;
import com.edsoft.order_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin({"https://beachorder.up.railway.app", "http://localhost:8080"})
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> allProducts() {
        List<Product> products = productService.listAll();
        return ResponseEntity.ok(products);
    }
}
