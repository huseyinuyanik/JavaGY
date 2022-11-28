package com.turkcell.SpringBootHibernateJPA.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turkcell.SpringBootHibernateJPA.model.Ogretmen;
import com.turkcell.SpringBootHibernateJPA.repo.OgretmenRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OgretmenService
{
	private OgretmenRepository repo;

	public List<Ogretmen> getAll()
	{
		return repo.findAll();
	}

	public Ogretmen getByID(long id)
	{
		// optional özellikleri kullanılabilir
		return repo.findById(id).orElse(null);
	}

	public boolean delete(Long id)
	{
		repo.deleteById(id);
		return repo.findById(id).isEmpty();
	}

	public Ogretmen save(Ogretmen ogretmen)
	{
		try
		{
			return repo.save(ogretmen);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			return null;
		}
	}

	public List<Ogretmen> findNameLike(String expression)
	{
		// select * from obsh.ogretmen where NAME like '%an%'
		// 1 tane bulmak içinm findByNAME olabilirdi
		// return repo.findAllByNAMELike("%" + expression + "%", Sort.by(Order.desc("ID")));
		// return repo.findAllByNAMELikeOrderByNAMEAsc("%" + expression + "%");
		// return repo.findByNAMELike("%" + expression + "%");
		return repo.searchByName(expression);
	}
}
