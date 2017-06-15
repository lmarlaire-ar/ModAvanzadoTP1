package edu.utn.controller;

import java.util.ArrayList;

import edu.utn.model.Jugador;

public class JugadorController {
	
	private ArrayList<Jugador> listaJugadores;

	public JugadorController() {
		this.listaJugadores = new ArrayList<Jugador>();
	}

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(Jugador jugador) {
		this.listaJugadores.add(jugador);
	}
	
	

}
