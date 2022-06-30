package Condiciones.Turno;

public abstract class FiltroCompuesto extends FiltroTurno{
	
	protected FiltroTurno f1;
	protected FiltroTurno f2;
	
	public FiltroCompuesto(FiltroTurno f1, FiltroTurno f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}
	

}
