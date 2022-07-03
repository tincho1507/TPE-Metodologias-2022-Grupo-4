package Clases;

import java.util.ArrayList;

import Condiciones.Medico.FiltroMedico;
import Condiciones.Turno.*;


public class InstitucionMedica {
	
	private String nombre;
	private ArrayList<Medico> medicos;
	private ArrayList<Paciente> pacientes;
	
	public InstitucionMedica(String nombre) {
		super();
		this.nombre = nombre;
		this.medicos = new ArrayList<Medico>();
		this.pacientes = new ArrayList<Paciente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	public ArrayList<Turno> mostrarTurnosDisponibles(FiltroTurno ft, Medico m){
		ArrayList<Turno> turnosEnRango = new ArrayList<>();
		for (Turno t: m.listarTurnos()){
			
			if (t.turnoDisponible() && ft.seCumple(t)){
				turnosEnRango.add(t);
			}
		}

		return turnosEnRango;
	}


	public void addMedico(Medico m) {
		if (!medicos.contains(m))
			medicos.add(m);
	}
	
	public void addPaciente(Paciente p) {
		if (!pacientes.contains(p))
			pacientes.add(p);
	}
	
	public ArrayList<Medico> listarMedicos(){
		ArrayList<Medico> salida = new ArrayList<Medico>(medicos);
		return salida;
	}
	
	public ArrayList<Medico> listarMedicosFiltro(FiltroMedico f){
		ArrayList<Medico> salida = new ArrayList<Medico>();
			if (f == null){
				return salida = new ArrayList<>(medicos);
			} else {
				for (Medico m: medicos)
					if (f.seCumple(m))
						salida.add(m);
				return salida;
			}	
	
	}
	
	public Medico getMedico(String usuario, String contrasenia) {
		for (Medico m: medicos) {
			if (m.login(usuario, contrasenia))
				return m;
		}
		return null;
	}
	

	

}
