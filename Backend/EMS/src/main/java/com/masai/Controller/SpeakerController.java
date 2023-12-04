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
import com.masai.Entity.Speaker;
import com.masai.Service.SpeakerService;

@RestController
public class SpeakerController {
	  @Autowired
      private SpeakerService speakerService;
      
      
      @GetMapping("/speaker{id}")
      public ResponseEntity<Speaker> getSpeakerById(@PathVariable Long id){
      	return new ResponseEntity<Speaker>(speakerService.getSpeakerById(id),HttpStatus.OK);
      }
      @GetMapping("/attendee{id}")
      public ResponseEntity<List<Speaker>> getAllSpeaker(@PathVariable Long id){
      	return new ResponseEntity<List<Speaker>>(speakerService.getAllSpeaker(),HttpStatus.OK);
      }
      
      @PostMapping("/attendee")
      public ResponseEntity<Speaker> addSpeaker(@RequestBody Speaker speaker){
      	return new ResponseEntity<Speaker>(speakerService.addSpeaker(speaker),HttpStatus.CREATED);
      }
      
      @DeleteMapping
      public ResponseEntity<String> deleteSpeaker(@PathVariable Long id){
      speakerService.deleteSpeakerById(id);
      	return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
      }
}
