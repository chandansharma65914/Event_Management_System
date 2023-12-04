package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entity.Speaker;

public interface SpeakerRepo extends JpaRepository<Speaker, Long> {

}
