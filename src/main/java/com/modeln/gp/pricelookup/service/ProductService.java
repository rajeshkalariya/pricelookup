package com.modeln.gp.pricelookup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modeln.gp.pricelookup.domain.Product;
import com.modeln.gp.pricelookup.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product getProduct(String product) {
		return productRepository.findByProductOrProductName(product, product);
	}
}
