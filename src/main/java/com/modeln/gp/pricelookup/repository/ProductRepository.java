package com.modeln.gp.pricelookup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modeln.gp.pricelookup.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
