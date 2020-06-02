package com.modeln.gp.pricelookup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.modeln.gp.pricelookup.domain.Product;
import com.modeln.gp.pricelookup.service.ProductService;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public Product getProduct(@RequestParam("product") String product) {
		return productService.getProduct(product);
	} 
}
