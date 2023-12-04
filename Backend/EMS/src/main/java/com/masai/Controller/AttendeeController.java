package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Attendee;
import com.masai.Service.AttendeeService;

@RestController
public class AttendeeController {
        @Autowired
        private AttendeeService attendeeService;
        
        
        @GetMapping("/attendee{id}")
        public ResponseEntity<Attendee> getAttendeeById(@PathVariable Long id){
        	return new ResponseEntity<Attendee>(attendeeService.getAttendeeById(id),HttpStatus.OK);
        }
        @GetMapping("/attendee{id}")
        public ResponseEntity<List<Attendee>> getAllAttendee(@PathVariable Long id){
        	return new ResponseEntity<List<Attendee>>(attendeeService.getAllAttendee(),HttpStatus.OK);
        }
        
        @PostMapping("/attendee")
        public ResponseEntity<Attendee> addAttendee(@RequestBody Attendee attendee){
        	return new ResponseEntity<Attendee>(attendeeService.addAttendee(attendee),HttpStatus.CREATED);
        }
        
        @DeleteMapping
        public ResponseEntity<String> deleteAttendee(@PathVariable Long id){
        	attendeeService.deleteAttendeeById(id);
        	return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
        }
}
