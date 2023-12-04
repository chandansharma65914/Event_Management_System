package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entity.Attendee;

public interface AttendeeRepo extends JpaRepository<Attendee, Long> {

}
