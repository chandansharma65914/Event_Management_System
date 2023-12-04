package com.masai.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="speakers")
public class Speaker {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
	
	 @NotBlank(message="speaker name is required")
     private String speakerName;
	 
	 
	 @NotBlank(message="speaker bio  is required")
     private String speakerBio;
	 
	 @ManyToOne
	    @JoinColumn(name = "event_id")
	    private Event event;

	public Speaker() {
		
	}

	public Speaker(@NotBlank(message = "speaker name is required") String speakerName,
			@NotBlank(message = "speaker bio  is required") String speakerBio) {
		super();
		this.speakerName = speakerName;
		this.speakerBio = speakerBio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpeakerName() {
		return speakerName;
	}

	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}

	public String getSpeakerBio() {
		return speakerBio;
	}

	public void setSpeakerBio(String speakerBio) {
		this.speakerBio = speakerBio;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	 
}
