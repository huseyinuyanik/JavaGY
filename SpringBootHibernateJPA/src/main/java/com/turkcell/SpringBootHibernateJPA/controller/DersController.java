package com.turkcell.SpringBootHibernateJPA.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.SpringBootHibernateJPA.model.Ders;
import com.turkcell.SpringBootHibernateJPA.model.DersDTO;
import com.turkcell.SpringBootHibernateJPA.service.DersService;

@RestController
@RequestMapping(value = "ders")
public class DersController
{
	@Autowired
	public DersService service;

	// produces yazmazsam 406 hatası alabiliyorum
	@GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Ders> getAll()
	{
		// localhost:8080/ders/getAll
		ArrayList<Ders> liste = (ArrayList<Ders>) service.getAll();
		return liste;
	}
	
//	@GetMapping(path = "getAllDTO", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ArrayList<DersDTO> getAllDTO()
//	{
//		// localhost:8080/ders/getAll
//		ArrayList<DersDTO> liste = (ArrayList<DersDTO>) service.getAllDTO();
//		return liste;
//	}

	@GetMapping(path = "getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Ders>> getByIdEntity(@PathVariable Long id)
	{
		// localhost:8080/ders/getById/1
		return ResponseEntity.status(HttpStatus.OK).body(service.getByID(id));
	}

//	 @PutMapping, @PatchMapping update için kullanılabilir
	@PostMapping(path = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> save(@RequestBody DersDTO ders)
	{
		// localhost:8080/ders/save
		// { "ogr_ID": 1, "konu_ID": 1 }
		boolean result = service.save(ders);
		if (result)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body( "  başarıyla eklendi");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(  " ders eklenemedi");
		}
	}
}