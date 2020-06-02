package com.modeln.gp.pricelookup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modeln.gp.pricelookup.domain.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
	
	

}
