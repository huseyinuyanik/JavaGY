package com.turkcell.SpringBootHibernateJPA.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@javax.persistence.Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Ogretmen
{
	// bigint
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;

	@Column(length = 100)
	private String NAME;

	

	
}