package com.turkcell.SpringBootHibernateJPA.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DersDTO
{
	private String name;
	
	private String ogretmen;
	
	private String konu;
}