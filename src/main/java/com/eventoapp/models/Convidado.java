package com.eventoapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_convidado")
public class Convidado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String rg;
	private String nome;
	
	@ManyToOne
	private Events eventos;
	
	
	public Convidado() {
		super();
	}


	public Convidado(Long id, String rg, String nome) {
		super();
		this.id = id;
		this.rg = rg;
		this.nome = nome;
	}


	public Long getId() {
		return id;
	}



	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Events getEventos() {
		return eventos;
	}


	public void setEventos(Events eventos) {
		this.eventos = eventos;
	}
	
	

}
