package com.eventoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventoapp.models.Events;
import com.eventoapp.repositories.EventsRepository;

@Controller
@RequestMapping(value = "/cadastrarEvento")
public class EventController {
	
	@Autowired
	private EventsRepository eventsRepository;
	

	@GetMapping
	public String form() {
		return "Evento/formEvento";
	}
	
	@PostMapping
	public String form2(Events evento) {
		eventsRepository.save(evento);
		
		return "redirect:/cadastrarEvento";
	}
	
}
