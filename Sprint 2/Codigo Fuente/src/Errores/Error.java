package Errores;

public class Error {
	
	public static void getError(int error, int cantidad) {
		switch (error) {
			case 0 : 
				System.out.println("El medico no trabaja en la obra social tuya.");
				break;
			case 1 : 
				System.out.println("No hay turnos disponibles, desea ver los de la siguiente semana? 1-Si 2-No");
				break;
			case 2 : 
				System.out.println("Datos no confirmados.");
				break;
			case 3 : 
				System.out.println("El numero de turno ingresado no existe.");
				break;
			case 4 : 
				System.out.println("No hay turnos disponibles.");
				break;
			case 5 : 
				System.out.println("El medico seleccionado no existe.");
				break;
			case 6 : 
				System.out.println("No hay medicos disponibles.");
				break;
			case 7 :
				System.out.println("La opcion ingresada no es valida.");
				break;
			case 8 :
				System.out.println("Usuario y contraseña invalidos. " + cantidad + " de 3 intentos");
				break;
		}
	
	
	
	}	
}
