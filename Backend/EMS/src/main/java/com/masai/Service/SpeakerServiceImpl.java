package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Speaker;
import com.masai.Repository.SpeakerRepo;

@Service
public class SpeakerServiceImpl implements SpeakerService {
	        @Autowired
            private SpeakerRepo speakerRepo;
            
            
	
	public Speaker addSpeaker(Speaker speaker) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Speaker getSpeakerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Speaker> getAllSpeaker() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Speaker deleteSpeakerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
