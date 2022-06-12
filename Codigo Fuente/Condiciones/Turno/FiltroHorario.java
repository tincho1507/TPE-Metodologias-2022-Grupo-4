package Condiciones.Turno;


import Clases.Turno;

public class FiltroHorario extends FiltroTurno{
	
	int turno;

	public FiltroHorario(int turno) {
		super();
		this.turno = turno;
	}

	@Override
	public boolean seCumple(Turno t) {
			return t.esMatutino(turno);

		}
}
	
	


