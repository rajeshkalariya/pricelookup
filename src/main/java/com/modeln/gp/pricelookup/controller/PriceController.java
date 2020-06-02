package com.modeln.gp.pricelookup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modeln.gp.pricelookup.domain.Price;
import com.modeln.gp.pricelookup.dto.SearchQuery;
import com.modeln.gp.pricelookup.service.PriceService;

@RestController
@RequestMapping(path = "/api/price")
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@PostMapping
	public Price createPrice(@RequestBody Price price) {
		return priceService.save(price);
	}
	
	@GetMapping(path = "/search")
	public List<Price> search(@RequestBody SearchQuery search) {
		return priceService.search(search);
	}
}
