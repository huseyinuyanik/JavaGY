package com.turkcell.SpringBootHibernateJPA.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.SpringBootHibernateJPA.model.Konu;
import com.turkcell.SpringBootHibernateJPA.service.KonuService;

@RestController
@RequestMapping(value = "konu")
public class KonuController {
	
	KonuService konuService;
	
	
	
	public KonuController(KonuService konuService) {
		
		this.konuService = konuService;
	}

	@GetMapping("/getAll")
	public List<Konu> getAll() {
		
		return konuService.getAll();
		
		
	}
	
	@GetMapping("/getById")
	public ResponseEntity<Konu>  getById(Long id) {
		if(Objects.nonNull(id)){
			
			
			return ResponseEntity.ok(konuService.getById(id)) ;
		}
		else {
			
			return  ResponseEntity.badRequest().build();
			
		}
		
			
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@RequestParam Long id){
		if(konuService.deleteById(id)) {
			
			
			
			return ResponseEntity.status(HttpStatus.OK).body("Başarı ile silindi");
			
		}
		else {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Silinemedi");
		}
			
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(Konu konu) throws Exception{
		
		if((Objects.nonNull(konu))){
			
			konuService.add(konu);
			
		return ResponseEntity.ok("Eklendi");	
			
		}
		
		return ResponseEntity.badRequest().build();
		
		
	}

}
