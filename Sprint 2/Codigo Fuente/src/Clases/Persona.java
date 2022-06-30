package Clases;

import java.util.ArrayList;

import Condiciones.Turno.FiltroTurno;

public abstract class Persona {

	private String nombre;
	private String apellido;
	private int dni;
	private String mail;
	private String obraSocial;
	public Persona(String nombre, String apellido, int dni, String mail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.mail = mail;
	}
	
	public String getObraSocial() {
		return this.obraSocial;
	}
	
	public String getNombre() {
		return nombre;
	}

	protected String getApellido() {
		return apellido;
	}

	protected int getDni() {
		return dni;
	}

	protected String getMail() {
		return mail;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public abstract ArrayList<Turno> listarTurnos();
	
	public abstract ArrayList<Turno> listarTurnosFiltrados(FiltroTurno c);
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", mail=" + mail + ",";
	}
}
