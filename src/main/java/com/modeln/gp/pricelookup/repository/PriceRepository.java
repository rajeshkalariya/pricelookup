package com.modeln.gp.pricelookup.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modeln.gp.pricelookup.domain.Price;
import com.modeln.gp.pricelookup.domain.Product;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
	
	@Query("SELECT p from Price p where p.Product =:product AND :asOfDate between p.productionDate AND p.obsoleteDate")
	List<Price> search(Product product, Date asOfDate);

}
