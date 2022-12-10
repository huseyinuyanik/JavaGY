package com.turkcell.TeknikServis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.TeknikServis.model.Booking;
import com.turkcell.TeknikServis.model.BookingDto;
import com.turkcell.TeknikServis.model.Response;
import com.turkcell.TeknikServis.service.BookingService;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "booking")
@AllArgsConstructor
//@RequiredArgsConstructor
public class BookingController
{
	// final olup requeiredargsconstructor kullanılabilir
	private BookingService service;
	
	@PostMapping(path = "save")
	public Booking save(@RequestBody Booking booking)
	{
		return service.createBooking(booking);
//		Booking temp = service.createBooking(booking);
//		temp = service.getByID(temp.getID());
//		return temp;
	}
	
	@GetMapping(path = "getById/{id}")
	public Booking getById(@PathVariable(name = "id") Long id)
	{
		return service.getByID(id);
	}
	
	@GetMapping("/deleteById")
	public void deleteByID( Long id)
	{
	service.deleteByID(id);
	
	}
	
	@GetMapping("/getAllByDateAsc")
	public List<Booking> getAllByDateAsc(){
		return service.getAllByDateAsc();
	}
	
	@GetMapping("/getAllByDateDesc")
	public List<Booking> OrderByBOOKINGDATEDesc(){
		return service.OrderByBOOKINGDATEDesc();
		
	}
	
	@GetMapping("/findByBookingLikeName")
	public List<Booking> findByBookingLikeName(String name) {
		return service.findByBookingLikeName(name);
		
		
	}
	@PutMapping("/isCompleted")
	public void isCompleted(Long id, BookingDto bookingDto) {
		
		
	}
}