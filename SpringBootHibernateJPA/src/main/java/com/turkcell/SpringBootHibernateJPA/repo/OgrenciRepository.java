package com.turkcell.SpringBootHibernateJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.turkcell.SpringBootHibernateJPA.model.Ogrenci;

public interface OgrenciRepository extends JpaRepository<Ogrenci, Long> {
	
	boolean existsByNameIgnoreCase(String name);
			
	@Query(name = "findByOgrNumber", value = "SELECT * FROM obsh.ogrenci WHERE ogrNumber LIKE %:ogrNo%", nativeQuery = true)
	public Ogrenci findByOgrNumberLike(@Param("ogrNo")String ogrNo);

}
