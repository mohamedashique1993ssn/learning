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
import com.nielsen.service.ShelfService;
import com.nielsen.service.ShopperService;

@RestController
@RequestMapping("/shelf")
public class ShelfController {

    private ShelfService shelfService;
    
    public ShelfController(ShelfService shelfService) {
        this.shelfService = shelfService;
    }

    @PostMapping("/save")
    public ResponseEntity saveProduct(@RequestBody ShopperPersonalizedInfo shopperPersonalizedInfo) {
    	shelfService.saveShelfInfo(shopperPersonalizedInfo);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    
    @PostMapping("/listBy/shopper")
    public Iterable<Product> listProductByShopper(
    		@RequestParam String shopperId,
    		@RequestParam(required = false) String brand,
    		@RequestParam(required = false) String category,
    		@RequestParam(required = false) String limit) {
    	return shelfService.listProductsByCustomerId(shopperId, brand, category, limit);
    }
    
}
