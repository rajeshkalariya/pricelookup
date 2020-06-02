package com.modeln.gp.pricelookup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modeln.gp.pricelookup.domain.Price;
import com.modeln.gp.pricelookup.repository.PriceRepository;

@Service
public class ProductService {

	@Autowired
	private PriceRepository priceRepository;
	
	public Price save(Price price) {
		return priceRepository.save(price);
	}
}
