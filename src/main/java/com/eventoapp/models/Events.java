package com.eventoapp.models;

public class Events {
	private String nome;
	private String local;
	private String date;
	private String horario;
	
	public Events() {
		
	}

	public Events(String nome, String local, String date, String horario) {
		super();
		this.nome = nome;
		this.local = local;
		this.date = date;
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	

}
