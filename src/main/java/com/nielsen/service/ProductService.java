package com.nielsen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.nielsen.domain.Product;
import com.nielsen.domain.ProductListByCustomerRequestBody;
import com.nielsen.domain.Shelf;
import com.nielsen.domain.ShopperPersonalizedInfo;
import com.nielsen.repo.ProductRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Iterable<Product> list() {
		return productRepository.findAll();
	}

	public Product save(Product product) {
		return productRepository.save(product);
	}

	public void save(List<Product> product) {
		productRepository.saveAll(product);
	}
}
