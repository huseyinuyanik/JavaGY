package com.turkcell.TeknikServis.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import com.turkcell.TeknikServis.model.Booking;
import com.turkcell.TeknikServis.model.BookingDto;
import com.turkcell.TeknikServis.model.Response;
import com.turkcell.TeknikServis.repo.BookingRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class BookingService
{
	private BookingRepo repo;

	private EntityManager entityManager;
	
	public void refresh(Booking booking)
	{
		entityManager.refresh(booking);
	}

	public Booking createBooking(Booking booking)
	{
		Booking temp = repo.save(booking);
		//refresh(temp);
		return temp;
		// return repo.getReferenceById(repo.save(booking).getID());
//		Booking temp = repo.saveAndFlush(booking);
//		repo.flush();
//		temp = repo.findById(temp.getID()).get();
//		return temp;
	}

	public Booking getByID(Long id)
	{	
		Booking booking= repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Bulunamadi."));
//		Response response= new Response();
		return booking;
	}

	public void deleteByID(Long id)
	{
		repo.deleteById(id);
	}
	
	public List<Booking> getAllByDateAsc(){
		return repo.OrderByBOOKINGDATEAsc();
	}
	
	public List<Booking> OrderByBOOKINGDATEDesc(){
		return repo.OrderByBOOKINGDATEDesc();
		
	}
	
	public List<Booking> findByBookingLikeName(String name) {
		return repo.findByBookingLikeName(name);
		
		
	}
	
	public Response isCompleted(Long id, BookingDto bookingDto) throws Exception {
		
		Booking booking= repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Bulunamadi."));
		Response response= new Response();
		response.setID(booking.getID());
		response.setCompleted(booking.isCompleted());
		
		if(booking.isCompleted()==bookingDto.isCompleted()) {
			
			throw new Exception("Degismedi.");
		}
		
		return response;
		
	}
}
