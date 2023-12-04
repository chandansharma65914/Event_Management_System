package com.masai.Service;

import java.util.List;

import com.masai.Entity.Event;

public interface EventService {
   public Event addEvent(Event event);
   
   public Event getEventById(Long id);
   
   
   
   
   public Event  deleteEventById(Long id);

public List<Event> getAllEvent();
}
