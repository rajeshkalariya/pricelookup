package com.modeln.gp.pricelookup.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.modeln.gp.pricelookup.domain.Price;
import com.modeln.gp.pricelookup.dto.SearchQuery;
import com.modeln.gp.pricelookup.service.PriceService;
import com.modeln.gp.pricelookup.service.ProductService;

@RestController
@RequestMapping(path = "/api/price")
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Price createPrice(@RequestBody Price price) {
		return priceService.save(price);
	}
	
	@RequestMapping(path = "/search", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Price> search(SearchQuery searchQuery) {
		try {
			return priceService.search(productService.getProduct(searchQuery.getProduct()),new Date(new SimpleDateFormat("MM/dd/YYYY").parse(searchQuery.getAsOfDate()).getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
