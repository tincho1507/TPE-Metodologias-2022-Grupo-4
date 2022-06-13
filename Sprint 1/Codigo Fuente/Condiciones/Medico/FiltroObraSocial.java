package Condiciones.Medico;

import Clases.Medico;

public class FiltroObraSocial extends FiltroMedico{
	
	private String obraSocial;

	public FiltroObraSocial(String obraSocial) {
		super();
		this.obraSocial = obraSocial;
	}

	@Override
	public boolean seCumple(Medico m) {
		return m.trabajaObraSocial(obraSocial);
	}
	
	

}
