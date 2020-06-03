package com.modeln.gp.pricelookup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modeln.gp.pricelookup.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query("SELECT p from Product p where p.product =:product or p.productName =:productName")
	Product findByProductOrProductName(String product, String productName);
}
