package com.masai.Service;

import java.util.List;

import com.masai.Entity.Attendee;

public interface AttendeeService {
    public Attendee addAttendee(Attendee attendee);
    
    public Attendee getAttendeeById(Long id);
    
    public Attendee getAttendeeByName(String name);
    
    public List<Attendee> getAllAttendee();
    
    
    public Attendee deleteAttendeeById(Long id);
    
   
    
    
}
