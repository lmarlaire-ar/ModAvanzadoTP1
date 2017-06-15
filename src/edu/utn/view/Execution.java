package edu.utn.view;

import edu.utn.controller.JugadorController;
import edu.utn.dao.*;
import edu.utn.model.Jugador;
import edu.utn.model.enumerables.EnumPosicion;

public class Execution {

	public static void main(String[] args) {
		// Creacion de 20 Jugadores
		JugadorController jugadorCtl = new JugadorController();
		
		//(String nombre, String apellido, EnumPosicion posicion, double altura, int peso)
		jugadorCtl.setListaJugadores(new Jugador("Nombre01", "Apellido01", EnumPosicion.Base, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre02", "Apellido02", EnumPosicion.Base, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre03", "Apellido03", EnumPosicion.Base, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre04", "Apellido04", EnumPosicion.Base, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre05", "Apellido05", EnumPosicion.AyudaBase, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre06", "Apellido06", EnumPosicion.AyudaBase, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre07", "Apellido07", EnumPosicion.AyudaBase, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre08", "Apellido08", EnumPosicion.AyudaBase, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre09", "Apellido09", EnumPosicion.Ala, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre10", "Apellido10", EnumPosicion.Ala, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre11", "Apellido11", EnumPosicion.Ala, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre12", "Apellido12", EnumPosicion.Ala, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre13", "Apellido13", EnumPosicion.AlaPivot, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre14", "Apellido14", EnumPosicion.AlaPivot, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre15", "Apellido15", EnumPosicion.AlaPivot, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre16", "Apellido16", EnumPosicion.AlaPivot, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre17", "Apellido17", EnumPosicion.Pivot, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre18", "Apellido18", EnumPosicion.Pivot, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre19", "Apellido19", EnumPosicion.Pivot, 1.98, 98));
		jugadorCtl.setListaJugadores(new Jugador("Nombre20", "Apellido20", EnumPosicion.Pivot, 1.98, 98));
		
		// Carga de 20 Jugadores en la BD
		DaoImplementation dao = new DaoImplementation();
		for (Jugador jugador : jugadorCtl.getListaJugadores()) {
			dao.insert(jugador);
		}
		
		
		// Carga de DTs en la BD
		
		// Ingreso de Calificaciones
		
		// Determinar mejores Jugadores
		
		
		
	}

}
