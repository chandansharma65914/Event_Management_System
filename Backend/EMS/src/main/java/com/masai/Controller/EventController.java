package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Event;
import com.masai.Service.EventService;

@RestController
public class EventController {
    
	@Autowired
	private EventService eventService;
	
	@GetMapping("/events")
	public ResponseEntity<List<Event>> getAllEvents(){
		List<Event> list= eventService.getAllEvent();
		
		return new ResponseEntity<List<Event>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/evnts/{id}")
	public ResponseEntity<Event> getEventByEventId(@PathVariable Long id){
		Event event= eventService.getEventById(id);
		
		return new ResponseEntity<Event>(event,HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Event> createEvent(@Validated @RequestBody Event event){
		return new ResponseEntity<Event>(eventService.addEvent(event),HttpStatus.CREATED);
		
	}
	@PutMapping("/events/{id}")
	public ResponseEntity<Event> updateEvent(@PathVariable Long id,@Validated @RequestBody Event event){
	
		return null;
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEvent(@PathVariable Long id){
		 eventService.deleteEventById(id);
		 return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
	
}
