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
@Table(name="attendees")
public class Attendee {
       
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
    @NotBlank(message= "attendee name is required")
    private String attendeeName;
    
    
    
    
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;




	public Attendee() {
		
	}




	public Attendee(@NotBlank(message = "attendee name is required") String attendeeName, Event event) {
		super();
		this.attendeeName = attendeeName;
		this.event = event;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getAttendeeName() {
		return attendeeName;
	}




	public void setAttendeeName(String attendeeName) {
		this.attendeeName = attendeeName;
	}




	public Event getEvent() {
		return event;
	}




	public void setEvent(Event event) {
		this.event = event;
	}
    
}
