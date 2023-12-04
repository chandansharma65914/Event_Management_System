package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Attendee;
import com.masai.Repository.AttendeeRepo;

@Service
public class AttendeeServiceImpl implements AttendeeService {
           @Autowired
           private AttendeeRepo attendeeRepo;
	
	public Attendee addAttendee(Attendee attendee) {
		// TODO Auto-generated method stub
		return attendeeRepo.save(attendee);
	}

	
	public Attendee getAttendeeById(Long id) {
		// TODO Auto-generated method stub
		return  null;
	}

	
	public Attendee getAttendeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Attendee> getAllAttendee() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Attendee deleteAttendeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
