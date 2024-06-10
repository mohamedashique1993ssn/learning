package com.nielsen.service;

import org.springframework.stereotype.Service;

import com.nielsen.domain.Shopper;
import com.nielsen.repo.ShopperRepository;


import java.util.List;

@Service
public class ShopperService {

    private final ShopperRepository shopperRepository;

    public ShopperService(ShopperRepository shopperRepository) {
        this.shopperRepository = shopperRepository;
    }

    public Iterable<Shopper> list() {
        return shopperRepository.findAll();
    }

    public Shopper save(Shopper shopper) {
        return shopperRepository.save(shopper);
    }

    public void save(List<Shopper> shopper) {
    	shopperRepository.saveAll(shopper);
    }
}
