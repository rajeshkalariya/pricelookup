package com.modeln.gp.pricelookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modeln.gp.pricelookup.domain.Price;
import com.modeln.gp.pricelookup.dto.SearchQuery;
import com.modeln.gp.pricelookup.repository.PriceRepository;

@Service
public class PriceService {

	@Autowired
	private PriceRepository priceRepository;
	
	public Price save(Price price) {
		return priceRepository.save(price);
	}
	
	public Price findById(Long id) {
		Optional<Price> priceOpt = priceRepository.findById(id);
		return priceOpt.get();
	}
	
	public List<Price> search(SearchQuery searchQuery) {
		return null;
	}
}
