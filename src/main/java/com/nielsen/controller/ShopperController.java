package com.nielsen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nielsen.domain.Product;
import com.nielsen.domain.Shopper;
import com.nielsen.service.ShopperService;

@RestController
@RequestMapping("/shopper")
public class ShopperController {

    private ShopperService shopperService;


    public ShopperController(ShopperService shopperService) {
        this.shopperService = shopperService;
    }
    
    @GetMapping("/list")
    public Iterable<Shopper> listRansom() {
        return shopperService.list();
    }
    
    @PostMapping("/save")
    public ResponseEntity saveShopper(@RequestBody Shopper shopper) {
    	shopperService.save(shopper);
        return ResponseEntity.ok(HttpStatus.OK);

    }

}
