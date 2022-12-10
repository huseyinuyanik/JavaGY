package com.turkcell.TeknikServis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.TeknikServis.model.Sale;
import com.turkcell.TeknikServis.service.SaleService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "sale")
@AllArgsConstructor
public class SaleController {
	
	private SaleService saleService;
	
	@GetMapping("/save")
	public Sale createSale(@RequestBody Sale sale) {
		
		return saleService.createSale(sale);
	}
	
	@GetMapping("/getAllSale")
	public List<Sale> getAllSale(){
		
		return saleService.getAllSale();
	}

}
