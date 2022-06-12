package Condiciones.Turno;

import Clases.Turno;

public class FiltroTurnoAnd extends FiltroCompuesto{

	public FiltroTurnoAnd(FiltroTurno f1, FiltroTurno f2) {
		super(f1, f2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean seCumple(Turno t) {
		return f1.seCumple(t) && f2.seCumple(t);
	}
	
	

}
