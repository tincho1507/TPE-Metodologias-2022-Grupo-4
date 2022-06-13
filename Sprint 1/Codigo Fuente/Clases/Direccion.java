package Clases;

public class Direccion {
	
	private String calle;
	private int numero;
	private String ciudad;
	
	public Direccion(String calle, int numero, String ciudad) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public int getNumero() {
		return numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}
	
	
	
	

}
