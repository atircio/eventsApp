package com.eventoapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eventoapp.models.Convidado;
import com.eventoapp.models.Events;
import com.eventoapp.repositories.ConvidadoRepository;
import com.eventoapp.repositories.EventsRepository;

@Controller
@RequestMapping(value = "/cadastrarEvento")
public class EventController {

	@Autowired
	private EventsRepository eventsRepository;
	@Autowired
	private ConvidadoRepository convidadoRepository;

	@GetMapping
	public String form() {
		return "Evento/formEvento";
	}

	@PostMapping
	public String form2(Events evento) {
		eventsRepository.save(evento);

		return "redirect:/cadastrarEvento";
	}

	@GetMapping("/eventos")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("Evento/main");
		Iterable<Events> list = eventsRepository.findAll();
		return mv.addObject("eventos", list);
	}

	@GetMapping(value = "/{id}")
	public ModelAndView detalhesEvento(@PathVariable Long id) {
		Optional<Events> optionalEvents = eventsRepository.findById(id);
		Events model = optionalEvents.orElseThrow(() -> new RuntimeException("Event Not Found"));
		ModelAndView vm = new ModelAndView("Evento/detalhesEvento");
		return vm.addObject("eventos",model);
	}
	
	@PostMapping(value = "/{id}")
	public String isertConvidado(@PathVariable Long id, Convidado convidado) {
		Optional<Events> optionalEvents = eventsRepository.findById(id);
		Events model = optionalEvents.orElseThrow(() -> new RuntimeException("Event Not Found"));
		convidado.setEventos(model);
		convidadoRepository.save(convidado);
		return "redirect:/cadastrarEvento/{id}";
	}

}
