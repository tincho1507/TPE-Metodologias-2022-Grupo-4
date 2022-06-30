package Menu;

public class Menu {
	
	public static void printMenuGeneral() {
		System.out.println("Bienvenido a TurnoFacil");
		System.out.println("0-Paciente");
		System.out.println("1-Medico");
	}
	
	public static void printMenuPaciente() {
		System.out.println("0-Sacar turno");
		System.out.println("1-Ver sus proximos turnos");
		System.out.println("2-Salir");
	}
	
	public static void printMenuMedico() {
		System.out.println("0-Ver mis turnos");
		System.out.println("1-Salir");
	}
	
	public static void printOpcionFiltro() {
		System.out.println("Quiere filtrar a los medicos por obra social y especialidad? 1-Si 2-No");
	}
	
	public static void printNumMedico() {
		System.out.println("Ingrese el numero del medico");
	}
	
	public static void printFechaInicio() {
		System.out.println("Ingrese la fecha de inicio para su busqueda (yyyy-MM-dd)");
	}
	
	public static void printFechaFin() {
		System.out.println("Ingrese la fecha de fin para su busqueda (yyyy-MM-dd)");
	}
	
	public static void printOpcionHorario() {
		System.out.println("Desea su turno por la mañana? 1-Si 2-No");
	}
	
	

}
