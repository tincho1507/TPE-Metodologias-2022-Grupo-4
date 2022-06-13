package Condiciones.Turno;

import java.time.LocalDate;

import Clases.Turno;

public class FiltroRango extends FiltroTurno{
	
	private LocalDate fecha1;
	private LocalDate fecha2;
	
	public FiltroRango(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	@Override
	public boolean seCumple(Turno t) {

		return t.estaEnRango(fecha1, fecha2);
	}
	
	
	

}
