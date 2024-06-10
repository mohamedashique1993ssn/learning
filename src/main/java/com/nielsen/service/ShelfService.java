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
public class ShelfService {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Iterable<Product> listProductsByCustomerId(String shopperId, String brand, String category, String limit) {
		
		String query = "select product_id from shelf where shopper_id= ?";

		List<String> data = jdbcTemplate.query(query, new Object[] { shopperId }, new RowMapper<String>() {
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
		});

		String inSql = String.join(",", Collections.nCopies(data.size(), "?"));

		List<Product> products = jdbcTemplate.query(
				String.format("select * from product where product_id in (%s)", inSql), data.toArray(),
				(rs, rowNum) -> new Product(rs.getString("product_id"), rs.getString("name"), rs.getString("category"),
						rs.getString("brand")));

		if (!(brand==null) && category==null && limit==null)
			return products.stream().filter(p -> p.getBrand().contentEquals(brand)).toList();
		if (!(category==null) && brand==null && limit==null)
			return products.stream().filter(p -> p.getCategory().contentEquals(category)).toList();
		if (!(limit==null) && category==null && brand==null)
			return products.stream().limit(Integer.valueOf(limit)).toList();
		else if (!(brand==null) && !(category==null) && limit==null)
			return products.stream().filter(p -> p.getBrand().contentEquals(brand)).filter(p -> p.getCategory().contentEquals(category)).toList();
		else if (!(brand==null) && !(category==null) && !(limit==null))
			return products.stream().filter(p -> p.getBrand().contentEquals(brand)).filter(p -> p.getCategory().contentEquals(category)).limit(Integer.valueOf(limit)).toList();
		else
			return products;
	}

	public void saveShelfInfo(ShopperPersonalizedInfo shopperPersonalizedInfo) {
		List<Shelf> lst = shopperPersonalizedInfo.getShelf();
		for (Shelf sh : lst) {
			System.out.println(1);
			jdbcTemplate.update("INSERT INTO shelf(shopper_id, product_id,relevancy_score) VALUES (?,?,?)",
					shopperPersonalizedInfo.getShopperId(), sh.getProductId(), sh.getRelevancyScore());

		}
	}
}
