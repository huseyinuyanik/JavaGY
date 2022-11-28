package com.turkcell.SpringBootHibernateJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.turkcell.SpringBootHibernateJPA.model.Ders;
import com.turkcell.SpringBootHibernateJPA.model.DersDTO;
import com.turkcell.SpringBootHibernateJPA.repo.DersRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DersService
{
	
	private DersRepository dersRepository;
	
	
	public List<Ders> getAll()
	{
		return dersRepository.findAll();
	}
	
	
	public Optional<Ders> getByID(long id)
	{
		
		return dersRepository.findById(id);
	}

	public boolean save(DersDTO dersDTO)
	{
		return false;
//		try
//		{
//			return repo.save(ders);
//		}
//		catch (Exception e)
//		{
//			return false;
//		}
	}
}
