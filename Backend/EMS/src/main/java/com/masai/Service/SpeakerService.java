package com.masai.Service;

import java.util.List;

import com.masai.Entity.Speaker;

public interface SpeakerService {
   public Speaker addSpeaker(Speaker speaker);
   
   public Speaker getSpeakerById(Long id);
   
   
   public List<Speaker> getAllSpeaker();
   
   public Speaker deleteSpeakerById(Long id);
   
}
