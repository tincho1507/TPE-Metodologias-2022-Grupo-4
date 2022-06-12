package Clases;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Turno {
	
	private LocalDateTime fecha;
	private int duracion;
	private Medico medico;
	private Paciente paciente;
	
	public Turno(LocalDateTime fecha, int duracion, Medico medico, Paciente paciente) {
		super();
		this.fecha = fecha;
		this.duracion = duracion;
		this.medico = medico;
		this.paciente = paciente;
	}
	
	public void setPaciente(Paciente p) {
		this.paciente = p;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public boolean turnoDisponible() {
		return (paciente == null);
	}
	
	public boolean tieneMedico(Medico m) {
		return (medico.getNroMatricula() == m.getNroMatricula());
	}
	
	public boolean esMatutino(int turno){
		if (turno == 1)
		  return fecha.getHour() <= 12 ;
		else  return fecha.getHour() >= 12;
	}
	
	public boolean estaEnRango(LocalDate f1, LocalDate f2) {

		LocalDate fechaTurno = this.fecha.toLocalDate();
		return (fechaTurno.isAfter(f1) && fechaTurno.isBefore(f2));
	}
	
	@Override
	public String toString() {
		return "fecha=" + fecha + ", duracion=" + duracion + ", medico=" + medico + ", paciente=" + paciente;
	}
	
	public LocalDateTime getFecha(){
		return this.fecha;
	}
	

}
