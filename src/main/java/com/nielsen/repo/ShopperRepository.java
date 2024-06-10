package com.nielsen.repo;

import org.springframework.data.repository.CrudRepository;

import com.nielsen.domain.Shopper;

public interface ShopperRepository extends CrudRepository<Shopper, String> {

}
