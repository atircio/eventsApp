package com.eventoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventoapp.models.Convidado;
import com.eventoapp.models.Events;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{
	

	public Iterable<Convidado> findByEventos(Events model);

}


