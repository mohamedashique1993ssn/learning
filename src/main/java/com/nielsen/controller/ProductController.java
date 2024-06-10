package com.nielsen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nielsen.domain.Product;
import com.nielsen.domain.ProductListByCustomerRequestBody;
import com.nielsen.domain.Shopper;
import com.nielsen.domain.ShopperPersonalizedInfo;
import com.nielsen.service.ProductService;
import com.nielsen.service.ShopperService;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping("/list")
    public Iterable<Product> listProduct() {
        return productService.list();
    }
    
    @PostMapping("/save")
    public ResponseEntity saveProduct(@RequestBody Product product) {
    	productService.save(product);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    
}
