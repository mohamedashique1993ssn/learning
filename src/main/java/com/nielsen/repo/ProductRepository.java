package com.nielsen.repo;

import org.springframework.data.repository.CrudRepository;

import com.nielsen.domain.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
