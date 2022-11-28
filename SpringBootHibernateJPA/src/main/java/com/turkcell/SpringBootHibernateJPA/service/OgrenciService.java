package com.turkcell.SpringBootHibernateJPA.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.turkcell.SpringBootHibernateJPA.model.Ogrenci;
import com.turkcell.SpringBootHibernateJPA.repo.OgrenciRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OgrenciService {
	
	private OgrenciRepository ogrenciRepository;
	
	
	public List<Ogrenci> getAll() {
		
		return ogrenciRepository.findAll();
	}
	
	
	public Ogrenci getById(Long id) {
		
		return ogrenciRepository.findById(id).get();
	}
	
	
	
	public Ogrenci add(Ogrenci ogrenci) throws Exception {
		
		if(ogrenciRepository.existsByNameIgnoreCase(ogrenci.getName())) {
			
			throw new Exception("Ogrenci zaten mevcut");
		}
		return ogrenciRepository.save(ogrenci);
		
		}
	
	
	
	public Ogrenci findNumberLike(String ogrNumber) {
		
		return ogrenciRepository.findByOgrNumberLike(ogrNumber);
		
	}

}
