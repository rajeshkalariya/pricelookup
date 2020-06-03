package com.modeln.gp.pricelookup.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.modeln.gp.pricelookup.domain.Product;
import com.modeln.gp.pricelookup.service.ProductService;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(path="/getProduct", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = MediaType.ALL_VALUE)
	public Product getProduct(@RequestParam("product") String product) {
		System.out.println("Product is : "+product);
		return productService.getProduct(product);
	} 
}
