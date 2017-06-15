package edu.utn.model;

import edu.utn.model.enumerables.EnumPosicion;

public class Jugador extends Persona {

	private EnumPosicion posicion;
	private double altura;
	private int peso;
	private int calificacion;
	
	public Jugador(String nombre, String apellido, EnumPosicion posicion, double altura, int peso) {
		super(nombre, apellido);
		this.posicion = posicion;
		this.altura = altura;
		this.peso = peso;
	}
 
	public EnumPosicion getPosicion() {
		return posicion;
	}

	public void setPosicion(EnumPosicion posicion) {
		this.posicion = posicion;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	

	
}
