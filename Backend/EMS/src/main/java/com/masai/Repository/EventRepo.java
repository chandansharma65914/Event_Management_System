package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entity.Event;

public interface EventRepo extends JpaRepository<Event, Long> {

}
