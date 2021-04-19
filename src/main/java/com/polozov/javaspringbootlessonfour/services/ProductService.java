package com.polozov.javaspringbootlessonfour.services;

import com.polozov.javaspringbootlessonfour.entities.Product;
import com.polozov.javaspringbootlessonfour.repositories.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	private ProductDao productDao;

	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public List<Product> getAllProduct() {
		return productDao.findAll();
	}

	public Product getById(Long id) {
		return productDao.findById(id);
	}

	public void remove(Long id) {
		productDao.remove(id);
	}

	public void add(Product product) {
		productDao.add(product);
	}

	public void update(Product product) {
		productDao.update(product);
	}
}
