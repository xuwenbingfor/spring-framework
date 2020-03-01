package com.jz.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert() {
		String sql = "insert into product (name,price) values (?,?)";
		String name = "蔚来 " + UUID.randomUUID().toString();
		Double price = 100.0;
		jdbcTemplate.update(sql, name, price);
	}
}
