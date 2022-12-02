package com.eventoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventoapp.models.Events;

@Repository
public interface EventsRepository extends JpaRepository<Events, Long>{

}
