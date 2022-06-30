package Errores;

public class Error {
	
	private static String error0 = "El medico no trabaja en la obra social tuya.";
	private static String error1 = "No hay turnos disponibles, desea ver los de la siguiente semana? 1-Si 2-No";
	private static String error2 = "Datos no confirmados.";
	private static String error3 = "El numero de turno ingresado no existe.";
	private static String error4 = "No hay turnos disponibles.";
	private static String error5 = "El medico seleccionado no existe.";
	private static String error6 = "No hay medicos disponibles.";
	private static String error7= "La opcion ingresada no es valida.";
	private static String error8 = "Usuario y contraseña invalidos. ";
	
	public static void getError0() {
		System.out.println(error0);
	}
	
	public static void getError1() {
		System.out.println(error1);
	}
	public static void getError2() {
		System.out.println(error2);
	}
	public static void getError3() {
		System.out.println(error3);	
	}
	public static void getError4() {
		System.out.println(error4);	
	}
	public static void getError5() {
		System.out.println(error5);	
	}
	public static void getError6() {
		System.out.println(error6);	
	}
	public static void getError7() {
		System.out.println(error7);	
	}
	public static void getError8(int i) {
		System.out.println(error8 + i + " de 3 intentos");
	}
	
	
}
