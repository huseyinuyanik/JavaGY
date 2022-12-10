package com.turkcell.TeknikServis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkcell.TeknikServis.model.Sale;

@Repository
public interface SaleRepo extends JpaRepository<Sale, Long> {

	
}
