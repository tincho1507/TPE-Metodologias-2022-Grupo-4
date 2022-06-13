package Condiciones.Turno;

import Clases.Medico;
import Clases.Turno;

public class FiltroTieneMedico extends FiltroTurno{
	
	private Medico m;

	public FiltroTieneMedico(Medico m) {
		super();
		this.m = m;
	}

	@Override
	public boolean seCumple(Turno t) {
		return t.tieneMedico(m);
	}
	
	

}
