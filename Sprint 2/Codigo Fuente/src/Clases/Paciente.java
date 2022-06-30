package Clases;

import java.util.ArrayList;
import java.util.Scanner;

import Condiciones.Medico.FiltroCompuestoAnd;
import Condiciones.Medico.FiltroEspecialidad;
import Condiciones.Medico.FiltroMedico;
import Condiciones.Medico.FiltroObraSocial;
import Condiciones.Turno.FiltroTurno;

public class Paciente extends Persona {
	
	private String obraSocial;
	private int nroAfiliado;
	private int telefono;
	private Direccion direccion;
	private ArrayList<Turno> turnos;
	
	

	public Paciente(String nombre, String apellido, int dni, String mail, String obraSocial, int nroAfiliado,
			int telefono, Direccion direccion) {
		super(nombre, apellido, dni, mail);
		this.obraSocial = obraSocial;
		this.nroAfiliado = nroAfiliado;
		this.telefono = telefono;
		this.direccion = direccion;
		this.turnos = new ArrayList<Turno>();
	}
	
	public void add(Turno t) {
		if (!turnos.contains(t))
			turnos.add(t);
	}

	@Override
	public ArrayList<Turno> listarTurnos() {
		ArrayList<Turno> salida = new ArrayList<Turno>(turnos);
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
	
	public FiltroMedico generarFiltro (Scanner selector) {
		  System.out.println("Ingrese la obra social:");
		  String obraSocial = selector.nextLine();
		  System.out.println("Ingrese la especialidad");
		  String especialidad = selector.nextLine();
		  //Creacion de filtros por especialidad y obra social
		  FiltroMedico filtroEspecialidad = new FiltroEspecialidad(especialidad);
		  FiltroMedico filtroObraSocial = new FiltroObraSocial(obraSocial);
		  FiltroMedico filtroCompuesto = new FiltroCompuestoAnd(filtroEspecialidad, filtroObraSocial);
		  return filtroCompuesto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " obraSocial=" + obraSocial + ", nroAfiliado=" + nroAfiliado + ", telefono="
				+ telefono + ", direccion=" + direccion + "]";
	}

}
