package Errores;

public class Error {
	
	public static void getError0() {
		System.out.println("El medico no trabaja en la obra social tuya.");
	}
	
	public static void getError1() {
		System.out.println("No hay turnos disponibles, desea ver los de la siguiente semana? 1-Si 2-No");
	}
	public static void getError2() {
		System.out.println("Datos no confirmados.");
	}
	public static void getError3() {
		System.out.println("El numero de turno ingresado no existe.");	
	}
	public static void getError4() {
		System.out.println("No hay turnos disponibles.");	
	}
	public static void getError5() {
		System.out.println("El medico seleccionado no existe.");	
	}
	public static void getError6() {
		System.out.println("No hay medicos disponibles.");	
	}
	public static void getError7() {
		System.out.println("La opcion ingresada no es valida.");	
	}
	public static void getError8(int i) {
		System.out.println("Usuario y contraseña invalidos. " + i + " de 3 intentos");
	}
	
	
}
