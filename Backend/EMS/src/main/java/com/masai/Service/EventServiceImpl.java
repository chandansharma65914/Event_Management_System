package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Event;
import com.masai.Repository.EventRepo;
@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepo eventRepo;
	
	
	public Event addEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Event getEventById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Event> getAllEvent() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Event deleteEventById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
