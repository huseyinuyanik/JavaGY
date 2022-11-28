package com.turkcell.SpringBootHibernateJPA.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.SpringBootHibernateJPA.model.Ogrenci;
import com.turkcell.SpringBootHibernateJPA.service.OgrenciService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path="ogrenci")
@AllArgsConstructor
public class OgrenciController {
	
	private OgrenciService ogrenciService;
	
	
	public List<Ogrenci> getAll(){
		
		return ogrenciService.getAll();

	}
	
	@GetMapping("/getById")
	public ResponseEntity<Ogrenci>  getById(Long id) {
		if(Objects.nonNull(id)){

			return ResponseEntity.ok(ogrenciService.getById(id)) ;
			
		}
			return  ResponseEntity.badRequest().build();
			
		}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(Ogrenci ogrenci) throws Exception{
		
		if((Objects.nonNull(ogrenci))){
			
			ogrenciService.add(ogrenci);
			
		return ResponseEntity.ok("Eklendi");	
			
		}
		
		return ResponseEntity.badRequest().build();
		
		
	}
	
	@GetMapping("/searchByNumber")
	public Ogrenci searchByNumber(@RequestParam String ogrNumber) {
		return ogrenciService.findNumberLike(ogrNumber);
		
	}
	
	
	
	
		
		
	
	

}
