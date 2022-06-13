package Condiciones.Medico;


public abstract class FiltroCompuesto extends FiltroMedico {
	
	protected FiltroMedico f1;
	protected FiltroMedico f2;

	public FiltroCompuesto(FiltroMedico f1, FiltroMedico f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

}
