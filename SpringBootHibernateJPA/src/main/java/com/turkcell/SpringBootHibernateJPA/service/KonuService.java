package com.turkcell.SpringBootHibernateJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.turkcell.SpringBootHibernateJPA.model.Konu;
import com.turkcell.SpringBootHibernateJPA.repo.KonuRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class KonuService {
	
	private KonuRepository konuRepository;
	
	
	public List<Konu> getAll(){
		
		return konuRepository.findAll();
		
	}
	
	public Konu getById(long id) {
		
		return konuRepository.findById(id).get();
		
	}
	
	
	public boolean deleteById(Long id) {
		
		konuRepository.deleteById(id);
		
		return konuRepository.findById(id).isEmpty();
	}
	
	public Konu add (Konu konu) throws Exception {
		
		if(konuRepository.existsByNameIgnoreCase(konu.getName())) {
			
			throw new Exception("Konu zaten mevcut");
		}
		return konuRepository.save(konu);
		
			
	}
		
	

}
