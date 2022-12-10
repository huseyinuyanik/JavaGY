package com.turkcell.TeknikServis.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// satılan ürünlerin tablosu

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Sale
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private double price;
	
	@Column(length = 100)
	private String note;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "sale")
    @OnDelete(action = OnDeleteAction.CASCADE)
	private List<Product> product;

}