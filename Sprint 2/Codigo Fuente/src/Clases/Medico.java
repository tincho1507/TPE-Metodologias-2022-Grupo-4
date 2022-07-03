package Clases;

import java.util.ArrayList;

import Condiciones.Turno.FiltroTurno;

public class Medico extends Persona{
	
	private int nroMatricula;
	private String especialidad;
	private int horaInicio;
	private int horaFin;
	private ArrayList<Turno> turnos;
	private ArrayList<String> diasLaborales;
	private ArrayList<String> obrasSociales;
	private String usuario;
	private String contrasenia;
	
	public Medico(String nombre, String apellido, int dni, String mail, int nroMatricula, String especialidad, int horaInicio, int horaFin, ArrayList<String> diasLaborales, ArrayList<String> obrasSociales, String usuario, String contrasenia) {
		super(nombre, apellido, dni, mail);
		this.nroMatricula = nroMatricula;
		this.especialidad = especialidad;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.turnos = new ArrayList<Turno>();
		this.diasLaborales = diasLaborales;
		this.obrasSociales = obrasSociales;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	
	public void add(Turno t) {
		turnos.add(t);
	}

	public int getNroMatricula() {
		return nroMatricula;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public int getHoraFin() {
		return horaFin;
	}
	
	public boolean trabajaObraSocial(String obraSocial) {
		return obrasSociales.contains(obraSocial);
	}

	public ArrayList<Turno> listarTurnos() {
		ArrayList<Turno> salida = new ArrayList<Turno>(turnos);
		return salida;
	}

	public ArrayList<String> getDiasLaborales() {
		ArrayList<String> salida = new ArrayList<String>(diasLaborales);
		return salida;
	}

	public ArrayList<String> getObrasSociales() {
		ArrayList<String> salida = new ArrayList<String>(obrasSociales);
		return salida;
	}

	@Override
	public ArrayList<Turno> listarTurnosFiltrados(FiltroTurno f) {
		ArrayList<Turno> salida = new ArrayList<Turno>();
		for (Turno t: turnos)
			if (f.seCumple(t))
				salida.add(t);
		return salida;
	}
	
	public boolean login(String usuario, String contrasenia) {
		if ((usuario.equals(this.usuario)) && (contrasenia.equals(this.contrasenia)))
			return true;
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Medico m = (Medico)o;
			if (this.nroMatricula == m.getNroMatricula())
				return true;
			return false;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
	
	

}
