package com.masai.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="events")
public class Event {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     
     @NotBlank(message="Event name is required")
     private String eventName;
     
     @NotNull(message=" event date is required")
     @FutureOrPresent(message= "event date should be from future or present")
     private Date eventDate;
     
     @NotBlank(message="Event location is required")
     private String eventLocation;
     
     @NotBlank(message="Event description is required")
     private String eventDescription;

     @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
     private Set<Speaker> speakers = new HashSet<>();

     @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
     private Set<Attendee> attendees = new HashSet<>();

	public Event() {
		
	}

	public Event(Long id, @NotBlank(message = "Event name is required") String eventName,
			@NotNull(message = " event date is required") @FutureOrPresent(message = "event date should be from future or present") Date eventDate,
			@NotBlank(message = "Event location is required") String eventLocation,
			@NotBlank(message = "Event description is required") String eventDescription) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventLocation = eventLocation;
		this.eventDescription = eventDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
    public void addSpeaker(Speaker speaker) {
    	speakers.add(speaker);
    	speaker.setEvent(this);
    }
    public void removeSpeaker(Speaker speaker) {
    	speakers.remove(speaker);
    	speaker.setEvent(null);
    }
    public void addAttendee(Attendee attendee) {
        attendees.add(attendee);
        attendee.setEvent(this);
    }
    public void removeAttendee(Attendee attendee) {
        attendees.remove(attendee);
        attendee.setEvent(null);
    }
}
