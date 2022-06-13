package Condiciones.Medico;

import Clases.Medico;

public class FiltroEspecialidad extends FiltroMedico {
	
	private String especialidad;

	public FiltroEspecialidad(String especialidad) {
		super();
		this.especialidad = especialidad;
	}

	@Override
	public boolean seCumple(Medico m) {
		return m.getEspecialidad().equals(especialidad);
	}
	
	

}
