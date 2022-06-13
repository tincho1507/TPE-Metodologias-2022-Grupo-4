package Condiciones.Medico;

import Clases.Medico;

public class FiltroCompuestoOr extends FiltroCompuesto {

	public FiltroCompuestoOr(FiltroMedico f1, FiltroMedico f2) {
		super(f1, f2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean seCumple(Medico m) {
		return f1.seCumple(m) || f2.seCumple(m);
	}

}
