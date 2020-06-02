package com.modeln.gp.pricelookup.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modeln.gp.pricelookup.domain.Price;
import com.modeln.gp.pricelookup.service.PriceService;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {
	
	@Autowired
	private PriceService priceService;

	@GetMapping(path = "/{productId}")
	public List<Price> getPrice(@PathVariable Long productId) {
		List<Price> list = new ArrayList<Price>();
		Price price = new Price();
		price.setId(1L);
		price.setPrice(5.5);
		//price.setProduct("0111222333");
		price.setPriceType("AMP-Monthly");
		price.setProductionDate(new Date());
		price.setObsoleteDate(new Date());
		
		list.add(price);
		return list;
	}
	
	@PostMapping
	public Price createPrice(@RequestBody Price price) {
		return priceService.save(price);
	}
}
